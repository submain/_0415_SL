package com.sy.controller.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.GoodsPack;
import com.sy.service.yhb.GoodsPackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ProductPackageController {
    @Autowired
    private GoodsPackService goodsPackService;
    //增加新产品
    @ResponseBody
    @RequestMapping("/statics/html/addGoodsPack")
    public BaseResp addGoodsPack(GoodsPack goodsPack){
        goodsPack.setCreateTime(new Date());
        goodsPack.setLastUpdateTime(new Date());
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goodsPackService.addGoodsPack(goodsPack);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //查询商品
    @ResponseBody
    @RequestMapping("/statics/html/getGoodsPack")
    public BaseResp getGoodsPack(Integer page,Integer pageSize){
        BaseResp baseResp = new BaseResp();
        GoodsPack goodsPack = new GoodsPack();
        goodsPack.setStarNum((page-1)*pageSize);
        goodsPack.setPageSize(pageSize);
        try {
            baseResp = goodsPackService.getGoodsPackList(goodsPack);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //修改商品
    @ResponseBody
    @RequestMapping("/statics/html/modifyGoodsPack")
    public BaseResp modifyGoodsPack(GoodsPack goodsPack){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goodsPackService.modifyGoodsPack(goodsPack);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //通过id查询商品
    @ResponseBody
    @RequestMapping("/statics/html/selectGoodsPackById")
    public BaseResp selectGoodsPackById(GoodsPack goodsPack){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goodsPackService.getGoodsPackById(goodsPack);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    /**
     * 通过id删除商品
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/statics/html/deleteGoodsPackById")
    public BaseResp deleteGoodsPackById(Integer id){
        BaseResp baseResp = new BaseResp();
        baseResp = goodsPackService.deleteGoodsPackById(id);
        return baseResp;
    }

    //通过关键词查询商品
    @ResponseBody
    @RequestMapping("/statics/html/selectGoodsPackByKey")
    public BaseResp selectGoodsPackByKey(String key){
        System.out.println(key);
        GoodsPack goodsPack = new GoodsPack();
        goodsPack.setGoodsPackName(key);
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goodsPackService.getGoodsPackListBySearch(goodsPack);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }




}
