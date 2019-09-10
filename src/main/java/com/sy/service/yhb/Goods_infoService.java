package com.sy.service.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Goods_info;

import java.util.List;

public interface Goods_infoService {
    /**
     * 查询商品列表
     * @return
     */
    public BaseResp getGoods_infoList(Goods_info goods_info) throws Exception;

    /**
     * 搜索商品
     * @param
     * @return
     */
    public BaseResp getGoods_infoListBySearch(Goods_info goods_info) throws Exception;


    /**
     * 查看商品
     * @param
     * @return
     */
    public BaseResp getGoods_infoById(Goods_info goods_info) throws Exception;

    /**
     * 新增商品
     * @param
     * @return
     */
    public BaseResp addGoods_info(Goods_info goods_info) throws Exception;

    /**
     * 修改商品信息
     * @param
     * @return
     */
    public BaseResp modifyGoods_info(Goods_info goods_info);


    /**
     * 删除商品
     * @param
     * @return
     */
    public BaseResp deleteGoods_infoById(Integer id);

    /**
     * 查询搜索内容总数量
     * @param goods_info
     * @return
     */
    public BaseResp count(Goods_info goods_info);
}
