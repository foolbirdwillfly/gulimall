package com.atguigu.gulimall.wares.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.wares.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author lijie
 * @email 317067287@qq.com
 * @date 2022-06-14 17:58:44
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

