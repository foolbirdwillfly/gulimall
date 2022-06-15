package com.atguigu.gulimall.wares;

import com.atguigu.gulimall.wares.entity.WareInfoEntity;
import com.atguigu.gulimall.wares.service.WareInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallWaresApplicationTests {

    @Autowired
    WareInfoService wareInfoService;
    @Test
    void contextLoads() {
        List<WareInfoEntity> list=wareInfoService.list(new QueryWrapper<WareInfoEntity>().eq("id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("OK");
    }

}
