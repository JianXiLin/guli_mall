package com.jianxi.gulimall_coupon.dao;

import com.jianxi.gulimall_coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:00:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
