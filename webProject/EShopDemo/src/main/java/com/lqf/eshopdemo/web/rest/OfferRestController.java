package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.OfferDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductOffer;

import com.lqf.eshopdemo.service.OfferService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Offer entities
 * 
 */

@Controller("OfferRestController")
public class OfferRestController {

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
	 * Service injected by Spring that provides CRUD operations for Offer entities
	 * 
	 */
	@Autowired
	private OfferService offerService;

	/**
	 * Create a new Offer entity
	 * 
	 */
	@RequestMapping(value = "/Offer", method = RequestMethod.POST)
	@ResponseBody
	public Offer newOffer(@RequestBody Offer offer) {
		offerService.saveOffer(offer);
		return offerDAO.findOfferByPrimaryKey(offer.getId());
	}

	/**
	 * Show all ProductOffer entities by Offer
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}/productOffers", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductOffer> getOfferProductOffers(@PathVariable Integer offer_id) {
		return new java.util.ArrayList<ProductOffer>(offerDAO.findOfferByPrimaryKey(offer_id).getProductOffers());
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}/productOffers/{productoffer_proId}/{productoffer_offerId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOfferProductOffers(@PathVariable Integer offer_id, @PathVariable Integer related_productoffers_proId, @PathVariable Integer related_productoffers_offerId) {
		offerService.deleteOfferProductOffers(offer_id, related_productoffers_proId, related_productoffers_offerId);
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}/productOffers", method = RequestMethod.PUT)
	@ResponseBody
	public ProductOffer saveOfferProductOffers(@PathVariable Integer offer_id, @RequestBody ProductOffer productoffers) {
		offerService.saveOfferProductOffers(offer_id, productoffers);
		return productOfferDAO.findProductOfferByPrimaryKey(productoffers.getProId(), productoffers.getOfferId());
	}

	/**
	 * Select an existing Offer entity
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}", method = RequestMethod.GET)
	@ResponseBody
	public Offer loadOffer(@PathVariable Integer offer_id) {
		return offerDAO.findOfferByPrimaryKey(offer_id);
	}

	/**
	 * Create a new ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}/productOffers", method = RequestMethod.POST)
	@ResponseBody
	public ProductOffer newOfferProductOffers(@PathVariable Integer offer_id, @RequestBody ProductOffer productoffer) {
		offerService.saveOfferProductOffers(offer_id, productoffer);
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer.getProId(), productoffer.getOfferId());
	}

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOffer(@PathVariable Integer offer_id) {
		Offer offer = offerDAO.findOfferByPrimaryKey(offer_id);
		offerService.deleteOffer(offer);
	}

	/**
	 * Show all Offer entities
	 * 
	 */
	@RequestMapping(value = "/Offer", method = RequestMethod.GET)
	@ResponseBody
	public List<Offer> listOffers() {
		return new java.util.ArrayList<Offer>(offerService.loadOffers());
	}

	/**
	 * View an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/Offer/{offer_id}/productOffers/{productoffer_proId}/{productoffer_offerId}", method = RequestMethod.GET)
	@ResponseBody
	public ProductOffer loadOfferProductOffers(@PathVariable Integer offer_id, @PathVariable Integer related_productoffers_proId, @PathVariable Integer related_productoffers_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(related_productoffers_proId, related_productoffers_offerId, -1, -1);

		return productoffer;
	}

	/**
	 * Save an existing Offer entity
	 * 
	 */
	@RequestMapping(value = "/Offer", method = RequestMethod.PUT)
	@ResponseBody
	public Offer saveOffer(@RequestBody Offer offer) {
		offerService.saveOffer(offer);
		return offerDAO.findOfferByPrimaryKey(offer.getId());
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}