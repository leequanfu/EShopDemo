package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Catalog entities
 * 
 */
public interface CatalogService {

	/**
	 * Return a count of all Catalog entity
	 * 
	 */
	public Integer countCatalogs();

	/**
	 * Load an existing Catalog entity
	 * 
	 */
	public Set<Catalog> loadCatalogs();

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	public void deleteCatalog(Catalog catalog);

	/**
	 * Return all Catalog entity
	 * 
	 */
	public List<Catalog> findAllCatalogs(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	public void saveCatalog(Catalog catalog_1);

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	public Catalog saveCatalogProductCatalogs(Integer id, ProductCatalog related_productcatalogs);

	/**
	 */
	public Catalog findCatalogByPrimaryKey(Integer id_1);

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	public Catalog deleteCatalogProductCatalogs(Integer catalog_id, Integer related_productcatalogs_productId, Integer related_productcatalogs_catalogId);
}