package com.sy.service.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Data_dictionary;

import java.util.List;

public interface Data_dictoryService {
    /**
     * 查询数据字典
     * @return
     */
    public BaseResp getData_dictionaryList(Data_dictionary data_dictionary) throws Exception;

    /**
     * 修改数据字典
     * @param
     * @return
     */
    public BaseResp modifyData_dictionary(Data_dictionary data_dictionary);

    /**
     * 删除数据字典
     * @param
     * @return
     */
    public BaseResp deleteData_dictionaryById(Integer id);

    /**
     * 新增商品
     * @param
     * @return
     */
    public BaseResp addData_dictionary(Data_dictionary data_dictionary) throws Exception;


}
