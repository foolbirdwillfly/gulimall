package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lijie
 * @email 317067287@qq.com
 * @date 2022-06-14 16:42:38
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
