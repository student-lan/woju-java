package org.example.service;

import org.example.Goods;
import org.example.dao.GoodsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodsService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public List<Goods> findall() {
        return goodsDAO.findall();
    }
}
