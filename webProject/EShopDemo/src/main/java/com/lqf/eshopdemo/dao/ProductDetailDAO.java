package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductDetail;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductDetail entities.
 * 
 */
public interface ProductDetailDAO extends JpaDao<ProductDetail> {

	/**
	 * JPQL Query - findAllProductDetails
	 *
	 */
	public Set<ProductDetail> findAllProductDetails() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductDetails
	 *
	 */
	public Set<ProductDetail> findAllProductDetails(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByQuantity
	 *
	 */
	public Set<ProductDetail> findProductDetailByQuantity(Integer quantity) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByQuantity
	 *
	 */
	public Set<ProductDetail> findProductDetailByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByDescription
	 *
	 */
	public Set<ProductDetail> findProductDetailByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByDescription
	 *
	 */
	public Set<ProductDetail> findProductDetailByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByTitleContaining
	 *
	 */
	public Set<ProductDetail> findProductDetailByTitleContaining(String title) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByTitleContaining
	 *
	 */
	public Set<ProductDetail> findProductDetailByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByPrimaryKey
	 *
	 */
	public ProductDetail findProductDetailByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByPrimaryKey
	 *
	 */
	public ProductDetail findProductDetailByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByTitle
	 *
	 */
	public Set<ProductDetail> findProductDetailByTitle(String title_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByTitle
	 *
	 */
	public Set<ProductDetail> findProductDetailByTitle(String title_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByPrice
	 *
	 */
	public Set<ProductDetail> findProductDetailByPrice(java.math.BigDecimal price) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByPrice
	 *
	 */
	public Set<ProductDetail> findProductDetailByPrice(BigDecimal price, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailById
	 *
	 */
	public ProductDetail findProductDetailById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailById
	 *
	 */
	public ProductDetail findProductDetailById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByPicnum
	 *
	 */
	public Set<ProductDetail> findProductDetailByPicnum(Integer picnum) throws DataAccessException;

	/**
	 * JPQL Query - findProductDetailByPicnum
	 *
	 */
	public Set<ProductDetail> findProductDetailByPicnum(Integer picnum, int startResult, int maxRows) throws DataAccessException;

}