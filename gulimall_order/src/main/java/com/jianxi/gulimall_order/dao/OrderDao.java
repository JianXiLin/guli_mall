package com.jianxi.gulimall_order.dao;

import com.jianxi.gulimall_order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 19:12:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
