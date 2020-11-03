package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    public static void main(String[] ags) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        ItemsDao itemsDao = app.getBean("itemsDao", ItemsDao.class);
        List<Items> items = itemsDao.queryAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
