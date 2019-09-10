package com.sy.mapper.yhb;


import com.sy.model.yhb.Basics_parameter;
import com.sy.model.yhb.Goods_info;

import java.util.List;

public interface Basics_parameterMapper {

    /**
     * 查询基础信息列表
     * @return
     */
    public List<Basics_parameter> getBasics_parameterList(Basics_parameter basics_parameter) throws Exception;

    /**
     * 搜索商品
     * @param
     * @return
     */
    public List<Basics_parameter> getBasics_parameterListBySearch(Basics_parameter basics_parameter) throws Exception;


    /**
     * 查看商品
     * @param
     * @return
     */
    public Basics_parameter getBasics_parameterById(Basics_parameter basics_parameter) throws Exception;

    /**
     * 新增商品
     * @param
     * @return
     */
    public int addBasics_parameter(Basics_parameter basics_parameter) throws Exception;

    /**
     * 修改商品信息
     * @param
     * @return
     */
    public int modifyBasics_parameter(Basics_parameter basics_parameter);


    /**
     * 删除商品
     * @param
     * @return
     */
    public int deleteBasics_parameterById(Integer id);

    /**
     * 查询搜索内容总数量
     * @param
     * @return
     */
    public Integer count(Basics_parameter basics_parameter);

    /**
     * 查询总数量
     * @return
     */
    public Integer countAll();





}
