package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lijie
 * @email 317067287@qq.com
 * @date 2022-06-14 16:19:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
