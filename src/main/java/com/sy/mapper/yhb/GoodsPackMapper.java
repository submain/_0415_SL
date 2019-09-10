package com.sy.mapper.yhb;


import com.sy.model.yhb.GoodsPack;
import com.sy.model.yhb.Goods_info;

import java.util.List;

public interface GoodsPackMapper {

    /**
     * 查询商品套餐列表
     * @return
     */
    public List<GoodsPack> getGoodsPackList(GoodsPack goodsPack) throws Exception;

    /**
     * 搜索商品
     * @param
     * @return
     */
    public List<GoodsPack> getGoodsPackListBySearch(GoodsPack goodsPack) throws Exception;


    /**
     * 查看商品
     * @param
     * @return
     */
    public GoodsPack getGoodsPackById(GoodsPack goodsPack) throws Exception;

    /**
     * 新增商品
     * @param
     * @return
     */
    public int addGoodsPack(GoodsPack goodsPack) throws Exception;

    /**
     * 修改商品信息
     * @param
     * @return
     */
    public int modifyGoodsPack(GoodsPack goodsPack);


    /**
     * 删除商品
     * @param
     * @return
     */
    public int deleteGoodsPackById(Integer id);

    /**
     * 查询搜索内容总数量
     * @param
     * @return
     */
    public Integer count(GoodsPack goodsPack);

    /**
     * 查询总数量
     * @return
     */
    public Integer countAll();





}
