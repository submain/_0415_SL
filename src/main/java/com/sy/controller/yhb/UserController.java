package com.sy.controller.yhb;

import com.sy.model.common.User;
import com.sy.model.resp.BaseResp;
import com.sy.service.common.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //获得用户列表
    @RequestMapping("/statics/html/getUserList")
    @ResponseBody
    public BaseResp getUserList(Integer page, Integer pageSize){
        BaseResp baseResp = new BaseResp();
        User user = new User();
        user.setStarNum((page-1)*pageSize);
        user.setPageSize(pageSize);
        try {
            List<User> userList = userService.getUserList(user);
            Integer count = userService.count(user);
            System.out.println(userList);
            baseResp.setSuccess(1);
            baseResp.setData(userList);
            baseResp.setCount(count);
            return baseResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //修改用户状态
    @RequestMapping("/statics/html/madifyUserStatus")
    @ResponseBody
    public BaseResp modifyUserStatus(Integer status,Integer id){
        BaseResp baseResp= new BaseResp();
        try {
             baseResp = userService.modifyUserStatus(status,id);
             return baseResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    @RequestMapping("/backend/{name}")
    public String pages(@PathVariable("name") String name){
        int count=name.indexOf(".");
        String path=name.substring(0,count);
        System.out.println(path);
        return "/backend/"+path;
    }

    //新增用户

}
