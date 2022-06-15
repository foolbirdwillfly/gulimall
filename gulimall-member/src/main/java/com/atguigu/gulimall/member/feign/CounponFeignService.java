package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("gulimall-coupon")
public interface CounponFeignService {
    final String headUrl = "/coupon/coupon";

    @GetMapping(headUrl+"/member/list")
    public R memberCoupon();
}
