package com.jk.service.user;

import com.jk.model.TreeBean;

import java.awt.print.Book;
import java.util.LinkedHashMap;
import java.util.List;

public interface UserService {
    List<LinkedHashMap> findUser();


    List<TreeBean> getNavTree();

    List<Book> queryBookInfo();
}
