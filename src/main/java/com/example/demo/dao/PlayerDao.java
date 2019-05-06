package com.example.demo.dao;

import com.example.demo.entry.Player;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlayerDao {
    List<Player> findAll();
}
