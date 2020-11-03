package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//处理商品业务逻辑的接口的实现类
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    //注入dao层的代理对象
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> queryAll() {
        return itemsDao.queryAll();
    }

    @Override
    public int add(Items items) {
        return itemsDao.add(items);
    }
}
