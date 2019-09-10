package com.sy.service.yhb;

import com.sy.mapper.yhb.GoodsPackMapper;
import com.sy.model.resp.BaseResp;
import com.sy.model.yhb.GoodsPack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsPackServiceImpl implements GoodsPackService {
    @Autowired
    private GoodsPackMapper goodsPackMapper;
    @Override
    public BaseResp getGoodsPackList(GoodsPack goodsPack) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<GoodsPack> goodsPackList = goodsPackMapper.getGoodsPackList(goodsPack);
        Integer count = goodsPackMapper.countAll();
        if (goodsPackList.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(goodsPackList);
            baseResp.setCount(count);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp getGoodsPackListBySearch(GoodsPack goodsPack) throws Exception {
        BaseResp baseResp = new BaseResp();
        List<GoodsPack> goodsPackList = goodsPackMapper.getGoodsPackList(goodsPack);
        Integer count = goodsPackMapper.count(goodsPack);
        if (goodsPackList.size()!=0){
            baseResp.setSuccess(1);
            baseResp.setData(goodsPackList);
            baseResp.setCount(count);

        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp getGoodsPackById(GoodsPack goodsPack) throws Exception {
        BaseResp baseResp = new BaseResp();
        GoodsPack goodsPack1 = goodsPackMapper.getGoodsPackById(goodsPack);
        if (goodsPack1!=null){
            baseResp.setSuccess(1);
            baseResp.setData(goodsPack1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp addGoodsPack(GoodsPack goodsPack) throws Exception {
        BaseResp baseResp = new BaseResp();
        Integer result = goodsPackMapper.addGoodsPack(goodsPack);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp modifyGoodsPack(GoodsPack goodsPack) {
        BaseResp baseResp = new BaseResp();
        Integer result = goodsPackMapper.modifyGoodsPack(goodsPack);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;
    }

    @Override
    public BaseResp deleteGoodsPackById(Integer id) {
        BaseResp baseResp = new BaseResp();
        Integer result = goodsPackMapper.deleteGoodsPackById(id);
        if (result!=0){
            baseResp.setSuccess(1);
        }else {
            baseResp.setSuccess(0);
        }
        return baseResp;

    }



}
