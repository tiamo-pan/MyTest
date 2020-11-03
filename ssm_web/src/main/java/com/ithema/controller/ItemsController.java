package com.ithema.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*和商品页面交互*/
@Controller
@RequestMapping("/items")
public class ItemsController {

    //注入的service依赖
    @Autowired
    private ItemsService itemsService;

    //查询所有商品
    @RequestMapping("/all")
    public String queryAll(Model model){
        model.addAttribute("items",itemsService.queryAll());
        return "items";
    }

    //增加商品
    @RequestMapping("/save")
    public String add(Items items){
        itemsService.add(items);
        return "redirect:./all";
    }

}
