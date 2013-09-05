package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.OfferDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductOffer;

import com.lqf.eshopdemo.service.OfferService;

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
 * Spring MVC controller that handles CRUD requests for Offer entities
 * 
 */

@Controller("OfferController")
public class OfferController {

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
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/deleteOfferProductOffers")
	public ModelAndView deleteOfferProductOffers(@RequestParam Integer offer_id, @RequestParam Integer related_productoffers_proId, @RequestParam Integer related_productoffers_offerId) {
		ModelAndView mav = new ModelAndView();

		Offer offer = offerService.deleteOfferProductOffers(offer_id, related_productoffers_proId, related_productoffers_offerId);

		mav.addObject("offer_id", offer_id);
		mav.addObject("offer", offer);
		mav.setViewName("offer/viewOffer.jsp");

		return mav;
	}

	/**
	 * View an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/selectOfferProductOffers")
	public ModelAndView selectOfferProductOffers(@RequestParam Integer offer_id, @RequestParam Integer productoffers_proId, @RequestParam Integer productoffers_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffers_proId, productoffers_offerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("offer_id", offer_id);
		mav.addObject("productoffer", productoffer);
		mav.setViewName("offer/productoffers/viewProductOffers.jsp");

		return mav;
	}

	/**
	 * Save an existing Offer entity
	 * 
	 */
	@RequestMapping("/saveOffer")
	public String saveOffer(@ModelAttribute Offer offer) {
		offerService.saveOffer(offer);
		return "forward:/indexOffer";
	}

	/**
	 * Create a new Offer entity
	 * 
	 */
	@RequestMapping("/newOffer")
	public ModelAndView newOffer() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offer", new Offer());
		mav.addObject("newFlag", true);
		mav.setViewName("offer/editOffer.jsp");

		return mav;
	}

	/**
	 * Show all Offer entities
	 * 
	 */
	@RequestMapping("/indexOffer")
	public ModelAndView listOffers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offers", offerService.loadOffers());

		mav.setViewName("offer/listOffers.jsp");

		return mav;
	}

	/**
	 * Select an existing Offer entity
	 * 
	 */
	@RequestMapping("/selectOffer")
	public ModelAndView selectOffer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offer", offerDAO.findOfferByPrimaryKey(idKey));
		mav.setViewName("offer/viewOffer.jsp");

		return mav;
	}

	/**
	 * Show all ProductOffer entities by Offer
	 * 
	 */
	@RequestMapping("/listOfferProductOffers")
	public ModelAndView listOfferProductOffers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offer", offerDAO.findOfferByPrimaryKey(idKey));
		mav.setViewName("offer/productoffers/listProductOffers.jsp");

		return mav;
	}

	/**
	 * Delete an existing Offer entity
	 * 
	 */
	@RequestMapping("/deleteOffer")
	public String deleteOffer(@RequestParam Integer idKey) {
		Offer offer = offerDAO.findOfferByPrimaryKey(idKey);
		offerService.deleteOffer(offer);
		return "forward:/indexOffer";
	}

	/**
	 * Edit an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/editOfferProductOffers")
	public ModelAndView editOfferProductOffers(@RequestParam Integer offer_id, @RequestParam Integer productoffers_proId, @RequestParam Integer productoffers_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffers_proId, productoffers_offerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("offer_id", offer_id);
		mav.addObject("productoffer", productoffer);
		mav.setViewName("offer/productoffers/editProductOffers.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/offerController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new ProductOffer entity
	 * 
	 */
	@RequestMapping("/newOfferProductOffers")
	public ModelAndView newOfferProductOffers(@RequestParam Integer offer_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("offer_id", offer_id);
		mav.addObject("productoffer", new ProductOffer());
		mav.addObject("newFlag", true);
		mav.setViewName("offer/productoffers/editProductOffers.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Offer entities
	 * 
	 */
	public String indexOffer() {
		return "redirect:/indexOffer";
	}

	/**
	 * Select the Offer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOffer")
	public ModelAndView confirmDeleteOffer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offer", offerDAO.findOfferByPrimaryKey(idKey));
		mav.setViewName("offer/deleteOffer.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/saveOfferProductOffers")
	public ModelAndView saveOfferProductOffers(@RequestParam Integer offer_id, @ModelAttribute ProductOffer productoffers) {
		Offer parent_offer = offerService.saveOfferProductOffers(offer_id, productoffers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("offer_id", offer_id);
		mav.addObject("offer", parent_offer);
		mav.setViewName("offer/viewOffer.jsp");

		return mav;
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
	 * Edit an existing Offer entity
	 * 
	 */
	@RequestMapping("/editOffer")
	public ModelAndView editOffer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("offer", offerDAO.findOfferByPrimaryKey(idKey));
		mav.setViewName("offer/editOffer.jsp");

		return mav;
	}

	/**
	 * Select the child ProductOffer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOfferProductOffers")
	public ModelAndView confirmDeleteOfferProductOffers(@RequestParam Integer offer_id, @RequestParam Integer related_productoffers_proId, @RequestParam Integer related_productoffers_offerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(related_productoffers_proId, related_productoffers_offerId));
		mav.addObject("offer_id", offer_id);
		mav.setViewName("offer/productoffers/deleteProductOffers.jsp");

		return mav;
	}
}