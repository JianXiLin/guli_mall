package com.jianxi.gulimall_coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:00:13
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

