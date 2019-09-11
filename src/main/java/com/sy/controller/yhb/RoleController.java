package com.sy.controller.yhb;

import com.sy.model.common.Role;
import com.sy.model.resp.BaseResp;
import com.sy.service.common.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
