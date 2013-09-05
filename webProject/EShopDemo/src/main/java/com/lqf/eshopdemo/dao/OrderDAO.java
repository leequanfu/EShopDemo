package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Order;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Order entities.
 * 
 */
public interface OrderDAO extends JpaDao<Order> {

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	public Set<Order> findOrderByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	public Set<Order> findOrderByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPhoneContaining
	 *
	 */
	public Set<Order> findOrderByPhoneContaining(String phone) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPhoneContaining
	 *
	 */
	public Set<Order> findOrderByPhoneContaining(String phone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPayway
	 *
	 */
	public Set<Order> findOrderByPayway(String payway) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPayway
	 *
	 */
	public Set<Order> findOrderByPayway(String payway, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	public Order findOrderById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	public Order findOrderById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	public Set<Order> findOrderByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	public Set<Order> findOrderByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPaywayContaining
	 *
	 */
	public Set<Order> findOrderByPaywayContaining(String payway_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPaywayContaining
	 *
	 */
	public Set<Order> findOrderByPaywayContaining(String payway_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPhone
	 *
	 */
	public Set<Order> findOrderByPhone(String phone_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPhone
	 *
	 */
	public Set<Order> findOrderByPhone(String phone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}