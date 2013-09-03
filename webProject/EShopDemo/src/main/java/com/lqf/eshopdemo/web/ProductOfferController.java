package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.OfferDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;

import com.lqf.eshopdemo.service.ProductOfferService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductOffer entities
 * 
 */

@Controller("ProductOfferController")
public class ProductOfferController {

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
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/deleteProductOfferProductDetail")
	public ModelAndView deleteProductOfferProductDetail(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		ProductOffer productoffer = productOfferService.deleteProductOfferProductDetail(productoffer_proId, productoffer_offerId, related_productdetail_id);

		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productoffer", productoffer);
		mav.setViewName("productoffer/viewProductOffer.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/editProductOfferProductDetail")
	public ModelAndView editProductOfferProductDetail(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productoffer/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Select the child Offer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductOfferOffer")
	public ModelAndView confirmDeleteProductOfferOffer(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer related_offer_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offer", offerDAO.findOfferByPrimaryKey(related_offer_id));
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.setViewName("productoffer/offer/deleteOffer.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/saveProductOfferProductDetail")
	public ModelAndView saveProductOfferProductDetail(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @ModelAttribute ProductDetail productdetail) {
		ProductOffer parent_productoffer = productOfferService.saveProductOfferProductDetail(productoffer_proId, productoffer_offerId, productdetail);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productoffer", parent_productoffer);
		mav.setViewName("productoffer/viewProductOffer.jsp");

		return mav;
	}

	/**
	 * Edit an existing Offer entity
	 * 
	 */
	@RequestMapping("/editProductOfferOffer")
	public ModelAndView editProductOfferOffer(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer offer_id) {
		Offer offer = offerDAO.findOfferByPrimaryKey(offer_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("offer", offer);
		mav.setViewName("productoffer/offer/editOffer.jsp");

		return mav;
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/selectProductOfferProductDetail")
	public ModelAndView selectProductOfferProductDetail(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productoffer/productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/selectProductOffer")
	public ModelAndView selectProductOffer(@RequestParam Integer proIdKey, @RequestParam Integer offerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(proIdKey, offerIdKey));
		mav.setViewName("productoffer/viewProductOffer.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/deleteProductOffer")
	public String deleteProductOffer(@RequestParam Integer proIdKey, @RequestParam Integer offerIdKey) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(proIdKey, offerIdKey);
		productOfferService.deleteProductOffer(productoffer);
		return "forward:/indexProductOffer";
	}

	/**
	 * Create a new ProductOffer entity
	 * 
	 */
	@RequestMapping("/newProductOffer")
	public ModelAndView newProductOffer() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", new ProductOffer());
		mav.addObject("newFlag", true);
		mav.setViewName("productoffer/editProductOffer.jsp");

		return mav;
	}

	/**
	 * View an existing Offer entity
	 * 
	 */
	@RequestMapping("/selectProductOfferOffer")
	public ModelAndView selectProductOfferOffer(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer offer_id) {
		Offer offer = offerDAO.findOfferByPrimaryKey(offer_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("offer", offer);
		mav.setViewName("productoffer/offer/viewOffer.jsp");

		return mav;
	}

	/**
	 * Select the ProductOffer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductOffer")
	public ModelAndView confirmDeleteProductOffer(@RequestParam Integer proIdKey, @RequestParam Integer offerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(proIdKey, offerIdKey));
		mav.setViewName("productoffer/deleteProductOffer.jsp");

		return mav;
	}

	/**
	 * Show all ProductOffer entities
	 * 
	 */
	@RequestMapping("/indexProductOffer")
	public ModelAndView listProductOffers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffers", productOfferService.loadProductOffers());

		mav.setViewName("productoffer/listProductOffers.jsp");

		return mav;
	}

	/**
	 * Save an existing Offer entity
	 * 
	 */
	@RequestMapping("/saveProductOfferOffer")
	public ModelAndView saveProductOfferOffer(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @ModelAttribute Offer offer) {
		ProductOffer parent_productoffer = productOfferService.saveProductOfferOffer(productoffer_proId, productoffer_offerId, offer);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productoffer", parent_productoffer);
		mav.setViewName("productoffer/viewProductOffer.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productofferController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Offer entities by ProductOffer
	 * 
	 */
	@RequestMapping("/listProductOfferOffer")
	public ModelAndView listProductOfferOffer(@RequestParam Integer proIdKey, @RequestParam Integer offerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(proIdKey, offerIdKey));
		mav.setViewName("productoffer/offer/listOffer.jsp");

		return mav;
	}

	/**
	 * Select the child ProductDetail entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductOfferProductDetail")
	public ModelAndView confirmDeleteProductOfferProductDetail(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id));
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.setViewName("productoffer/productdetail/deleteProductDetail.jsp");

		return mav;
	}

	/**
	 * Show all ProductDetail entities by ProductOffer
	 * 
	 */
	@RequestMapping("/listProductOfferProductDetail")
	public ModelAndView listProductOfferProductDetail(@RequestParam Integer proIdKey, @RequestParam Integer offerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(proIdKey, offerIdKey));
		mav.setViewName("productoffer/productdetail/listProductDetail.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/editProductOffer")
	public ModelAndView editProductOffer(@RequestParam Integer proIdKey, @RequestParam Integer offerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(proIdKey, offerIdKey));
		mav.setViewName("productoffer/editProductOffer.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/saveProductOffer")
	public String saveProductOffer(@ModelAttribute ProductOffer productoffer) {
		productOfferService.saveProductOffer(productoffer);
		return "forward:/indexProductOffer";
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

	/**
	 * Create a new Offer entity
	 * 
	 */
	@RequestMapping("/newProductOfferOffer")
	public ModelAndView newProductOfferOffer(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("offer", new Offer());
		mav.addObject("newFlag", true);
		mav.setViewName("productoffer/offer/editOffer.jsp");

		return mav;
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping("/newProductOfferProductDetail")
	public ModelAndView newProductOfferProductDetail(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productdetail", new ProductDetail());
		mav.addObject("newFlag", true);
		mav.setViewName("productoffer/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductOffer entities
	 * 
	 */
	public String indexProductOffer() {
		return "redirect:/indexProductOffer";
	}

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	@RequestMapping("/deleteProductOfferOffer")
	public ModelAndView deleteProductOfferOffer(@RequestParam Integer productoffer_proId, @RequestParam Integer productoffer_offerId, @RequestParam Integer related_offer_id) {
		ModelAndView mav = new ModelAndView();

		ProductOffer productoffer = productOfferService.deleteProductOfferOffer(productoffer_proId, productoffer_offerId, related_offer_id);

		mav.addObject("productoffer_proId", productoffer_proId);
		mav.addObject("productoffer_offerId", productoffer_offerId);
		mav.addObject("productoffer", productoffer);
		mav.setViewName("productoffer/viewProductOffer.jsp");

		return mav;
	}
}