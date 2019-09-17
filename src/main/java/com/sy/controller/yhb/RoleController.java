package com.sy.controller.yhb;

import com.sy.model.common.Role;
import com.sy.model.common.User;
import com.sy.model.resp.BaseResp;
import com.sy.service.common.RoleService;
import com.sy.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    //所有角色
    @RequestMapping("/statics/html/getRoleList")
    @ResponseBody
    public BaseResp getAllRole(Integer page, Integer pageSize){
        BaseResp baseResp = new BaseResp();
        try {
            List<Role> roleList = roleService.getRoleList();
            baseResp.setSuccess(1);
            baseResp.setData(roleList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //修改用户状态
    @RequestMapping("/statics/html/madifyRoleStatus")
    @ResponseBody
    public BaseResp modifyUserStatus(Integer status,Integer id){
        BaseResp baseResp= new BaseResp();
        try {
            baseResp = roleService.modifyUserStatus(status,id);
            return baseResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //删除角色
    @RequestMapping("/statics/html/DeleteRole")
    @ResponseBody
    public BaseResp modifyUserStatus(Integer id){
        BaseResp baseResp= new BaseResp();
        Role role = new Role();
        role.setId(id);
        try {
            int result = roleService.deleteRole(role);
            if (result!=0){
                baseResp.setSuccess(1);
                return baseResp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //新增角色
    @RequestMapping("/statics/html/addRole")
    @ResponseBody
    public BaseResp addRole(Role role, HttpSession session){
        User user = (User) session.getAttribute(Constants.SESSION_USER);
        role.setCreatedBy(user.getLoginCode());
        role.setCreateDate(new Date());
        BaseResp baseResp = new BaseResp();
        try {
            int result = roleService.addRole(role);
            if (result!=0){
                baseResp.setSuccess(1);
            }else {
                baseResp.setSuccess(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //修改角色
    @RequestMapping("/statics/html/modifyRole")
    @ResponseBody
    public BaseResp modify(Role role){
        BaseResp baseResp = new BaseResp();
        int result= 0;
        try {
            result = roleService.modifyRole(role);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    //获取被选中的用户信息
    @RequestMapping("/statics/html/getRoleSelected")
    @ResponseBody
    public BaseResp getRoleSelected(Integer selectedId){
        BaseResp baseResp = new BaseResp();
        Role role = new Role();
        role.setId(selectedId);
        try {
            Role role1 = roleService.getRole(role);
            if (role1!=null){
                baseResp.setSuccess(1);
                baseResp.setData(role1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

}
