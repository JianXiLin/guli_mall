package com.jianxi.gulimall_member.dao;

import com.jianxi.gulimall_member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:09:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
