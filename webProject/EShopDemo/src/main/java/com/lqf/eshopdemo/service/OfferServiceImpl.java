package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.OfferDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductOffer;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Offer entities
 * 
 */

@Service("OfferService")
@Transactional
public class OfferServiceImpl implements OfferService {

	/**
	 * DAO injected by Spring that manages Offer entities
	 * 
	 */
	@Autowired
	private OfferDAO offerDAO;

	/**
	 * DAO injected by Spring that manages ProductOffer entities
	 * 
	 */
	@Autowired
	private ProductOfferDAO productOfferDAO;

	/**
	 * Instantiates a new OfferServiceImpl.
	 *
	 */
	public OfferServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Offer findOfferByPrimaryKey(Integer id) {
		return offerDAO.findOfferByPrimaryKey(id);
	}

	/**
	 * Load an existing Offer entity
	 * 
	 */
	@Transactional
	public Set<Offer> loadOffers() {
		return offerDAO.findAllOffers();
	}

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	@Transactional
	public void deleteOffer(Offer offer) {
		offerDAO.remove(offer);
		offerDAO.flush();
	}

	/**
	 * Return all Offer entity
	 * 
	 */
	@Transactional
	public List<Offer> findAllOffers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Offer>(offerDAO.findAllOffers(startResult, maxRows));
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public Offer deleteOfferProductOffers(Integer offer_id, Integer related_productoffers_proId, Integer related_productoffers_offerId) {
		ProductOffer related_productoffers = productOfferDAO.findProductOfferByPrimaryKey(related_productoffers_proId, related_productoffers_offerId, -1, -1);

		Offer offer = offerDAO.findOfferByPrimaryKey(offer_id, -1, -1);

		related_productoffers.setOffer(null);
		offer.getProductOffers().remove(related_productoffers);

		productOfferDAO.remove(related_productoffers);
		productOfferDAO.flush();

		return offer;
	}

	/**
	 * Save an existing Offer entity
	 * 
	 */
	@Transactional
	public void saveOffer(Offer offer) {
		Offer existingOffer = offerDAO.findOfferByPrimaryKey(offer.getId());

		if (existingOffer != null) {
			if (existingOffer != offer) {
				existingOffer.setId(offer.getId());
				existingOffer.setDescription(offer.getDescription());
			}
			offer = offerDAO.store(existingOffer);
		} else {
			offer = offerDAO.store(offer);
		}
		offerDAO.flush();
	}

	/**
	 * Return a count of all Offer entity
	 * 
	 */
	@Transactional
	public Integer countOffers() {
		return ((Long) offerDAO.createQuerySingleResult("select count(o) from Offer o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public Offer saveOfferProductOffers(Integer id, ProductOffer related_productoffers) {
		Offer offer = offerDAO.findOfferByPrimaryKey(id, -1, -1);
		ProductOffer existingproductOffers = productOfferDAO.findProductOfferByPrimaryKey(related_productoffers.getProId(), related_productoffers.getOfferId());

		// copy into the existing record to preserve existing relationships
		if (existingproductOffers != null) {
			existingproductOffers.setProId(related_productoffers.getProId());
			existingproductOffers.setOfferId(related_productoffers.getOfferId());
			related_productoffers = existingproductOffers;
		} else {
			related_productoffers = productOfferDAO.store(related_productoffers);
			productOfferDAO.flush();
		}

		related_productoffers.setOffer(offer);
		offer.getProductOffers().add(related_productoffers);
		related_productoffers = productOfferDAO.store(related_productoffers);
		productOfferDAO.flush();

		offer = offerDAO.store(offer);
		offerDAO.flush();

		return offer;
	}
}
