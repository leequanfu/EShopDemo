package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.OfferDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductOffer entities
 * 
 */

@Service("ProductOfferService")
@Transactional
public class ProductOfferServiceImpl implements ProductOfferService {

	/**
	 * DAO injected by Spring that manages Offer entities
	 * 
	 */
	@Autowired
	private OfferDAO offerDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * DAO injected by Spring that manages ProductOffer entities
	 * 
	 */
	@Autowired
	private ProductOfferDAO productOfferDAO;

	/**
	 * Instantiates a new ProductOfferServiceImpl.
	 *
	 */
	public ProductOfferServiceImpl() {
	}

	/**
	 * Return all ProductOffer entity
	 * 
	 */
	@Transactional
	public List<ProductOffer> findAllProductOffers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductOffer>(productOfferDAO.findAllProductOffers(startResult, maxRows));
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public ProductOffer deleteProductOfferProductDetail(Integer productoffer_proId, Integer productoffer_offerId, Integer related_productdetail_id) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffer_proId, productoffer_offerId, -1, -1);
		ProductDetail related_productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		productoffer.setProductDetail(null);
		related_productdetail.getProductOffers().remove(productoffer);
		productoffer = productOfferDAO.store(productoffer);
		productOfferDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		productDetailDAO.remove(related_productdetail);
		productDetailDAO.flush();

		return productoffer;
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public void saveProductOffer(ProductOffer productoffer) {
		ProductOffer existingProductOffer = productOfferDAO.findProductOfferByPrimaryKey(productoffer.getProId(), productoffer.getOfferId());

		if (existingProductOffer != null) {
			if (existingProductOffer != productoffer) {
				existingProductOffer.setProId(productoffer.getProId());
				existingProductOffer.setOfferId(productoffer.getOfferId());
			}
			productoffer = productOfferDAO.store(existingProductOffer);
		} else {
			productoffer = productOfferDAO.store(productoffer);
		}
		productOfferDAO.flush();
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public ProductOffer saveProductOfferProductDetail(Integer proId, Integer offerId, ProductDetail related_productdetail) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(proId, offerId, -1, -1);
		ProductDetail existingproductDetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproductDetail != null) {
			existingproductDetail.setId(related_productdetail.getId());
			existingproductDetail.setTitle(related_productdetail.getTitle());
			existingproductDetail.setPrice(related_productdetail.getPrice());
			existingproductDetail.setQuantity(related_productdetail.getQuantity());
			existingproductDetail.setDescription(related_productdetail.getDescription());
			existingproductDetail.setPicnum(related_productdetail.getPicnum());
			related_productdetail = existingproductDetail;
		} else {
			related_productdetail = productDetailDAO.store(related_productdetail);
			productDetailDAO.flush();
		}

		productoffer.setProductDetail(related_productdetail);
		related_productdetail.getProductOffers().add(productoffer);
		productoffer = productOfferDAO.store(productoffer);
		productOfferDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		return productoffer;
	}

	/**
	 * Return a count of all ProductOffer entity
	 * 
	 */
	@Transactional
	public Integer countProductOffers() {
		return ((Long) productOfferDAO.createQuerySingleResult("select count(*) from ProductOffer o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Offer entity
	 * 
	 */
	@Transactional
	public ProductOffer saveProductOfferOffer(Integer proId, Integer offerId, Offer related_offer) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(proId, offerId, -1, -1);
		Offer existingoffer = offerDAO.findOfferByPrimaryKey(related_offer.getId());

		// copy into the existing record to preserve existing relationships
		if (existingoffer != null) {
			existingoffer.setId(related_offer.getId());
			existingoffer.setDescription(related_offer.getDescription());
			related_offer = existingoffer;
		} else {
			related_offer = offerDAO.store(related_offer);
			offerDAO.flush();
		}

		productoffer.setOffer(related_offer);
		related_offer.getProductOffers().add(productoffer);
		productoffer = productOfferDAO.store(productoffer);
		productOfferDAO.flush();

		related_offer = offerDAO.store(related_offer);
		offerDAO.flush();

		return productoffer;
	}

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	@Transactional
	public ProductOffer deleteProductOfferOffer(Integer productoffer_proId, Integer productoffer_offerId, Integer related_offer_id) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffer_proId, productoffer_offerId, -1, -1);
		Offer related_offer = offerDAO.findOfferByPrimaryKey(related_offer_id, -1, -1);

		productoffer.setOffer(null);
		related_offer.getProductOffers().remove(productoffer);
		productoffer = productOfferDAO.store(productoffer);
		productOfferDAO.flush();

		related_offer = offerDAO.store(related_offer);
		offerDAO.flush();

		offerDAO.remove(related_offer);
		offerDAO.flush();

		return productoffer;
	}

	/**
	 */
	@Transactional
	public ProductOffer findProductOfferByPrimaryKey(Integer proId, Integer offerId) {
		return productOfferDAO.findProductOfferByPrimaryKey(proId, offerId);
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public void deleteProductOffer(ProductOffer productoffer) {
		productOfferDAO.remove(productoffer);
		productOfferDAO.flush();
	}

	/**
	 * Load an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public Set<ProductOffer> loadProductOffers() {
		return productOfferDAO.findAllProductOffers();
	}
}
