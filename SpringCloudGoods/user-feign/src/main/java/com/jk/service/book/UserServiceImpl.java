package com.jk.service.book;

import com.jk.model.Book;
import com.jk.model.TreeBean;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;

@Component
public class UserServiceImpl implements  UserService {


    @Override
    public List<LinkedHashMap> findUser() {
        return null;
    }

    @Override
    public List<TreeBean> getNavTree() {
        return null;
    }

    @Override
    public List<Book> queryBookInfo() {
        return null;
    }
}
