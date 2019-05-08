$(document).ready(function() {
    alert("hello");
    var webSocket = null;
    var path = window.location.host;
    if ('WebSocket' in window) {
        webSocket = new WebSocket("ws://"+path+"/websocket");
    } else {
        alert("您的浏览器不支持");
    }

    webSocket.onerror = function () {
        setMessageInnerHTML("错误");
    }

    webSocket.onopen = function (event) {
        setMessageInnerHTML("连接服务器正常");
    }

    webSocket.onmessage = function (event) {
        setMessageInnerHTML("接收到消息");
        $("#talk").append("<p style='color: #2b542c'>"+event.data+"</p>")
    }

    webSocket.onclose = function () {
        setMessageInnerHTML("断开连接");
    }

    window.onbeforeunload = function () {
        webSocket.close();
    }

    function setMessageInnerHTML(innerHTML) {
        $("#status").html(innerHTML);
    }

    function closeWebSocket() {
        webSocket.close();
    }

    function send() {
        var message = $("#inputMessage").val();
    }

    $("#logout").click(function () {
        webSocket.close();
        $.ajax({
            url:'/logout',
            async:false,
            success:function (result) {
                if (result=="200") {
                    alert("退出成功");
                    location.href = '../loginpage';
                }
            }
        })
    })

    $("#enter").click(function () {
        var message = $("#inputMessage").val();
        webSocket.send(message);
        $("#inputMessage").v
    })
})
