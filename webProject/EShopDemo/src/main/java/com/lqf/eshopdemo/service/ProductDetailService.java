package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;
import com.lqf.eshopdemo.domain.ProductProperty;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ProductDetail entities
 * 
 */
public interface ProductDetailService {

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	public ProductDetail deleteProductDetailProductOffers(Integer productdetail_id, Integer related_productoffers_proId, Integer related_productoffers_offerId);

	/**
	 */
	public ProductDetail findProductDetailByPrimaryKey(Integer id);

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	public void saveProductDetail(ProductDetail productdetail);

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	public void deleteProductDetail(ProductDetail productdetail_1);

	/**
	 * Load an existing ProductDetail entity
	 * 
	 */
	public Set<ProductDetail> loadProductDetails();

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	public ProductDetail saveProductDetailOrderItemses(Integer id_1, OrderItems related_orderitemses);

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	public ProductDetail saveProductDetailProductOffers(Integer id_2, ProductOffer related_productoffers);

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	public ProductDetail deleteProductDetailCustomerComments(Integer productdetail_id_1, Integer related_customercomments_proId, Integer related_customercomments_userId);

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	public ProductDetail deleteProductDetailProductProperties(Integer productdetail_id_2, Integer related_productproperties_proId, String related_productproperties_key);

	/**
	 * Return a count of all ProductDetail entity
	 * 
	 */
	public Integer countProductDetails();

	/**
	 * Return all ProductDetail entity
	 * 
	 */
	public List<ProductDetail> findAllProductDetails(Integer startResult, Integer maxRows);

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	public ProductDetail saveProductDetailProductCatalogs(Integer id_3, ProductCatalog related_productcatalogs);

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	public ProductDetail saveProductDetailCustomerComments(Integer id_4, CustomerComment related_customercomments);

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	public ProductDetail deleteProductDetailOrderItemses(Integer productdetail_id_3, Integer related_orderitemses_orderId, Integer related_orderitemses_productId);

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	public ProductDetail saveProductDetailProductProperties(Integer id_5, ProductProperty related_productproperties);

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	public ProductDetail deleteProductDetailProductCatalogs(Integer productdetail_id_4, Integer related_productcatalogs_productId, Integer related_productcatalogs_catalogId);
}