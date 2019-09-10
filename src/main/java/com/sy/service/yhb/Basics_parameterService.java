package com.sy.service.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Basics_parameter;
import com.sy.model.yhb.Goods_info;

import java.util.List;

public interface Basics_parameterService {
    /**
     * 查询基础信息列表
     * @return
     */
    public BaseResp getBasics_parameterList(Basics_parameter basics_parameter) throws Exception;

    /**
     * 搜索商品
     * @param
     * @return
     */
    public BaseResp getBasics_parameterListBySearch(Basics_parameter basics_parameter) throws Exception;


    /**
     * 查看商品
     * @param
     * @return
     */
    public BaseResp getBasics_parameterById(Basics_parameter basics_parameter) throws Exception;

    /**
     * 新增商品
     * @param
     * @return
     */
    public BaseResp addBasics_parameter(Basics_parameter basics_parameter) throws Exception;

    /**
     * 修改商品信息
     * @param
     * @return
     */
    public BaseResp modifyBasics_parameter(Basics_parameter basics_parameter);


    /**
     * 删除商品
     * @param
     * @return
     */
    public BaseResp deleteBasics_parameterById(Integer id);


}
