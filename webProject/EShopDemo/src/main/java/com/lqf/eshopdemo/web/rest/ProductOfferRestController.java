package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.OfferDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;

import com.lqf.eshopdemo.service.ProductOfferService;

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
 * Spring Rest controller that handles CRUD requests for ProductOffer entities
 * 
 */

@Controller("ProductOfferRestController")
public class ProductOfferRestController {

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
	 * Service injected by Spring that provides CRUD operations for ProductOffer entities
	 * 
	 */
	@Autowired
	private ProductOfferService productOfferService;

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

	/**
	 * Show all ProductOffer entities
	 * 
	 */
	@RequestMapping(value = "/ProductOffer", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductOffer> listProductOffers() {
		return new java.util.ArrayList<ProductOffer>(productOfferService.loadProductOffers());
	}

	/**
	 * Get ProductDetail entity by ProductOffer
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail getProductOfferProductDetail(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId) {
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer_proId, productoffer_offerId).getProductDetail();
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer", method = RequestMethod.PUT)
	@ResponseBody
	public ProductOffer saveProductOffer(@RequestBody ProductOffer productoffer) {
		productOfferService.saveProductOffer(productoffer);
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer.getProId(), productoffer.getOfferId());
	}

	/**
	 * Create a new ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer", method = RequestMethod.POST)
	@ResponseBody
	public ProductOffer newProductOffer(@RequestBody ProductOffer productoffer) {
		productOfferService.saveProductOffer(productoffer);
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer.getProId(), productoffer.getOfferId());
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail", method = RequestMethod.POST)
	@ResponseBody
	public ProductDetail newProductOfferProductDetail(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @RequestBody ProductDetail productdetail) {
		productOfferService.saveProductOfferProductDetail(productoffer_proId, productoffer_offerId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * View an existing Offer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer/{offer_id}", method = RequestMethod.GET)
	@ResponseBody
	public Offer loadProductOfferOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @PathVariable Integer related_offer_id) {
		Offer offer = offerDAO.findOfferByPrimaryKey(related_offer_id, -1, -1);

		return offer;
	}

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer/{offer_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductOfferOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @PathVariable Integer related_offer_id) {
		productOfferService.deleteProductOfferOffer(productoffer_proId, productoffer_offerId, related_offer_id);
	}

	/**
	 * Create a new Offer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer", method = RequestMethod.POST)
	@ResponseBody
	public Offer newProductOfferOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @RequestBody Offer offer) {
		productOfferService.saveProductOfferOffer(productoffer_proId, productoffer_offerId, offer);
		return offerDAO.findOfferByPrimaryKey(offer.getId());
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail/{productdetail_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductOfferProductDetail(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @PathVariable Integer related_productdetail_id) {
		productOfferService.deleteProductOfferProductDetail(productoffer_proId, productoffer_offerId, related_productdetail_id);
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail/{productdetail_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail loadProductOfferProductDetail(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @PathVariable Integer related_productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		return productdetail;
	}

	/**
	 * Get Offer entity by ProductOffer
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer", method = RequestMethod.GET)
	@ResponseBody
	public Offer getProductOfferOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId) {
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer_proId, productoffer_offerId).getOffer();
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffer_proId, productoffer_offerId);
		productOfferService.deleteProductOffer(productoffer);
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail", method = RequestMethod.PUT)
	@ResponseBody
	public ProductDetail saveProductOfferProductDetail(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @RequestBody ProductDetail productdetail) {
		productOfferService.saveProductOfferProductDetail(productoffer_proId, productoffer_offerId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Select an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}", method = RequestMethod.GET)
	@ResponseBody
	public ProductOffer loadProductOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId) {
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer_proId, productoffer_offerId);
	}

	/**
	 * Save an existing Offer entity
	 * 
	 */
	@RequestMapping(value = "/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer", method = RequestMethod.PUT)
	@ResponseBody
	public Offer saveProductOfferOffer(@PathVariable Integer productoffer_proId, @PathVariable Integer productoffer_offerId, @RequestBody Offer offer) {
		productOfferService.saveProductOfferOffer(productoffer_proId, productoffer_offerId, offer);
		return offerDAO.findOfferByPrimaryKey(offer.getId());
	}
}