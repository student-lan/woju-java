package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDAO {
    //@Select("select * from goods where id = #{id}")
    public List<Goods> findall();
}
