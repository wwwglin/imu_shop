package com.imu.shop.dao;

import com.imu.shop.pojo.Goods;
import com.imu.shop.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GoodsDaoTest {
    @Autowired(required = false)
    GoodsMapper goodsMapper;

    // 选择所有商品测试
    @Test
    public void testSelectAllGoods() {
        List<Goods> goodsList = goodsMapper.selectAll();
        //System.out.println(goodsList.size());
        assertNotNull(goodsList);
    }
}
