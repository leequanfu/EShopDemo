package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;

import com.lqf.eshopdemo.service.CatalogService;

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
 * Spring Rest controller that handles CRUD requests for Catalog entities
 * 
 */

@Controller("CatalogRestController")
public class CatalogRestController {

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
	 * Service injected by Spring that provides CRUD operations for Catalog entities
	 * 
	 */
	@Autowired
	private CatalogService catalogService;

	/**
	 * Show all ProductCatalog entities by Catalog
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}/productCatalogs", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductCatalog> getCatalogProductCatalogs(@PathVariable Integer catalog_id) {
		return new java.util.ArrayList<ProductCatalog>(catalogDAO.findCatalogByPrimaryKey(catalog_id).getProductCatalogs());
	}

	/**
	 * View an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}", method = RequestMethod.GET)
	@ResponseBody
	public ProductCatalog loadCatalogProductCatalogs(@PathVariable Integer catalog_id, @PathVariable Integer related_productcatalogs_productId, @PathVariable Integer related_productcatalogs_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs_productId, related_productcatalogs_catalogId, -1, -1);

		return productcatalog;
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
	 * Create a new Catalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog", method = RequestMethod.POST)
	@ResponseBody
	public Catalog newCatalog(@RequestBody Catalog catalog) {
		catalogService.saveCatalog(catalog);
		return catalogDAO.findCatalogByPrimaryKey(catalog.getId());
	}

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCatalog(@PathVariable Integer catalog_id) {
		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(catalog_id);
		catalogService.deleteCatalog(catalog);
	}

	/**
	 * Select an existing Catalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}", method = RequestMethod.GET)
	@ResponseBody
	public Catalog loadCatalog(@PathVariable Integer catalog_id) {
		return catalogDAO.findCatalogByPrimaryKey(catalog_id);
	}

	/**
	 * Show all Catalog entities
	 * 
	 */
	@RequestMapping(value = "/Catalog", method = RequestMethod.GET)
	@ResponseBody
	public List<Catalog> listCatalogs() {
		return new java.util.ArrayList<Catalog>(catalogService.loadCatalogs());
	}

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog", method = RequestMethod.PUT)
	@ResponseBody
	public Catalog saveCatalog(@RequestBody Catalog catalog) {
		catalogService.saveCatalog(catalog);
		return catalogDAO.findCatalogByPrimaryKey(catalog.getId());
	}

	/**
	 * Create a new ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}/productCatalogs", method = RequestMethod.POST)
	@ResponseBody
	public ProductCatalog newCatalogProductCatalogs(@PathVariable Integer catalog_id, @RequestBody ProductCatalog productcatalog) {
		catalogService.saveCatalogProductCatalogs(catalog_id, productcatalog);
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog.getProductId(), productcatalog.getCatalogId());
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}/productCatalogs", method = RequestMethod.PUT)
	@ResponseBody
	public ProductCatalog saveCatalogProductCatalogs(@PathVariable Integer catalog_id, @RequestBody ProductCatalog productcatalogs) {
		catalogService.saveCatalogProductCatalogs(catalog_id, productcatalogs);
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalogs.getProductId(), productcatalogs.getCatalogId());
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/Catalog/{catalog_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCatalogProductCatalogs(@PathVariable Integer catalog_id, @PathVariable Integer related_productcatalogs_productId, @PathVariable Integer related_productcatalogs_catalogId) {
		catalogService.deleteCatalogProductCatalogs(catalog_id, related_productcatalogs_productId, related_productcatalogs_catalogId);
	}
}