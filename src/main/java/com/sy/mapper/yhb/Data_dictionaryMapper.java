package com.sy.mapper.yhb;

import com.sy.model.yhb.Basics_parameter;
import com.sy.model.yhb.Data_dictionary;

import java.util.List;

public interface Data_dictionaryMapper {
    /**
     * 查询数据字典
     * @return
     */
    public List<Data_dictionary> getData_dictionaryList(Data_dictionary data_dictionary) throws Exception;

      /**
     * 修改数据字典
     * @param
     * @return
     */
    public int modifyData_dictionary(Data_dictionary data_dictionary);

    /**
     * 删除数据字典
     * @param
     * @return
     */
    public int deleteData_dictionaryById(Integer id);

    /**
     * 查看商品
     * @param
     * @return
     */
    public Data_dictionary getData_dictionaryById(Data_dictionary data_dictionary);

    /**
     * 新增商品
     * @param
     * @return
     */
    public int addData_dictionary(Data_dictionary data_dictionary) throws Exception;

    /**
     * 查询总数量
     * @return
     */
    public Integer countAll();
}
