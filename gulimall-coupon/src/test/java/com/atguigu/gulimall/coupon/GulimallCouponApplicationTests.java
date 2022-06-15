package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity couponEntity=new CouponEntity();
        couponEntity.setCouponName("满十减一");
        couponService.save(couponEntity);
        System.out.println("OK");
    }

}
