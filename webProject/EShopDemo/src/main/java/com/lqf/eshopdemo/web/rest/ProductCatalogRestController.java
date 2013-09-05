package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;

import com.lqf.eshopdemo.service.ProductCatalogService;

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
 * Spring Rest controller that handles CRUD requests for ProductCatalog entities
 * 
 */

@Controller("ProductCatalogRestController")
public class ProductCatalogRestController {

	/**
	 * DAO injected by Spring that manages Catalog entities
	 * 
	 */
	@Autowired
	private CatalogDAO catalogDAO;

	/**
	 * DAO injected by Spring that manages ProductCatalog entities
	 * 
	 */
	@Autowired
	private ProductCatalogDAO productCatalogDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ProductCatalog entities
	 * 
	 */
	@Autowired
	private ProductCatalogService productCatalogService;

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog/{catalog_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductCatalogCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @PathVariable Integer related_catalog_id) {
		productCatalogService.deleteProductCatalogCatalog(productcatalog_productId, productcatalog_catalogId, related_catalog_id);
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
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog", method = RequestMethod.PUT)
	@ResponseBody
	public ProductCatalog saveProductCatalog(@RequestBody ProductCatalog productcatalog) {
		productCatalogService.saveProductCatalog(productcatalog);
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog.getProductId(), productcatalog.getCatalogId());
	}

	/**
	 * Get ProductDetail entity by ProductCatalog
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail getProductCatalogProductDetail(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId) {
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog_productId, productcatalog_catalogId).getProductDetail();
	}

	/**
	 * Select an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}", method = RequestMethod.GET)
	@ResponseBody
	public ProductCatalog loadProductCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId) {
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog_productId, productcatalog_catalogId);
	}

	/**
	 * Create a new Catalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog", method = RequestMethod.POST)
	@ResponseBody
	public Catalog newProductCatalogCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @RequestBody Catalog catalog) {
		productCatalogService.saveProductCatalogCatalog(productcatalog_productId, productcatalog_catalogId, catalog);
		return catalogDAO.findCatalogByPrimaryKey(catalog.getId());
	}

	/**
	 * View an existing Catalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog/{catalog_id}", method = RequestMethod.GET)
	@ResponseBody
	public Catalog loadProductCatalogCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @PathVariable Integer related_catalog_id) {
		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(related_catalog_id, -1, -1);

		return catalog;
	}

	/**
	 * Show all ProductCatalog entities
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductCatalog> listProductCatalogs() {
		return new java.util.ArrayList<ProductCatalog>(productCatalogService.loadProductCatalogs());
	}

	/**
	 * Create a new ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog", method = RequestMethod.POST)
	@ResponseBody
	public ProductCatalog newProductCatalog(@RequestBody ProductCatalog productcatalog) {
		productCatalogService.saveProductCatalog(productcatalog);
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog.getProductId(), productcatalog.getCatalogId());
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail", method = RequestMethod.POST)
	@ResponseBody
	public ProductDetail newProductCatalogProductDetail(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @RequestBody ProductDetail productdetail) {
		productCatalogService.saveProductCatalogProductDetail(productcatalog_productId, productcatalog_catalogId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail/{productdetail_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail loadProductCatalogProductDetail(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @PathVariable Integer related_productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		return productdetail;
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog_productId, productcatalog_catalogId);
		productCatalogService.deleteProductCatalog(productcatalog);
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail", method = RequestMethod.PUT)
	@ResponseBody
	public ProductDetail saveProductCatalogProductDetail(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @RequestBody ProductDetail productdetail) {
		productCatalogService.saveProductCatalogProductDetail(productcatalog_productId, productcatalog_catalogId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Get Catalog entity by ProductCatalog
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog", method = RequestMethod.GET)
	@ResponseBody
	public Catalog getProductCatalogCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId) {
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog_productId, productcatalog_catalogId).getCatalog();
	}

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog", method = RequestMethod.PUT)
	@ResponseBody
	public Catalog saveProductCatalogCatalog(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @RequestBody Catalog catalog) {
		productCatalogService.saveProductCatalogCatalog(productcatalog_productId, productcatalog_catalogId, catalog);
		return catalogDAO.findCatalogByPrimaryKey(catalog.getId());
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail/{productdetail_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductCatalogProductDetail(@PathVariable Integer productcatalog_productId, @PathVariable Integer productcatalog_catalogId, @PathVariable Integer related_productdetail_id) {
		productCatalogService.deleteProductCatalogProductDetail(productcatalog_productId, productcatalog_catalogId, related_productdetail_id);
	}
}