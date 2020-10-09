package com.jianxi.gulimall_coupon.dao;

import com.jianxi.gulimall_coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:00:13
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
