package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Catalog;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Catalog entities.
 * 
 */
public interface CatalogDAO extends JpaDao<Catalog> {

	/**
	 * JPQL Query - findCatalogByNameContaining
	 *
	 */
	public Set<Catalog> findCatalogByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogByNameContaining
	 *
	 */
	public Set<Catalog> findCatalogByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogByPrimaryKey
	 *
	 */
	public Catalog findCatalogByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogByPrimaryKey
	 *
	 */
	public Catalog findCatalogByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogById
	 *
	 */
	public Catalog findCatalogById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogById
	 *
	 */
	public Catalog findCatalogById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogByName
	 *
	 */
	public Set<Catalog> findCatalogByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findCatalogByName
	 *
	 */
	public Set<Catalog> findCatalogByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCatalogs
	 *
	 */
	public Set<Catalog> findAllCatalogs() throws DataAccessException;

	/**
	 * JPQL Query - findAllCatalogs
	 *
	 */
	public Set<Catalog> findAllCatalogs(int startResult, int maxRows) throws DataAccessException;

}