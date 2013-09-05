package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;

import com.lqf.eshopdemo.service.ProductCatalogService;

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
 * Spring MVC controller that handles CRUD requests for ProductCatalog entities
 * 
 */

@Controller("ProductCatalogController")
public class ProductCatalogController {

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
	 * Edit an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/editProductCatalogProductDetail")
	public ModelAndView editProductCatalogProductDetail(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productcatalog/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Select the ProductCatalog entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductCatalog")
	public ModelAndView confirmDeleteProductCatalog(@RequestParam Integer productIdKey, @RequestParam Integer catalogIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(productIdKey, catalogIdKey));
		mav.setViewName("productcatalog/deleteProductCatalog.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/selectProductCatalog")
	public ModelAndView selectProductCatalog(@RequestParam Integer productIdKey, @RequestParam Integer catalogIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(productIdKey, catalogIdKey));
		mav.setViewName("productcatalog/viewProductCatalog.jsp");

		return mav;
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping("/newProductCatalogProductDetail")
	public ModelAndView newProductCatalogProductDetail(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productdetail", new ProductDetail());
		mav.addObject("newFlag", true);
		mav.setViewName("productcatalog/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Create a new Catalog entity
	 * 
	 */
	@RequestMapping("/newProductCatalogCatalog")
	public ModelAndView newProductCatalogCatalog(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("catalog", new Catalog());
		mav.addObject("newFlag", true);
		mav.setViewName("productcatalog/catalog/editCatalog.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productcatalogController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/selectProductCatalogProductDetail")
	public ModelAndView selectProductCatalogProductDetail(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productcatalog/productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	@RequestMapping("/saveProductCatalogCatalog")
	public ModelAndView saveProductCatalogCatalog(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @ModelAttribute Catalog catalog) {
		ProductCatalog parent_productcatalog = productCatalogService.saveProductCatalogCatalog(productcatalog_productId, productcatalog_catalogId, catalog);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productcatalog", parent_productcatalog);
		mav.setViewName("productcatalog/viewProductCatalog.jsp");

		return mav;
	}

	/**
	 * Show all Catalog entities by ProductCatalog
	 * 
	 */
	@RequestMapping("/listProductCatalogCatalog")
	public ModelAndView listProductCatalogCatalog(@RequestParam Integer productIdKey, @RequestParam Integer catalogIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(productIdKey, catalogIdKey));
		mav.setViewName("productcatalog/catalog/listCatalog.jsp");

		return mav;
	}

	/**
	 * Show all ProductCatalog entities
	 * 
	 */
	@RequestMapping("/indexProductCatalog")
	public ModelAndView listProductCatalogs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalogs", productCatalogService.loadProductCatalogs());

		mav.setViewName("productcatalog/listProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Create a new ProductCatalog entity
	 * 
	 */
	@RequestMapping("/newProductCatalog")
	public ModelAndView newProductCatalog() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", new ProductCatalog());
		mav.addObject("newFlag", true);
		mav.setViewName("productcatalog/editProductCatalog.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/saveProductCatalogProductDetail")
	public ModelAndView saveProductCatalogProductDetail(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @ModelAttribute ProductDetail productdetail) {
		ProductCatalog parent_productcatalog = productCatalogService.saveProductCatalogProductDetail(productcatalog_productId, productcatalog_catalogId, productdetail);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productcatalog", parent_productcatalog);
		mav.setViewName("productcatalog/viewProductCatalog.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/saveProductCatalog")
	public String saveProductCatalog(@ModelAttribute ProductCatalog productcatalog) {
		productCatalogService.saveProductCatalog(productcatalog);
		return "forward:/indexProductCatalog";
	}

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	@RequestMapping("/deleteProductCatalogCatalog")
	public ModelAndView deleteProductCatalogCatalog(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer related_catalog_id) {
		ModelAndView mav = new ModelAndView();

		ProductCatalog productcatalog = productCatalogService.deleteProductCatalogCatalog(productcatalog_productId, productcatalog_catalogId, related_catalog_id);

		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productcatalog", productcatalog);
		mav.setViewName("productcatalog/viewProductCatalog.jsp");

		return mav;
	}

	/**
	 * Show all ProductDetail entities by ProductCatalog
	 * 
	 */
	@RequestMapping("/listProductCatalogProductDetail")
	public ModelAndView listProductCatalogProductDetail(@RequestParam Integer productIdKey, @RequestParam Integer catalogIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(productIdKey, catalogIdKey));
		mav.setViewName("productcatalog/productdetail/listProductDetail.jsp");

		return mav;
	}

	/**
	 * Select the child Catalog entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductCatalogCatalog")
	public ModelAndView confirmDeleteProductCatalogCatalog(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer related_catalog_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("catalog", catalogDAO.findCatalogByPrimaryKey(related_catalog_id));
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.setViewName("productcatalog/catalog/deleteCatalog.jsp");

		return mav;
	}

	/**
	 * Select the child ProductDetail entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductCatalogProductDetail")
	public ModelAndView confirmDeleteProductCatalogProductDetail(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id));
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.setViewName("productcatalog/productdetail/deleteProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/deleteProductCatalogProductDetail")
	public ModelAndView deleteProductCatalogProductDetail(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		ProductCatalog productcatalog = productCatalogService.deleteProductCatalogProductDetail(productcatalog_productId, productcatalog_catalogId, related_productdetail_id);

		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("productcatalog", productcatalog);
		mav.setViewName("productcatalog/viewProductCatalog.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductCatalog entities
	 * 
	 */
	public String indexProductCatalog() {
		return "redirect:/indexProductCatalog";
	}

	/**
	 * Edit an existing Catalog entity
	 * 
	 */
	@RequestMapping("/editProductCatalogCatalog")
	public ModelAndView editProductCatalogCatalog(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer catalog_id) {
		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(catalog_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("catalog", catalog);
		mav.setViewName("productcatalog/catalog/editCatalog.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/deleteProductCatalog")
	public String deleteProductCatalog(@RequestParam Integer productIdKey, @RequestParam Integer catalogIdKey) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productIdKey, catalogIdKey);
		productCatalogService.deleteProductCatalog(productcatalog);
		return "forward:/indexProductCatalog";
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
	 * View an existing Catalog entity
	 * 
	 */
	@RequestMapping("/selectProductCatalogCatalog")
	public ModelAndView selectProductCatalogCatalog(@RequestParam Integer productcatalog_productId, @RequestParam Integer productcatalog_catalogId, @RequestParam Integer catalog_id) {
		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(catalog_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productcatalog_productId", productcatalog_productId);
		mav.addObject("productcatalog_catalogId", productcatalog_catalogId);
		mav.addObject("catalog", catalog);
		mav.setViewName("productcatalog/catalog/viewCatalog.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/editProductCatalog")
	public ModelAndView editProductCatalog(@RequestParam Integer productIdKey, @RequestParam Integer catalogIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(productIdKey, catalogIdKey));
		mav.setViewName("productcatalog/editProductCatalog.jsp");

		return mav;
	}
}