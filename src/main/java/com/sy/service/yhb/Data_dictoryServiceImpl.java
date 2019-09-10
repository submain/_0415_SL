package com.sy.service.yhb;

import com.sy.mapper.yhb.Data_dictionaryMapper;
import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Data_dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Data_dictoryServiceImpl implements Data_dictoryService {
    @Autowired
    private Data_dictionaryMapper data_dictionaryMapper;
    @Override
    public BaseResp getData_dictionaryList(Data_dictionary data_dictionary) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<Data_dictionary> data_dictionaryList = data_dictionaryMapper.getData_dictionaryList(data_dictionary);
        Integer count = data_dictionaryMapper.countAll();
        if (data_dictionaryList.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(data_dictionaryList);
            baseResp.setCount(count);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp modifyData_dictionary(Data_dictionary data_dictionary) {
        BaseResp baseResp = new BaseResp();
        Integer result = data_dictionaryMapper.modifyData_dictionary(data_dictionary);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp deleteData_dictionaryById(Integer id) {
        BaseResp baseResp = new BaseResp();
        Integer result = data_dictionaryMapper.deleteData_dictionaryById(id);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp addData_dictionary(Data_dictionary data_dictionary) throws Exception {
        BaseResp baseResp = new BaseResp();
        Integer result = data_dictionaryMapper.addData_dictionary(data_dictionary);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }


}
