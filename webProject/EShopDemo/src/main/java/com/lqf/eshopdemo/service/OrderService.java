package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.Userinfo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */
public interface OrderService {

	/**
	 * Save an existing Order entity
	 * 
	 */
	public void saveOrder(Order order);

	/**
	 * Load an existing Order entity
	 * 
	 */
	public Set<Order> loadOrders();

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	public Order deleteOrderOrderItemses(Integer order_id, Integer related_orderitemses_orderId, Integer related_orderitemses_productId);

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	public Order saveOrderOrderItemses(Integer id, OrderItems related_orderitemses);

	/**
	 */
	public Order findOrderByPrimaryKey(Integer id_1);

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	public Order deleteOrderUserinfo(Integer order_id_1, Integer related_userinfo_id);

	/**
	 * Return a count of all Order entity
	 * 
	 */
	public Integer countOrders();

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public void deleteOrder(Order order_1);

	/**
	 * Return all Order entity
	 * 
	 */
	public List<Order> findAllOrders(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	public Order saveOrderUserinfo(Integer id_2, Userinfo related_userinfo);
}