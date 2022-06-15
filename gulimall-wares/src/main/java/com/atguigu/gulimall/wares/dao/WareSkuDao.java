package com.atguigu.gulimall.wares.dao;

import com.atguigu.gulimall.wares.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lijie
 * @email 317067287@qq.com
 * @date 2022-06-14 17:58:44
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
