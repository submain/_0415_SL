package com.sy.service.yhb;

import com.sy.mapper.yhb.Goods_infoMapper;
import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.Goods_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Goods_infoServiceImpl implements Goods_infoService {
    @Autowired
    private Goods_infoMapper goods_infoMapper;
    @Override
    public BaseResp getGoods_infoList(Goods_info goods_info) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<Goods_info> goods_infos = goods_infoMapper.getGoods_infoList(goods_info);
        Integer result = goods_infoMapper.countAll();
        if (goods_infos.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(goods_infos);
            baseResp.setCount(result);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp getGoods_infoListBySearch(Goods_info goods_info) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<Goods_info> goods_infos = goods_infoMapper.getGoods_infoListBySearch(goods_info);
        Integer result = goods_infoMapper.count(goods_info);
        if (goods_infos.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(goods_infos);
            baseResp.setCount(result);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp getGoods_infoById(Goods_info goods_info) throws Exception {
        BaseResp baseResp = new BaseResp();
        Goods_info goods_info1 = goods_infoMapper.getGoods_infoById(goods_info);
        if (goods_info1!=null){
            baseResp.setSuccess(1);
            baseResp.setData(goods_info1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;

    }

    @Override
    public BaseResp addGoods_info(Goods_info goods_info) throws Exception {
        BaseResp baseResp = new BaseResp();
        Integer result = goods_infoMapper.addGoods_info(goods_info);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp modifyGoods_info(Goods_info goods_info) {
        BaseResp baseResp = new BaseResp();
        Integer result = goods_infoMapper.modifyGoods_info(goods_info);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp deleteGoods_infoById(Integer id) {
        BaseResp baseResp = new BaseResp();
        Integer result = goods_infoMapper.deleteGoods_infoById(id);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp count(Goods_info goods_info) {
        BaseResp baseResp = new BaseResp();
        Integer result = goods_infoMapper.count(goods_info);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }
}
