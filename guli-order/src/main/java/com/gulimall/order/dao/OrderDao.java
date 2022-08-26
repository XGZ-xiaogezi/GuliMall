package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author XGZ
 * @email 2570079002@qq.com
 * @date 2022-08-26 11:01:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
