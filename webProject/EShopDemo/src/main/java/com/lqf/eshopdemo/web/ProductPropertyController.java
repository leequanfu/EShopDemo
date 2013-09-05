package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductPropertyDAO;

import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductProperty;

import com.lqf.eshopdemo.service.ProductPropertyService;

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
 * Spring MVC controller that handles CRUD requests for ProductProperty entities
 * 
 */

@Controller("ProductPropertyController")
public class ProductPropertyController {

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * DAO injected by Spring that manages ProductProperty entities
	 * 
	 */
	@Autowired
	private ProductPropertyDAO productPropertyDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ProductProperty entities
	 * 
	 */
	@Autowired
	private ProductPropertyService productPropertyService;

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping("/newProductPropertyProductDetail")
	public ModelAndView newProductPropertyProductDetail(@RequestParam Integer productproperty_proId, @RequestParam String productproperty_key) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productproperty_proId", productproperty_proId);
		mav.addObject("productproperty_key", productproperty_key);
		mav.addObject("productdetail", new ProductDetail());
		mav.addObject("newFlag", true);
		mav.setViewName("productproperty/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productpropertyController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all ProductProperty entities
	 * 
	 */
	public String indexProductProperty() {
		return "redirect:/indexProductProperty";
	}

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/saveProductProperty")
	public String saveProductProperty(@ModelAttribute ProductProperty productproperty) {
		productPropertyService.saveProductProperty(productproperty);
		return "forward:/indexProductProperty";
	}

	/**
	 * Select the child ProductDetail entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductPropertyProductDetail")
	public ModelAndView confirmDeleteProductPropertyProductDetail(@RequestParam Integer productproperty_proId, @RequestParam String productproperty_key, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id));
		mav.addObject("productproperty_proId", productproperty_proId);
		mav.addObject("productproperty_key", productproperty_key);
		mav.setViewName("productproperty/productdetail/deleteProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/deleteProductProperty")
	public String deleteProductProperty(@RequestParam Integer proIdKey, @RequestParam String keyKey) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(proIdKey, keyKey);
		productPropertyService.deleteProductProperty(productproperty);
		return "forward:/indexProductProperty";
	}

	/**
	 * Create a new ProductProperty entity
	 * 
	 */
	@RequestMapping("/newProductProperty")
	public ModelAndView newProductProperty() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productproperty", new ProductProperty());
		mav.addObject("newFlag", true);
		mav.setViewName("productproperty/editProductProperty.jsp");

		return mav;
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/selectProductPropertyProductDetail")
	public ModelAndView selectProductPropertyProductDetail(@RequestParam Integer productproperty_proId, @RequestParam String productproperty_key, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productproperty_proId", productproperty_proId);
		mav.addObject("productproperty_key", productproperty_key);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productproperty/productdetail/viewProductDetail.jsp");

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
	 * Edit an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/editProductProperty")
	public ModelAndView editProductProperty(@RequestParam Integer proIdKey, @RequestParam String keyKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productproperty", productPropertyDAO.findProductPropertyByPrimaryKey(proIdKey, keyKey));
		mav.setViewName("productproperty/editProductProperty.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/editProductPropertyProductDetail")
	public ModelAndView editProductPropertyProductDetail(@RequestParam Integer productproperty_proId, @RequestParam String productproperty_key, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productproperty_proId", productproperty_proId);
		mav.addObject("productproperty_key", productproperty_key);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productproperty/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Show all ProductProperty entities
	 * 
	 */
	@RequestMapping("/indexProductProperty")
	public ModelAndView listProductPropertys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productpropertys", productPropertyService.loadProductPropertys());

		mav.setViewName("productproperty/listProductPropertys.jsp");

		return mav;
	}

	/**
	 * Select the ProductProperty entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductProperty")
	public ModelAndView confirmDeleteProductProperty(@RequestParam Integer proIdKey, @RequestParam String keyKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productproperty", productPropertyDAO.findProductPropertyByPrimaryKey(proIdKey, keyKey));
		mav.setViewName("productproperty/deleteProductProperty.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/selectProductProperty")
	public ModelAndView selectProductProperty(@RequestParam Integer proIdKey, @RequestParam String keyKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productproperty", productPropertyDAO.findProductPropertyByPrimaryKey(proIdKey, keyKey));
		mav.setViewName("productproperty/viewProductProperty.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/saveProductPropertyProductDetail")
	public ModelAndView saveProductPropertyProductDetail(@RequestParam Integer productproperty_proId, @RequestParam String productproperty_key, @ModelAttribute ProductDetail productdetail) {
		ProductProperty parent_productproperty = productPropertyService.saveProductPropertyProductDetail(productproperty_proId, productproperty_key, productdetail);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productproperty_proId", productproperty_proId);
		mav.addObject("productproperty_key", productproperty_key);
		mav.addObject("productproperty", parent_productproperty);
		mav.setViewName("productproperty/viewProductProperty.jsp");

		return mav;
	}

	/**
	 * Show all ProductDetail entities by ProductProperty
	 * 
	 */
	@RequestMapping("/listProductPropertyProductDetail")
	public ModelAndView listProductPropertyProductDetail(@RequestParam Integer proIdKey, @RequestParam String keyKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productproperty", productPropertyDAO.findProductPropertyByPrimaryKey(proIdKey, keyKey));
		mav.setViewName("productproperty/productdetail/listProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/deleteProductPropertyProductDetail")
	public ModelAndView deleteProductPropertyProductDetail(@RequestParam Integer productproperty_proId, @RequestParam String productproperty_key, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		ProductProperty productproperty = productPropertyService.deleteProductPropertyProductDetail(productproperty_proId, productproperty_key, related_productdetail_id);

		mav.addObject("productproperty_proId", productproperty_proId);
		mav.addObject("productproperty_key", productproperty_key);
		mav.addObject("productproperty", productproperty);
		mav.setViewName("productproperty/viewProductProperty.jsp");

		return mav;
	}
}