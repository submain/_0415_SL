package com.sy.controller.yhb;

import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Goods_info;
import com.sy.service.yhb.Goods_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Goods_infoController {
    @Autowired
    private Goods_infoService goods_infoService;
    //增加新产品
    @ResponseBody
    @RequestMapping("/statics/html/addGoods_info")
    public BaseResp addGoods_info(Goods_info goods_info){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goods_infoService.addGoods_info(goods_info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //查询商品
    @ResponseBody
    @RequestMapping("/statics/html/getGoods_info")
    public BaseResp getGoods_info(Integer page,Integer pageSize){
        BaseResp baseResp = new BaseResp();
        Goods_info goods_info = new Goods_info();
        goods_info.setStarNum((page-1)*pageSize);
        goods_info.setPageSize(pageSize);
        try {
            baseResp = goods_infoService.getGoods_infoList(goods_info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }
    //修改商品
    @ResponseBody
    @RequestMapping("/statics/html/modifyGoods_info")
    public BaseResp modifyGoods_info(Goods_info goods_info){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goods_infoService.modifyGoods_info(goods_info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }

    //通过id查询商品
    @ResponseBody
    @RequestMapping("/statics/html/selectGoods_infoById")
    public BaseResp selectGoods_infoById(Goods_info goods_info){
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goods_infoService.getGoods_infoById(goods_info);
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
    @RequestMapping("/statics/html/deleteGoods_infoById")
    public BaseResp deleteGoods_infoById(Integer id){
        BaseResp baseResp = new BaseResp();
        baseResp = goods_infoService.deleteGoods_infoById(id);
        return baseResp;
    }

    //通过关键词查询商品
    @ResponseBody
    @RequestMapping("/statics/html/selectGoods_infoByKey")
    public BaseResp selectGoods_infoByKey(String key){
        System.out.println(key);
        Goods_info goods_info = new Goods_info();
        goods_info.setGoodsName(key);
        BaseResp baseResp = new BaseResp();
        try {
            baseResp = goods_infoService.getGoods_infoListBySearch(goods_info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResp;
    }




}
