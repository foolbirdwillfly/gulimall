package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
//        OrderEntity orderEntity=new OrderEntity();
//        orderEntity.setOrderSn("订单");
//        orderService.save(orderEntity);
        List<OrderEntity> list=orderService.list(new QueryWrapper<OrderEntity>().eq("id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("OK");
    }

}
