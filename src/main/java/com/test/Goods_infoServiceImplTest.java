package com.test;

import com.sy.config.SpringConfig;
import com.sy.model.yhb.Goods_info;
import com.sy.service.yhb.Goods_infoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@SpringBootTest(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Goods_infoServiceImplTest {
    @Autowired
    private Goods_infoService goods_infoService;
    @Test
    public void getGoods_infoList() {
        Goods_info goods_info = new Goods_info();
        goods_info.setPageSize(2);
        goods_info.setStarNum(0);
        try {
            System.out.println(goods_infoService.getGoods_infoList(goods_info));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getGoods_infoListBySearch() {
        Goods_info goods_info = new Goods_info();
        goods_info.setPageSize(2);
        goods_info.setStarNum(0);
        goods_info.setGoodsName("上衣");
        try {
            System.out.println(goods_infoService.getGoods_infoListBySearch(goods_info));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}