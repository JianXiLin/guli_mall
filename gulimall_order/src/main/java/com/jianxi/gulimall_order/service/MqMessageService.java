package com.jianxi.gulimall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:12:12
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

