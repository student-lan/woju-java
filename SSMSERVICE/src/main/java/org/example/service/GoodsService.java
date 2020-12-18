package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.example.Goods;

import java.util.List;

@Repository
public interface GoodsService {
     public List<Goods> findall();
}
