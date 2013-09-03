package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductDetail;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for OrderItems entities
 * 
 */
public interface OrderItemsService {

	/**
	 * Return all OrderItems entity
	 * 
	 */
	public List<OrderItems> findAllOrderItemss(Integer startResult, Integer maxRows);

	/**
	 * Load an existing OrderItems entity
	 * 
	 */
	public Set<OrderItems> loadOrderItemss();

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	public OrderItems saveOrderItemsProductDetail(Integer orderId, Integer productId, ProductDetail related_productdetail);

	/**
	 */
	public OrderItems findOrderItemsByPrimaryKey(Integer orderId_1, Integer productId_1);

	/**
	 * Save an existing Order entity
	 * 
	 */
	public OrderItems saveOrderItemsOrder(Integer orderId_2, Integer productId_2, Order related_order);

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	public void saveOrderItems(OrderItems orderitems);

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	public void deleteOrderItems(OrderItems orderitems_1);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public OrderItems deleteOrderItemsOrder(Integer orderitems_orderId, Integer orderitems_productId, Integer related_order_id);

	/**
	 * Return a count of all OrderItems entity
	 * 
	 */
	public Integer countOrderItemss();

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	public OrderItems deleteOrderItemsProductDetail(Integer orderitems_orderId_1, Integer orderitems_productId_1, Integer related_productdetail_id);
}