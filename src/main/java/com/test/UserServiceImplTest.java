package com.test;

import com.sy.config.SpringConfig;
import com.sy.model.common.User;
import com.sy.service.common.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.*;
@SpringBootTest(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;
    @org.junit.Test
    public void getUserListBySearch() {
        User user = new User();
        user.setStarNum(2);
        user.setPageSize(1);
        user.setId(1);
        try {
            System.out.println(userService.getUserListBySearch(user));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUserList() {
        User user = new User();
        user.setStarNum(2);
        user.setPageSize(1);

        try {
            System.out.println(userService.getUserList(user));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getCount() {
        User user = new User();
        user.setStarNum(2);
        user.setPageSize(1);

        try {
            System.out.println(userService.count(user));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}