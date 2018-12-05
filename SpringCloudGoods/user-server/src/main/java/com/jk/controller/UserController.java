package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/test")
    public  List<LinkedHashMap> test(){
       List<LinkedHashMap> list= userService.findUser();
        return list;
    }


    //(查询树)
    @RequestMapping("/getNavTree")
    @ResponseBody
    List<TreeBean> getNavTree(){
        return userService.getNavTree();
    }



    //(查询树)
    @RequestMapping("/queryBookInfo")
    @ResponseBody
    List<Book> queryBookInfo(){
        return userService.queryBookInfo();
    }

}
