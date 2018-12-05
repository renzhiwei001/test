package com.jk.controller;

import com.google.gson.Gson;
import com.jk.model.Book;
import com.jk.model.TreeBean;
import com.jk.service.book.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
@RequestMapping("user")
public class Usercontroller {
    @Autowired
    private UserService userService;


    @GetMapping(value = "/findUser")
    @ResponseBody
    public List<LinkedHashMap> findUser() {
        return userService.findUser();
    }

    //(查询树)
    @RequestMapping("getNavTree")
    @ResponseBody
    String getNavTree(@RequestParam("callback") String callback){
        Gson gson=new Gson();   //google的一个json工具库
        List<TreeBean>list =  userService.getNavTree();
        return callback+"("+gson.toJson(list)+")";   //构造返回值
    }


    @RequestMapping("/toUserPage")
    String toUserPage(){

        return "index";
    }
    @GetMapping(value = "/queryBookInfo")
    @ResponseBody
    List<Book> queryBookInfo(){

        return userService.queryBookInfo();
    }


    @GetMapping(value = "/findJsonp")
    @ResponseBody
    String findJsonp(@RequestParam("callback") String callback){
        Gson gson=new Gson();   //google的一个json工具库
       List<Book>list =  userService.queryBookInfo();

       /*  Map<String,String> map=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put("bookid",list.get(i).getBookid());
            map.put("bookname",list.get(i).getBookname());
            map.put("bookprice",list.get(i).getBookprice());
            map.put("booktypeid",list.get(i).getBooktypeid());
            map.put("booktypename",list.get(i).getBooktypename());
        }*/
           /* list.forEach(book -> {
                System.out.println(book.getBookid());
                for (int i=0;i<list.size();i++){
                    map.put("bookid", list[i].getBookid());
                }
                    map.put("bookid", book.getBookid());
                    map.put("bookname", book.getBookname());
                    map.put("bookprice", book.getBookprice());
                    map.put("booktypeid", book.getBooktypeid());
                    map.put("booktypename", book.getBooktypename());

            });*/

        return callback+"("+gson.toJson(list)+")";   //构造返回值

    }


}
