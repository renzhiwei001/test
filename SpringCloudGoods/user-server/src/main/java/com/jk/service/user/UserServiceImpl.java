package com.jk.service.user;

import com.jk.mapper.user.UserMapper;
import com.jk.model.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<LinkedHashMap> findUser() {

        return userMapper.findUser();
    }

    @Override
    public List<TreeBean> getNavTree() {
        String id = "0";

        List<TreeBean> nodes = getNodes(id);

        return nodes;
    }

    @Override
    public List<Book> queryBookInfo() {
        return userMapper.queryBookInfo();
    }

    private List<TreeBean> getNodes(String id){
        List<TreeBean> ListNodes = userMapper.getNodes(id);

        for (TreeBean nav : ListNodes) {

            List<TreeBean> nodes = getNodes(nav.getId());

            if(nodes != null && nodes.size() > 0) {

                nav.setLeaf(false);
                nav.setSelectable(false);
                nav.setNodes(nodes);

            }else {

                nav.setLeaf(true);
                nav.setSelectable(true);

            }


        }

        return ListNodes;
    }
}
