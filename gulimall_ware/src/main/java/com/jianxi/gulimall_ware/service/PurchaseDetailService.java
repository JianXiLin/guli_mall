package com.jianxi.gulimall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:13:34
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

