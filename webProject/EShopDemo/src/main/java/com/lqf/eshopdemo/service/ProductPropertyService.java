package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductProperty;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ProductProperty entities
 * 
 */
public interface ProductPropertyService {

	/**
	 * Return a count of all ProductProperty entity
	 * 
	 */
	public Integer countProductPropertys();

	/**
	 */
	public ProductProperty findProductPropertyByPrimaryKey(Integer proId, String key);

	/**
	 * Return all ProductProperty entity
	 * 
	 */
	public List<ProductProperty> findAllProductPropertys(Integer startResult, Integer maxRows);

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	public void saveProductProperty(ProductProperty productproperty);

	/**
	 * Load an existing ProductProperty entity
	 * 
	 */
	public Set<ProductProperty> loadProductPropertys();

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	public ProductProperty deleteProductPropertyProductDetail(Integer productproperty_proId, String productproperty_key, Integer related_productdetail_id);

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	public void deleteProductProperty(ProductProperty productproperty_1);

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	public ProductProperty saveProductPropertyProductDetail(Integer proId_1, String key_1, ProductDetail related_productdetail);
}