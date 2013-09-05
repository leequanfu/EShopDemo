package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.PaywaysDAO;

import com.lqf.eshopdemo.domain.Payways;

import com.lqf.eshopdemo.service.PaywaysService;

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
 * Spring MVC controller that handles CRUD requests for Payways entities
 * 
 */

@Controller("PaywaysController")
public class PaywaysController {

	/**
	 * DAO injected by Spring that manages Payways entities
	 * 
	 */
	@Autowired
	private PaywaysDAO paywaysDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Payways entities
	 * 
	 */
	@Autowired
	private PaywaysService paywaysService;

	/**
	 * Delete an existing Payways entity
	 * 
	 */
	@RequestMapping("/deletePayways")
	public String deletePayways(@RequestParam String wayKey) {
		Payways payways = paywaysDAO.findPaywaysByPrimaryKey(wayKey);
		paywaysService.deletePayways(payways);
		return "forward:/indexPayways";
	}

	/**
	 * Save an existing Payways entity
	 * 
	 */
	@RequestMapping("/savePayways")
	public String savePayways(@ModelAttribute Payways payways) {
		paywaysService.savePayways(payways);
		return "forward:/indexPayways";
	}

	/**
	 * Entry point to show all Payways entities
	 * 
	 */
	public String indexPayways() {
		return "redirect:/indexPayways";
	}

	/**
	 * Edit an existing Payways entity
	 * 
	 */
	@RequestMapping("/editPayways")
	public ModelAndView editPayways(@RequestParam String wayKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("payways", paywaysDAO.findPaywaysByPrimaryKey(wayKey));
		mav.setViewName("payways/editPayways.jsp");

		return mav;
	}

	/**
	 * Show all Payways entities
	 * 
	 */
	@RequestMapping("/indexPayways")
	public ModelAndView listPaywayss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("paywayss", paywaysService.loadPaywayss());

		mav.setViewName("payways/listPaywayss.jsp");

		return mav;
	}

	/**
	 * Create a new Payways entity
	 * 
	 */
	@RequestMapping("/newPayways")
	public ModelAndView newPayways() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("payways", new Payways());
		mav.addObject("newFlag", true);
		mav.setViewName("payways/editPayways.jsp");

		return mav;
	}

	/**
	 * Select an existing Payways entity
	 * 
	 */
	@RequestMapping("/selectPayways")
	public ModelAndView selectPayways(@RequestParam String wayKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("payways", paywaysDAO.findPaywaysByPrimaryKey(wayKey));
		mav.setViewName("payways/viewPayways.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/paywaysController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the Payways entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePayways")
	public ModelAndView confirmDeletePayways(@RequestParam String wayKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("payways", paywaysDAO.findPaywaysByPrimaryKey(wayKey));
		mav.setViewName("payways/deletePayways.jsp");

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
}