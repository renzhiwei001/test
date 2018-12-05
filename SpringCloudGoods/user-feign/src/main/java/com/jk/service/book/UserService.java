package com.jk.service.book;

import com.jk.model.Book;
import com.jk.model.TreeBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;

@FeignClient(value = "service-user",fallback =UserServiceImpl.class )
public interface UserService {


    @RequestMapping(value = "/test",method = RequestMethod.GET)
        List<LinkedHashMap> findUser();

    @RequestMapping(value = "/getNavTree",method = RequestMethod.GET)
    List<TreeBean> getNavTree();

    @RequestMapping(value = "/queryBookInfo",method = RequestMethod.GET)
    List<Book> queryBookInfo();
}


