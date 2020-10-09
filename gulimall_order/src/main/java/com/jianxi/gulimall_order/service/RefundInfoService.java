package com.jianxi.gulimall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:12:12
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

