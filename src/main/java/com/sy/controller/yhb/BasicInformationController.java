package com.sy.controller.yhb;

import com.sy.model.common.Role;
import com.sy.model.common.User;
import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Basics_parameter;
import com.sy.service.common.RoleService;
import com.sy.service.yhb.Basics_parameterService;
import com.sy.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class BasicInformationController {
    @Autowired
    private Basics_parameterService basics_parameterService;
    //所有基础信息
    @RequestMapping("/statics/html/getBasicInformationList")
    @ResponseBody
    public BaseResp getAllBasicInformation(){
        BaseResp baseResp = new BaseResp();
        Basics_parameter basics_parameter = new Basics_parameter();
        try {
            baseResp  = basics_parameterService.getBasics_parameterList(basics_parameter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }


    //删除基础信息
    @RequestMapping("/statics/html/DeleteBasicInformation")
    @ResponseBody
    public BaseResp DeleteBasicInformation(Integer id){
        BaseResp baseResp= new BaseResp();
        try {
            baseResp = basics_parameterService.deleteBasics_parameterById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //新增基础信息
    @RequestMapping("/statics/html/addBasicInformation")
    @ResponseBody
    public BaseResp addBasicInformation(Basics_parameter basics_parameter){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = basics_parameterService.addBasics_parameter(basics_parameter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //修改基础信息
    @RequestMapping("/statics/html/modifyBasicInformation")
    @ResponseBody
    public BaseResp modifyBasicInformation(Basics_parameter basics_parameter){
        BaseResp baseResp = new BaseResp();
        int result= 0;
        try {
            baseResp = basics_parameterService.modifyBasics_parameter(basics_parameter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //获取被选中的用户信息
    @RequestMapping("/statics/html/getBasicInformationSelected")
    @ResponseBody
    public BaseResp getBasicInformationSelected(Basics_parameter basics_parameter){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp= basics_parameterService.getBasics_parameterById(basics_parameter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

}
