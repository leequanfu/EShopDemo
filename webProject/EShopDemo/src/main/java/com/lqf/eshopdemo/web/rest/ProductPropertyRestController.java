package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductPropertyDAO;

import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductProperty;

import com.lqf.eshopdemo.service.ProductPropertyService;

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
 * Spring Rest controller that handles CRUD requests for ProductProperty entities
 * 
 */

@Controller("ProductPropertyRestController")
public class ProductPropertyRestController {

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
	 * Show all ProductProperty entities
	 * 
	 */
	@RequestMapping(value = "/ProductProperty", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductProperty> listProductPropertys() {
		return new java.util.ArrayList<ProductProperty>(productPropertyService.loadProductPropertys());
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail/{productdetail_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductPropertyProductDetail(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key, @PathVariable Integer related_productdetail_id) {
		productPropertyService.deleteProductPropertyProductDetail(productproperty_proId, productproperty_key, related_productdetail_id);
	}

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty", method = RequestMethod.PUT)
	@ResponseBody
	public ProductProperty saveProductProperty(@RequestBody ProductProperty productproperty) {
		productPropertyService.saveProductProperty(productproperty);
		return productPropertyDAO.findProductPropertyByPrimaryKey(productproperty.getProId(), productproperty.getKey());
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
	 * Create a new ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty", method = RequestMethod.POST)
	@ResponseBody
	public ProductProperty newProductProperty(@RequestBody ProductProperty productproperty) {
		productPropertyService.saveProductProperty(productproperty);
		return productPropertyDAO.findProductPropertyByPrimaryKey(productproperty.getProId(), productproperty.getKey());
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail", method = RequestMethod.POST)
	@ResponseBody
	public ProductDetail newProductPropertyProductDetail(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key, @RequestBody ProductDetail productdetail) {
		productPropertyService.saveProductPropertyProductDetail(productproperty_proId, productproperty_key, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductProperty(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(productproperty_proId, productproperty_key);
		productPropertyService.deleteProductProperty(productproperty);
	}

	/**
	 * Get ProductDetail entity by ProductProperty
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail getProductPropertyProductDetail(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key) {
		return productPropertyDAO.findProductPropertyByPrimaryKey(productproperty_proId, productproperty_key).getProductDetail();
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail", method = RequestMethod.PUT)
	@ResponseBody
	public ProductDetail saveProductPropertyProductDetail(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key, @RequestBody ProductDetail productdetail) {
		productPropertyService.saveProductPropertyProductDetail(productproperty_proId, productproperty_key, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Select an existing ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}", method = RequestMethod.GET)
	@ResponseBody
	public ProductProperty loadProductProperty(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key) {
		return productPropertyDAO.findProductPropertyByPrimaryKey(productproperty_proId, productproperty_key);
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail/{productdetail_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail loadProductPropertyProductDetail(@PathVariable Integer productproperty_proId, @PathVariable String productproperty_key, @PathVariable Integer related_productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		return productdetail;
	}
}