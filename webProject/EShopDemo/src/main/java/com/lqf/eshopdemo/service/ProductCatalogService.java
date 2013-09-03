package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ProductCatalog entities
 * 
 */
public interface ProductCatalogService {

	/**
	 * Return all ProductCatalog entity
	 * 
	 */
	public List<ProductCatalog> findAllProductCatalogs(Integer startResult, Integer maxRows);

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	public ProductCatalog saveProductCatalogProductDetail(Integer productId, Integer catalogId, ProductDetail related_productdetail);

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	public ProductCatalog deleteProductCatalogProductDetail(Integer productcatalog_productId, Integer productcatalog_catalogId, Integer related_productdetail_id);

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	public void deleteProductCatalog(ProductCatalog productcatalog);

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	public ProductCatalog deleteProductCatalogCatalog(Integer productcatalog_productId_1, Integer productcatalog_catalogId_1, Integer related_catalog_id);

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	public ProductCatalog saveProductCatalogCatalog(Integer productId_1, Integer catalogId_1, Catalog related_catalog);

	/**
	 * Load an existing ProductCatalog entity
	 * 
	 */
	public Set<ProductCatalog> loadProductCatalogs();

	/**
	 * Return a count of all ProductCatalog entity
	 * 
	 */
	public Integer countProductCatalogs();

	/**
	 */
	public ProductCatalog findProductCatalogByPrimaryKey(Integer productId_2, Integer catalogId_2);

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	public void saveProductCatalog(ProductCatalog productcatalog_1);
}