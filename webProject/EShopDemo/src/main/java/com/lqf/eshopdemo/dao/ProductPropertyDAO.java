package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductProperty;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductProperty entities.
 * 
 */
public interface ProductPropertyDAO extends JpaDao<ProductProperty> {

	/**
	 * JPQL Query - findProductPropertyByValue
	 *
	 */
	public Set<ProductProperty> findProductPropertyByValue(String value) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByValue
	 *
	 */
	public Set<ProductProperty> findProductPropertyByValue(String value, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByProId
	 *
	 */
	public Set<ProductProperty> findProductPropertyByProId(Integer proId) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByProId
	 *
	 */
	public Set<ProductProperty> findProductPropertyByProId(Integer proId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByKey
	 *
	 */
	public Set<ProductProperty> findProductPropertyByKey(String key) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByKey
	 *
	 */
	public Set<ProductProperty> findProductPropertyByKey(String key, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductPropertys
	 *
	 */
	public Set<ProductProperty> findAllProductPropertys() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductPropertys
	 *
	 */
	public Set<ProductProperty> findAllProductPropertys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByValueContaining
	 *
	 */
	public Set<ProductProperty> findProductPropertyByValueContaining(String value_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByValueContaining
	 *
	 */
	public Set<ProductProperty> findProductPropertyByValueContaining(String value_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByPrimaryKey
	 *
	 */
	public ProductProperty findProductPropertyByPrimaryKey(Integer proId_1, String key_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByPrimaryKey
	 *
	 */
	public ProductProperty findProductPropertyByPrimaryKey(Integer proId_1, String key_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByKeyContaining
	 *
	 */
	public Set<ProductProperty> findProductPropertyByKeyContaining(String key_2) throws DataAccessException;

	/**
	 * JPQL Query - findProductPropertyByKeyContaining
	 *
	 */
	public Set<ProductProperty> findProductPropertyByKeyContaining(String key_2, int startResult, int maxRows) throws DataAccessException;

}