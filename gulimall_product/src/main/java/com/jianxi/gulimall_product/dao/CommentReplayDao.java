package com.jianxi.gulimall_product.dao;

import com.jianxi.gulimall_product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 17:49:07
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
