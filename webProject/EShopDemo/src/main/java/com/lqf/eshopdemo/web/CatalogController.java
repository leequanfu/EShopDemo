package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;

import com.lqf.eshopdemo.service.CatalogService;

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
 * Spring MVC controller that handles CRUD requests for Catalog entities
 * 
 */

@Controller("CatalogController")
public class CatalogController {

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
	 * Create a new Catalog entity
	 * 
	 */
	@RequestMapping("/newCatalog")
	public ModelAndView newCatalog() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalog", new Catalog());
		mav.addObject("newFlag", true);
		mav.setViewName("catalog/editCatalog.jsp");

		return mav;
	}

	/**
	 * Select an existing Catalog entity
	 * 
	 */
	@RequestMapping("/selectCatalog")
	public ModelAndView selectCatalog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalog", catalogDAO.findCatalogByPrimaryKey(idKey));
		mav.setViewName("catalog/viewCatalog.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/deleteCatalogProductCatalogs")
	public ModelAndView deleteCatalogProductCatalogs(@RequestParam Integer catalog_id, @RequestParam Integer related_productcatalogs_productId, @RequestParam Integer related_productcatalogs_catalogId) {
		ModelAndView mav = new ModelAndView();

		Catalog catalog = catalogService.deleteCatalogProductCatalogs(catalog_id, related_productcatalogs_productId, related_productcatalogs_catalogId);

		mav.addObject("catalog_id", catalog_id);
		mav.addObject("catalog", catalog);
		mav.setViewName("catalog/viewCatalog.jsp");

		return mav;
	}

	/**
	 * View an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/selectCatalogProductCatalogs")
	public ModelAndView selectCatalogProductCatalogs(@RequestParam Integer catalog_id, @RequestParam Integer productcatalogs_productId, @RequestParam Integer productcatalogs_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalogs_productId, productcatalogs_catalogId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("catalog_id", catalog_id);
		mav.addObject("productcatalog", productcatalog);
		mav.setViewName("catalog/productcatalogs/viewProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Select the Catalog entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCatalog")
	public ModelAndView confirmDeleteCatalog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalog", catalogDAO.findCatalogByPrimaryKey(idKey));
		mav.setViewName("catalog/deleteCatalog.jsp");

		return mav;
	}

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	@RequestMapping("/saveCatalog")
	public String saveCatalog(@ModelAttribute Catalog catalog) {
		catalogService.saveCatalog(catalog);
		return "forward:/indexCatalog";
	}

	/**
	 * Edit an existing Catalog entity
	 * 
	 */
	@RequestMapping("/editCatalog")
	public ModelAndView editCatalog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalog", catalogDAO.findCatalogByPrimaryKey(idKey));
		mav.setViewName("catalog/editCatalog.jsp");

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
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/saveCatalogProductCatalogs")
	public ModelAndView saveCatalogProductCatalogs(@RequestParam Integer catalog_id, @ModelAttribute ProductCatalog productcatalogs) {
		Catalog parent_catalog = catalogService.saveCatalogProductCatalogs(catalog_id, productcatalogs);

		ModelAndView mav = new ModelAndView();
		mav.addObject("catalog_id", catalog_id);
		mav.addObject("catalog", parent_catalog);
		mav.setViewName("catalog/viewCatalog.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/editCatalogProductCatalogs")
	public ModelAndView editCatalogProductCatalogs(@RequestParam Integer catalog_id, @RequestParam Integer productcatalogs_productId, @RequestParam Integer productcatalogs_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalogs_productId, productcatalogs_catalogId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("catalog_id", catalog_id);
		mav.addObject("productcatalog", productcatalog);
		mav.setViewName("catalog/productcatalogs/editProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Show all ProductCatalog entities by Catalog
	 * 
	 */
	@RequestMapping("/listCatalogProductCatalogs")
	public ModelAndView listCatalogProductCatalogs(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalog", catalogDAO.findCatalogByPrimaryKey(idKey));
		mav.setViewName("catalog/productcatalogs/listProductCatalogs.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/catalogController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all Catalog entities
	 * 
	 */
	public String indexCatalog() {
		return "redirect:/indexCatalog";
	}

	/**
	 * Create a new ProductCatalog entity
	 * 
	 */
	@RequestMapping("/newCatalogProductCatalogs")
	public ModelAndView newCatalogProductCatalogs(@RequestParam Integer catalog_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("catalog_id", catalog_id);
		mav.addObject("productcatalog", new ProductCatalog());
		mav.addObject("newFlag", true);
		mav.setViewName("catalog/productcatalogs/editProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	@RequestMapping("/deleteCatalog")
	public String deleteCatalog(@RequestParam Integer idKey) {
		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(idKey);
		catalogService.deleteCatalog(catalog);
		return "forward:/indexCatalog";
	}

	/**
	 * Show all Catalog entities
	 * 
	 */
	@RequestMapping("/indexCatalog")
	public ModelAndView listCatalogs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalogs", catalogService.loadCatalogs());

		mav.setViewName("catalog/listCatalogs.jsp");

		return mav;
	}

	/**
	 * Select the child ProductCatalog entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCatalogProductCatalogs")
	public ModelAndView confirmDeleteCatalogProductCatalogs(@RequestParam Integer catalog_id, @RequestParam Integer related_productcatalogs_productId, @RequestParam Integer related_productcatalogs_catalogId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs_productId, related_productcatalogs_catalogId));
		mav.addObject("catalog_id", catalog_id);
		mav.setViewName("catalog/productcatalogs/deleteProductCatalogs.jsp");

		return mav;
	}
}