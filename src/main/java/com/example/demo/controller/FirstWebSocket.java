package com.example.demo.controller;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

@ServerEndpoint(value = "/websocket")
@Component
public class FirstWebSocket {
    Logger logger=Logger.getLogger("FirstWebSocket.class");

    public static int onlineCount=0;

    public static CopyOnWriteArraySet<FirstWebSocket> webSocketSet=new CopyOnWriteArraySet<>();
    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。

    private Session session;//与某个客户端的连接会话

    /**
     * 连接建立成功调用的方法
     * @param session
     */
    @OnOpen
    public void onOpen(Session session){
        this.session=session;
        webSocketSet.add(this);
        addOnlineCount();
        logger.info("在线人数加一");
//        try{
//            sendMessage(CommonCons);
//        }
//        catch (){
//
//        }
    }

    @OnClose
    public void onclose(){
        webSocketSet.remove(this);
        subOnlineCount();
        logger.info("在线人数减一");
    }

    @OnMessage
    public void onMessage(String message,Session session){
        logger.info("来自客户端的消息"+message);//来自客户端的消息

        //群发消息
        for(FirstWebSocket item:webSocketSet){
            try{
                item.sendMessage(message);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @OnError
    public void onError(Session session,Throwable throwable){
        logger.warning("发生错误");
        throwable.printStackTrace();
    }

    /**
     * 群发自定义消息
     * */
    public static void sendInfo(String message) throws IOException {
        for (FirstWebSocket item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                continue;
            }
        }
    }
    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        FirstWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        FirstWebSocket.onlineCount--;
    }

    public void sendMessage(String message)throws IOException {
        this.session.getBasicRemote().sendText(message);
    }
}
