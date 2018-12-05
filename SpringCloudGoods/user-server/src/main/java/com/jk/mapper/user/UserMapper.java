package com.jk.mapper.user;

import com.jk.model.TreeBean;
import org.apache.ibatis.annotations.Mapper;

import java.awt.print.Book;
import java.util.LinkedHashMap;
import java.util.List;


@Mapper
public interface UserMapper {
    List<LinkedHashMap> findUser();


    List<TreeBean> getNodes(String id);

    List<Book> queryBookInfo();
}
