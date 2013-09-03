package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductOffer;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Offer entities
 * 
 */
public interface OfferService {

	/**
	 */
	public Offer findOfferByPrimaryKey(Integer id);

	/**
	 * Load an existing Offer entity
	 * 
	 */
	public Set<Offer> loadOffers();

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	public void deleteOffer(Offer offer);

	/**
	 * Return all Offer entity
	 * 
	 */
	public List<Offer> findAllOffers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	public Offer deleteOfferProductOffers(Integer offer_id, Integer related_productoffers_proId, Integer related_productoffers_offerId);

	/**
	 * Save an existing Offer entity
	 * 
	 */
	public void saveOffer(Offer offer_1);

	/**
	 * Return a count of all Offer entity
	 * 
	 */
	public Integer countOffers();

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	public Offer saveOfferProductOffers(Integer id_1, ProductOffer related_productoffers);
}