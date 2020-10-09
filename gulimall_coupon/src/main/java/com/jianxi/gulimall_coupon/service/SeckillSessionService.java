package com.jianxi.gulimall_coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:00:12
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

