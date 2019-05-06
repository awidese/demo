package com.example.demo.service;

import com.example.demo.dao.PlayerDao;
import com.example.demo.entry.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    PlayerDao playerDao;

    @Override
    public List<Player> findAll() {
        return playerDao.findAll();
    }
}
