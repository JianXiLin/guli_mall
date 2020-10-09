package com.jianxi.gulimall_order.dao;

import com.jianxi.gulimall_order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:12:12
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
