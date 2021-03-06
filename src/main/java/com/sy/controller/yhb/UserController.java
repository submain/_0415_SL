package com.sy.controller.yhb;

import com.sy.model.common.User;
import com.sy.model.resp.BaseResp;
import com.sy.service.common.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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

    //增加用户
    @RequestMapping("/statics/html/addUser")
    @ResponseBody
    public BaseResp addUser(User user){
        //从session中获取到推荐人用户名
        user.setLastUpdateTime(new Date());
            BaseResp baseResp = new BaseResp();
        try {
            int i = userService.addUser(user);
            if (i!=0){
                baseResp.setSuccess(1);
            }else {
                baseResp.setSuccess(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    //删除用户
    @RequestMapping("/statics/html/deleteUser")
    @ResponseBody
    public BaseResp deleteUser(Integer id){
        BaseResp baseResp = new BaseResp();
        User user = new User();
        user.setId(id);
        try {
            int i = userService.deleteUser(user);
            if (i!=0){
                baseResp.setSuccess(1);
            }else {
                baseResp.setSuccess(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            baseResp.setSuccess(0);
        }
        return baseResp;
    }
    //修改用户
    @RequestMapping("/statics/html/modifyUser")
    @ResponseBody
    public BaseResp modify(User user){
         BaseResp baseResp = new BaseResp();
         int result=userService.modifyUser(user);
         if (result!=0){
             baseResp.setSuccess(1);
         }else {
             baseResp.setSuccess(0);
         }
         return baseResp;
    }
    //获取被选中的用户信息
    @RequestMapping("/statics/html/getUserSelected")
    @ResponseBody
    public BaseResp getUserSelected(Integer selectedId){
        BaseResp baseResp = new BaseResp();
        User user = new User();
        user.setId(selectedId);
        try {
            User user1 = userService.getUserById(user);
            if (user1!=null){
                baseResp.setSuccess(1);
                baseResp.setData(user1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //通过条件查找用户
    @RequestMapping("/statics/html/getUserByKey")
    @ResponseBody
    public BaseResp getUserByKey(String key){
        BaseResp baseResp = new BaseResp();
        User user = new User();
        user.setUserName(key);
        try {
            List<User> userList = userService.getUserListBySearch(user);
            if (userList.size()!=0){
                baseResp.setSuccess(1);
                baseResp.setData(userList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //通过用户名查找用户
    @RequestMapping("/statics/html/getUserLoginCode")
    @ResponseBody
    public BaseResp getUserByLoginCode(String loginCode){
        System.out.println(loginCode);
        BaseResp baseResp = new BaseResp();
        User user = new User();
        user.setLoginCode(loginCode);
        try {
            User user1 = userService.getUserByLoginCode(user);
            if (user1!=null){
                baseResp.setSuccess(1);
                baseResp.setData(user1.getId());
            }else {
                baseResp.setSuccess(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }



}
