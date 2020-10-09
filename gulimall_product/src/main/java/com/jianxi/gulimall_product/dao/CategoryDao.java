package com.jianxi.gulimall_product.dao;

import com.jianxi.gulimall_product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 17:49:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
