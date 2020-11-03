package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/*dao层映射器*/
public interface ItemsDao {
    /*查询所有商品*/
    List<Items> queryAll();

    /*增加商品*/
    int add(Items items);

}
