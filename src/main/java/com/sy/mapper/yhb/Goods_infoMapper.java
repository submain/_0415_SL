package com.sy.mapper.yhb;


import com.sy.model.common.User;
import com.sy.model.yhb.Goods_info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Goods_infoMapper {

    /**
     * 查询商品列表
     * @return
     */
    public List<Goods_info> getGoods_infoList(Goods_info goods_info) throws Exception;

    /**
     * 搜索商品
     * @param
     * @return
     */
    public List<Goods_info> getGoods_infoListBySearch(Goods_info goods_info) throws Exception;


    /**
     * 查看商品
     * @param
     * @return
     */
    public Goods_info getGoods_infoById(Goods_info goods_info) throws Exception;

    /**
     * 新增商品
     * @param
     * @return
     */
    public int addGoods_info(Goods_info goods_info) throws Exception;

    /**
     * 修改商品信息
     * @param
     * @return
     */
    public int modifyGoods_info(Goods_info goods_info);


    /**
     * 删除商品
     * @param
     * @return
     */
    public int deleteGoods_infoById(Integer id);

    /**
     * 查询搜索内容总数量
     * @param goods_info
     * @return
     */
    public Integer count(Goods_info goods_info);

    /**
     * 查询总数量
     * @return
     */
    public Integer countAll();





}
