package com.sy.service.yhb;

import com.sy.mapper.yhb.Basics_parameterMapper;
import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Basics_parameter;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Basics_parameterServiceImpl implements Basics_parameterService {
    @Autowired
    private Basics_parameterMapper basics_parameterMapper;
    @Override
    public BaseResp getBasics_parameterList(Basics_parameter basics_parameter) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<Basics_parameter> basics_parameterList = basics_parameterMapper.getBasics_parameterList(basics_parameter);
        Integer count = basics_parameterMapper.count(basics_parameter);
        if (basics_parameterList.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(basics_parameterList);
            baseResp.setCount(count);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp getBasics_parameterListBySearch(Basics_parameter basics_parameter) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<Basics_parameter> basics_parameterList = basics_parameterMapper.getBasics_parameterListBySearch(basics_parameter);
        Integer count = basics_parameterMapper.countAll();
        if (basics_parameterList.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(basics_parameterList);
            baseResp.setCount(count);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp getBasics_parameterById(Basics_parameter basics_parameter) throws Exception {
        BaseResp baseResp = new BaseResp();
        Basics_parameter basics_parameter1 = basics_parameterMapper.getBasics_parameterById(basics_parameter);

        if (basics_parameter1!=null){
            baseResp.setSuccess(1);
            baseResp.setData(basics_parameter1);

        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;

    }

    @Override
    public BaseResp addBasics_parameter(Basics_parameter basics_parameter) throws Exception {
        BaseResp baseResp = new BaseResp();
        Integer result = basics_parameterMapper.addBasics_parameter(basics_parameter);

        if (result!=0){
            baseResp.setSuccess(1);

        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp modifyBasics_parameter(Basics_parameter basics_parameter) {
        BaseResp baseResp = new BaseResp();
        Integer result = basics_parameterMapper.modifyBasics_parameter(basics_parameter);

        if (result!=0){
            baseResp.setSuccess(1);

        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp deleteBasics_parameterById(Integer id) {
        BaseResp baseResp = new BaseResp();
        Integer result = basics_parameterMapper.deleteBasics_parameterById(id);

        if (result!=0){
            baseResp.setSuccess(1);

        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }


}
