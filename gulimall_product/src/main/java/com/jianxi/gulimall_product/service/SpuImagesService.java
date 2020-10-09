package com.jianxi.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 17:49:07
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

