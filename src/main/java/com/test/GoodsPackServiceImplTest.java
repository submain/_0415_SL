package com.test;

import com.sy.config.SpringConfig;
import com.sy.model.yhb.GoodsPack;
import com.sy.service.yhb.GoodsPackService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@SpringBootTest(classes = SpringConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsPackServiceImplTest {
    @Autowired
    private GoodsPackService goodsPackService;
    @Test
    public void getGoodsPackById() {
        GoodsPack goodsPack = new GoodsPack();
        goodsPack.setId(20);
        try {
            System.out.println(goodsPackService.getGoodsPackById(goodsPack));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}