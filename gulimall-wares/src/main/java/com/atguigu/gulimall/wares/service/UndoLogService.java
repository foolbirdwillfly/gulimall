package com.atguigu.gulimall.wares.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.wares.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lijie
 * @email 317067287@qq.com
 * @date 2022-06-14 17:58:44
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

