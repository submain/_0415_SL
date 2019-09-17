package com.sy.controller.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Basics_parameter;
import com.sy.model.yhb.Data_dictionary;
import com.sy.service.yhb.Basics_parameterService;
import com.sy.service.yhb.Data_dictoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.dnd.DropTarget;

@Controller
public class Data_dictionaryController {
    @Autowired
    private Data_dictoryService data_dictoryService ;
    //所有基础信息
    @RequestMapping("/statics/html/getData_dictionary")
    @ResponseBody
    public BaseResp getData_dictionary(Integer page,Integer pageSize){
        BaseResp baseResp = new BaseResp();
        Data_dictionary data_dictionary = new Data_dictionary();
        data_dictionary.setStarNum((page-1)*pageSize);
        data_dictionary.setPageSize(pageSize);
        try {
            baseResp  = data_dictoryService.getData_dictionaryList(data_dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }


    //删除基础信息
    @RequestMapping("/statics/html/DeleteData_dictionary")
    @ResponseBody
    public BaseResp DeleteData_dictionary(Integer id){
        BaseResp baseResp= new BaseResp();
        try {
            baseResp = data_dictoryService.deleteData_dictionaryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //新增基础信息
    @RequestMapping("/statics/html/addData_dictionary")
    @ResponseBody
    public BaseResp addData_dictionary(Data_dictionary data_dictionary){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = data_dictoryService.addData_dictionary(data_dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //修改基础信息
    @RequestMapping("/statics/html/modifyData_dictionary")
    @ResponseBody
    public BaseResp modifyData_dictionary(Data_dictionary data_dictionary){
        BaseResp baseResp = new BaseResp();
        int result= 0;
        try {
            baseResp = data_dictoryService.modifyData_dictionary(data_dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //获取被选中的用户信息
    @RequestMapping("/statics/html/getData_dictionarySelected")
    @ResponseBody
    public BaseResp getData_dictionarySelected(Data_dictionary data_dictionary){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp= data_dictoryService.getData_dictionaryById(data_dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

}
