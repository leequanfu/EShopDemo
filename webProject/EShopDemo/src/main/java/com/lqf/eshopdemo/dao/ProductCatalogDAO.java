package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductCatalog;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductCatalog entities.
 * 
 */
public interface ProductCatalogDAO extends JpaDao<ProductCatalog> {

	/**
	 * JPQL Query - findProductCatalogByProductId
	 *
	 */
	public Set<ProductCatalog> findProductCatalogByProductId(Integer productId) throws DataAccessException;

	/**
	 * JPQL Query - findProductCatalogByProductId
	 *
	 */
	public Set<ProductCatalog> findProductCatalogByProductId(Integer productId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductCatalogs
	 *
	 */
	public Set<ProductCatalog> findAllProductCatalogs() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductCatalogs
	 *
	 */
	public Set<ProductCatalog> findAllProductCatalogs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductCatalogByPrimaryKey
	 *
	 */
	public ProductCatalog findProductCatalogByPrimaryKey(Integer productId_1, Integer catalogId) throws DataAccessException;

	/**
	 * JPQL Query - findProductCatalogByPrimaryKey
	 *
	 */
	public ProductCatalog findProductCatalogByPrimaryKey(Integer productId_1, Integer catalogId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductCatalogByCatalogId
	 *
	 */
	public Set<ProductCatalog> findProductCatalogByCatalogId(Integer catalogId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductCatalogByCatalogId
	 *
	 */
	public Set<ProductCatalog> findProductCatalogByCatalogId(Integer catalogId_1, int startResult, int maxRows) throws DataAccessException;

}