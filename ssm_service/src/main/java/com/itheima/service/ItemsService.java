package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

//service处理商品业务逻辑的接口
public interface ItemsService {
    //查询所有
    List<Items> queryAll();

    //添加商品
    int add(Items items);
}
