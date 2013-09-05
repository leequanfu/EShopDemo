package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.PaywaysDAO;

import com.lqf.eshopdemo.domain.Payways;

import com.lqf.eshopdemo.service.PaywaysService;

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
 * Spring Rest controller that handles CRUD requests for Payways entities
 * 
 */

@Controller("PaywaysRestController")
public class PaywaysRestController {

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
	@RequestMapping(value = "/Payways/{payways_way}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePayways(@PathVariable String payways_way) {
		Payways payways = paywaysDAO.findPaywaysByPrimaryKey(payways_way);
		paywaysService.deletePayways(payways);
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
	 * Select an existing Payways entity
	 * 
	 */
	@RequestMapping(value = "/Payways/{payways_way}", method = RequestMethod.GET)
	@ResponseBody
	public Payways loadPayways(@PathVariable String payways_way) {
		return paywaysDAO.findPaywaysByPrimaryKey(payways_way);
	}

	/**
	 * Create a new Payways entity
	 * 
	 */
	@RequestMapping(value = "/Payways", method = RequestMethod.POST)
	@ResponseBody
	public Payways newPayways(@RequestBody Payways payways) {
		paywaysService.savePayways(payways);
		return paywaysDAO.findPaywaysByPrimaryKey(payways.getWay());
	}

	/**
	 * Show all Payways entities
	 * 
	 */
	@RequestMapping(value = "/Payways", method = RequestMethod.GET)
	@ResponseBody
	public List<Payways> listPaywayss() {
		return new java.util.ArrayList<Payways>(paywaysService.loadPaywayss());
	}

	/**
	 * Save an existing Payways entity
	 * 
	 */
	@RequestMapping(value = "/Payways", method = RequestMethod.PUT)
	@ResponseBody
	public Payways savePayways(@RequestBody Payways payways) {
		paywaysService.savePayways(payways);
		return paywaysDAO.findPaywaysByPrimaryKey(payways.getWay());
	}
}