package com.jianxi.gulimall_member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.gulimall_member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:09:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

