package com.jianxi.gulimall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:13:34
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

