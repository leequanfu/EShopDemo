package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ProductOffer entities
 * 
 */
public interface ProductOfferService {

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	public ProductOffer deleteProductOfferOffer(Integer productoffer_proId, Integer productoffer_offerId, Integer related_offer_id);

	/**
	 */
	public ProductOffer findProductOfferByPrimaryKey(Integer proId, Integer offerId);

	/**
	 * Load an existing ProductOffer entity
	 * 
	 */
	public Set<ProductOffer> loadProductOffers();

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	public ProductOffer saveProductOfferProductDetail(Integer proId_1, Integer offerId_1, ProductDetail related_productdetail);

	/**
	 * Save an existing Offer entity
	 * 
	 */
	public ProductOffer saveProductOfferOffer(Integer proId_2, Integer offerId_2, Offer related_offer);

	/**
	 * Return all ProductOffer entity
	 * 
	 */
	public List<ProductOffer> findAllProductOffers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	public ProductOffer deleteProductOfferProductDetail(Integer productoffer_proId_1, Integer productoffer_offerId_1, Integer related_productdetail_id);

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	public void deleteProductOffer(ProductOffer productoffer);

	/**
	 * Return a count of all ProductOffer entity
	 * 
	 */
	public Integer countProductOffers();

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	public void saveProductOffer(ProductOffer productoffer_1);
}