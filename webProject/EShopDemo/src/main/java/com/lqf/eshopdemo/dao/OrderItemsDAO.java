package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.OrderItems;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage OrderItems entities.
 * 
 */
public interface OrderItemsDAO extends JpaDao<OrderItems> {

	/**
	 * JPQL Query - findOrderItemsByOrderId
	 *
	 */
	public Set<OrderItems> findOrderItemsByOrderId(Integer orderId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByOrderId
	 *
	 */
	public Set<OrderItems> findOrderItemsByOrderId(Integer orderId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderItemss
	 *
	 */
	public Set<OrderItems> findAllOrderItemss() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderItemss
	 *
	 */
	public Set<OrderItems> findAllOrderItemss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByPrimaryKey
	 *
	 */
	public OrderItems findOrderItemsByPrimaryKey(Integer orderId_1, Integer productId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByPrimaryKey
	 *
	 */
	public OrderItems findOrderItemsByPrimaryKey(Integer orderId_1, Integer productId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByProductId
	 *
	 */
	public Set<OrderItems> findOrderItemsByProductId(Integer productId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByProductId
	 *
	 */
	public Set<OrderItems> findOrderItemsByProductId(Integer productId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByPrice
	 *
	 */
	public Set<OrderItems> findOrderItemsByPrice(java.math.BigDecimal price) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByPrice
	 *
	 */
	public Set<OrderItems> findOrderItemsByPrice(BigDecimal price, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByQuality
	 *
	 */
	public Set<OrderItems> findOrderItemsByQuality(Integer quality) throws DataAccessException;

	/**
	 * JPQL Query - findOrderItemsByQuality
	 *
	 */
	public Set<OrderItems> findOrderItemsByQuality(Integer quality, int startResult, int maxRows) throws DataAccessException;

}