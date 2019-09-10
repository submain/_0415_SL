package com.sy.service.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.GoodsPack;

import java.util.List;

public interface GoodsPackService {
    /**
     * 查询商品套餐列表
     * @return
     */
    public BaseResp getGoodsPackList(GoodsPack goodsPack) throws Exception;

    /**
     * 搜索商品
     * @param
     * @return
     */
    public BaseResp getGoodsPackListBySearch(GoodsPack goodsPack) throws Exception;


    /**
     * 查看商品
     * @param
     * @return
     */
    public BaseResp getGoodsPackById(GoodsPack goodsPack) throws Exception;

    /**
     * 新增商品
     * @param
     * @return
     */
    public BaseResp addGoodsPack(GoodsPack goodsPack) throws Exception;

    /**
     * 修改商品信息
     * @param
     * @return
     */
    public BaseResp modifyGoodsPack(GoodsPack goodsPack);


    /**
     * 删除商品
     * @param
     * @return
     */
    public BaseResp deleteGoodsPackById(Integer id);



}
