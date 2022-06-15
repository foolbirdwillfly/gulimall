package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lijie
 * @email 317067287@qq.com
 * @date 2022-06-14 17:34:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
