package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;
import com.lqf.eshopdemo.dao.ProductPropertyDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;
import com.lqf.eshopdemo.domain.ProductProperty;

import com.lqf.eshopdemo.service.ProductDetailService;

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
 * Spring MVC controller that handles CRUD requests for ProductDetail entities
 * 
 */

@Controller("ProductDetailController")
public class ProductDetailController {

	/**
	 * DAO injected by Spring that manages CustomerComment entities
	 * 
	 */
	@Autowired
	private CustomerCommentDAO customerCommentDAO;

	/**
	 * DAO injected by Spring that manages OrderItems entities
	 * 
	 */
	@Autowired
	private OrderItemsDAO orderItemsDAO;

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
	 * DAO injected by Spring that manages ProductOffer entities
	 * 
	 */
	@Autowired
	private ProductOfferDAO productOfferDAO;

	/**
	 * DAO injected by Spring that manages ProductProperty entities
	 * 
	 */
	@Autowired
	private ProductPropertyDAO productPropertyDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailService productDetailService;

	/**
	 * Select the child CustomerComment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductDetailCustomerComments")
	public ModelAndView confirmDeleteProductDetailCustomerComments(@RequestParam Integer productdetail_id, @RequestParam Integer related_customercomments_proId, @RequestParam Integer related_customercomments_userId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments_proId, related_customercomments_userId));
		mav.addObject("productdetail_id", productdetail_id);
		mav.setViewName("productdetail/customercomments/deleteCustomerComments.jsp");

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
	 * Save an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/saveProductDetailCustomerComments")
	public ModelAndView saveProductDetailCustomerComments(@RequestParam Integer productdetail_id, @ModelAttribute CustomerComment customercomments) {
		ProductDetail parent_productdetail = productDetailService.saveProductDetailCustomerComments(productdetail_id, customercomments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", parent_productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/editProductDetail")
	public ModelAndView editProductDetail(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * View an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/selectProductDetailProductOffers")
	public ModelAndView selectProductDetailProductOffers(@RequestParam Integer productdetail_id, @RequestParam Integer productoffers_proId, @RequestParam Integer productoffers_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffers_proId, productoffers_offerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productoffer", productoffer);
		mav.setViewName("productdetail/productoffers/viewProductOffers.jsp");

		return mav;
	}

	/**
	 * Show all ProductCatalog entities by ProductDetail
	 * 
	 */
	@RequestMapping("/listProductDetailProductCatalogs")
	public ModelAndView listProductDetailProductCatalogs(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/productcatalogs/listProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/saveProductDetailProductProperties")
	public ModelAndView saveProductDetailProductProperties(@RequestParam Integer productdetail_id, @ModelAttribute ProductProperty productproperties) {
		ProductDetail parent_productdetail = productDetailService.saveProductDetailProductProperties(productdetail_id, productproperties);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", parent_productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/saveProductDetailOrderItemses")
	public ModelAndView saveProductDetailOrderItemses(@RequestParam Integer productdetail_id, @ModelAttribute OrderItems orderitemses) {
		ProductDetail parent_productdetail = productDetailService.saveProductDetailOrderItemses(productdetail_id, orderitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", parent_productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/deleteProductDetailProductProperties")
	public ModelAndView deleteProductDetailProductProperties(@RequestParam Integer productdetail_id, @RequestParam Integer related_productproperties_proId, @RequestParam String related_productproperties_key) {
		ModelAndView mav = new ModelAndView();

		ProductDetail productdetail = productDetailService.deleteProductDetailProductProperties(productdetail_id, related_productproperties_proId, related_productproperties_key);

		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/deleteProductDetailOrderItemses")
	public ModelAndView deleteProductDetailOrderItemses(@RequestParam Integer productdetail_id, @RequestParam Integer related_orderitemses_orderId, @RequestParam Integer related_orderitemses_productId) {
		ModelAndView mav = new ModelAndView();

		ProductDetail productdetail = productDetailService.deleteProductDetailOrderItemses(productdetail_id, related_orderitemses_orderId, related_orderitemses_productId);

		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Select the child ProductProperty entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductDetailProductProperties")
	public ModelAndView confirmDeleteProductDetailProductProperties(@RequestParam Integer productdetail_id, @RequestParam Integer related_productproperties_proId, @RequestParam String related_productproperties_key) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productproperty", productPropertyDAO.findProductPropertyByPrimaryKey(related_productproperties_proId, related_productproperties_key));
		mav.addObject("productdetail_id", productdetail_id);
		mav.setViewName("productdetail/productproperties/deleteProductProperties.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/editProductDetailProductProperties")
	public ModelAndView editProductDetailProductProperties(@RequestParam Integer productdetail_id, @RequestParam Integer productproperties_proId, @RequestParam String productproperties_key) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(productproperties_proId, productproperties_key, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productproperty", productproperty);
		mav.setViewName("productdetail/productproperties/editProductProperties.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/selectProductDetail")
	public ModelAndView selectProductDetail(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/editProductDetailOrderItemses")
	public ModelAndView editProductDetailOrderItemses(@RequestParam Integer productdetail_id, @RequestParam Integer orderitemses_orderId, @RequestParam Integer orderitemses_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitemses_orderId, orderitemses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("orderitems", orderitems);
		mav.setViewName("productdetail/orderitemses/editOrderItemses.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/selectProductDetailCustomerComments")
	public ModelAndView selectProductDetailCustomerComments(@RequestParam Integer productdetail_id, @RequestParam Integer customercomments_proId, @RequestParam Integer customercomments_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomments_proId, customercomments_userId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("customercomment", customercomment);
		mav.setViewName("productdetail/customercomments/viewCustomerComments.jsp");

		return mav;
	}

	/**
	 * Show all OrderItems entities by ProductDetail
	 * 
	 */
	@RequestMapping("/listProductDetailOrderItemses")
	public ModelAndView listProductDetailOrderItemses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/orderitemses/listOrderItemses.jsp");

		return mav;
	}

	/**
	 * Create a new ProductOffer entity
	 * 
	 */
	@RequestMapping("/newProductDetailProductOffers")
	public ModelAndView newProductDetailProductOffers(@RequestParam Integer productdetail_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productoffer", new ProductOffer());
		mav.addObject("newFlag", true);
		mav.setViewName("productdetail/productoffers/editProductOffers.jsp");

		return mav;
	}

	/**
	 * Show all ProductOffer entities by ProductDetail
	 * 
	 */
	@RequestMapping("/listProductDetailProductOffers")
	public ModelAndView listProductDetailProductOffers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/productoffers/listProductOffers.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/editProductDetailProductCatalogs")
	public ModelAndView editProductDetailProductCatalogs(@RequestParam Integer productdetail_id, @RequestParam Integer productcatalogs_productId, @RequestParam Integer productcatalogs_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalogs_productId, productcatalogs_catalogId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productcatalog", productcatalog);
		mav.setViewName("productdetail/productcatalogs/editProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/editProductDetailProductOffers")
	public ModelAndView editProductDetailProductOffers(@RequestParam Integer productdetail_id, @RequestParam Integer productoffers_proId, @RequestParam Integer productoffers_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(productoffers_proId, productoffers_offerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productoffer", productoffer);
		mav.setViewName("productdetail/productoffers/editProductOffers.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/saveProductDetailProductOffers")
	public ModelAndView saveProductDetailProductOffers(@RequestParam Integer productdetail_id, @ModelAttribute ProductOffer productoffers) {
		ProductDetail parent_productdetail = productDetailService.saveProductDetailProductOffers(productdetail_id, productoffers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", parent_productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/editProductDetailCustomerComments")
	public ModelAndView editProductDetailCustomerComments(@RequestParam Integer productdetail_id, @RequestParam Integer customercomments_proId, @RequestParam Integer customercomments_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomments_proId, customercomments_userId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("customercomment", customercomment);
		mav.setViewName("productdetail/customercomments/editCustomerComments.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductDetail entities
	 * 
	 */
	public String indexProductDetail() {
		return "redirect:/indexProductDetail";
	}

	/**
	 * Show all ProductDetail entities
	 * 
	 */
	@RequestMapping("/indexProductDetail")
	public ModelAndView listProductDetails() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetails", productDetailService.loadProductDetails());

		mav.setViewName("productdetail/listProductDetails.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/deleteProductDetailProductCatalogs")
	public ModelAndView deleteProductDetailProductCatalogs(@RequestParam Integer productdetail_id, @RequestParam Integer related_productcatalogs_productId, @RequestParam Integer related_productcatalogs_catalogId) {
		ModelAndView mav = new ModelAndView();

		ProductDetail productdetail = productDetailService.deleteProductDetailProductCatalogs(productdetail_id, related_productcatalogs_productId, related_productcatalogs_catalogId);

		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping("/newProductDetail")
	public ModelAndView newProductDetail() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", new ProductDetail());
		mav.addObject("newFlag", true);
		mav.setViewName("productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * View an existing ProductProperty entity
	 * 
	 */
	@RequestMapping("/selectProductDetailProductProperties")
	public ModelAndView selectProductDetailProductProperties(@RequestParam Integer productdetail_id, @RequestParam Integer productproperties_proId, @RequestParam String productproperties_key) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(productproperties_proId, productproperties_key, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productproperty", productproperty);
		mav.setViewName("productdetail/productproperties/viewProductProperties.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productdetailController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new CustomerComment entity
	 * 
	 */
	@RequestMapping("/newProductDetailCustomerComments")
	public ModelAndView newProductDetailCustomerComments(@RequestParam Integer productdetail_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("customercomment", new CustomerComment());
		mav.addObject("newFlag", true);
		mav.setViewName("productdetail/customercomments/editCustomerComments.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/saveProductDetail")
	public String saveProductDetail(@ModelAttribute ProductDetail productdetail) {
		productDetailService.saveProductDetail(productdetail);
		return "forward:/indexProductDetail";
	}

	/**
	 * Show all CustomerComment entities by ProductDetail
	 * 
	 */
	@RequestMapping("/listProductDetailCustomerComments")
	public ModelAndView listProductDetailCustomerComments(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/customercomments/listCustomerComments.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/deleteProductDetailCustomerComments")
	public ModelAndView deleteProductDetailCustomerComments(@RequestParam Integer productdetail_id, @RequestParam Integer related_customercomments_proId, @RequestParam Integer related_customercomments_userId) {
		ModelAndView mav = new ModelAndView();

		ProductDetail productdetail = productDetailService.deleteProductDetailCustomerComments(productdetail_id, related_customercomments_proId, related_customercomments_userId);

		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/saveProductDetailProductCatalogs")
	public ModelAndView saveProductDetailProductCatalogs(@RequestParam Integer productdetail_id, @ModelAttribute ProductCatalog productcatalogs) {
		ProductDetail parent_productdetail = productDetailService.saveProductDetailProductCatalogs(productdetail_id, productcatalogs);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", parent_productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Create a new ProductProperty entity
	 * 
	 */
	@RequestMapping("/newProductDetailProductProperties")
	public ModelAndView newProductDetailProductProperties(@RequestParam Integer productdetail_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productproperty", new ProductProperty());
		mav.addObject("newFlag", true);
		mav.setViewName("productdetail/productproperties/editProductProperties.jsp");

		return mav;
	}

	/**
	 * Select the child OrderItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductDetailOrderItemses")
	public ModelAndView confirmDeleteProductDetailOrderItemses(@RequestParam Integer productdetail_id, @RequestParam Integer related_orderitemses_orderId, @RequestParam Integer related_orderitemses_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses_orderId, related_orderitemses_productId));
		mav.addObject("productdetail_id", productdetail_id);
		mav.setViewName("productdetail/orderitemses/deleteOrderItemses.jsp");

		return mav;
	}

	/**
	 * View an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/selectProductDetailOrderItemses")
	public ModelAndView selectProductDetailOrderItemses(@RequestParam Integer productdetail_id, @RequestParam Integer orderitemses_orderId, @RequestParam Integer orderitemses_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitemses_orderId, orderitemses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("orderitems", orderitems);
		mav.setViewName("productdetail/orderitemses/viewOrderItemses.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/deleteProductDetail")
	public String deleteProductDetail(@RequestParam Integer idKey) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(idKey);
		productDetailService.deleteProductDetail(productdetail);
		return "forward:/indexProductDetail";
	}

	/**
	 * Select the child ProductOffer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductDetailProductOffers")
	public ModelAndView confirmDeleteProductDetailProductOffers(@RequestParam Integer productdetail_id, @RequestParam Integer related_productoffers_proId, @RequestParam Integer related_productoffers_offerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productoffer", productOfferDAO.findProductOfferByPrimaryKey(related_productoffers_proId, related_productoffers_offerId));
		mav.addObject("productdetail_id", productdetail_id);
		mav.setViewName("productdetail/productoffers/deleteProductOffers.jsp");

		return mav;
	}

	/**
	 * Select the child ProductCatalog entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductDetailProductCatalogs")
	public ModelAndView confirmDeleteProductDetailProductCatalogs(@RequestParam Integer productdetail_id, @RequestParam Integer related_productcatalogs_productId, @RequestParam Integer related_productcatalogs_catalogId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productcatalog", productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs_productId, related_productcatalogs_catalogId));
		mav.addObject("productdetail_id", productdetail_id);
		mav.setViewName("productdetail/productcatalogs/deleteProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Create a new ProductCatalog entity
	 * 
	 */
	@RequestMapping("/newProductDetailProductCatalogs")
	public ModelAndView newProductDetailProductCatalogs(@RequestParam Integer productdetail_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productcatalog", new ProductCatalog());
		mav.addObject("newFlag", true);
		mav.setViewName("productdetail/productcatalogs/editProductCatalogs.jsp");

		return mav;
	}

	/**
	 * View an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping("/selectProductDetailProductCatalogs")
	public ModelAndView selectProductDetailProductCatalogs(@RequestParam Integer productdetail_id, @RequestParam Integer productcatalogs_productId, @RequestParam Integer productcatalogs_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalogs_productId, productcatalogs_catalogId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productcatalog", productcatalog);
		mav.setViewName("productdetail/productcatalogs/viewProductCatalogs.jsp");

		return mav;
	}

	/**
	 * Select the ProductDetail entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductDetail")
	public ModelAndView confirmDeleteProductDetail(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/deleteProductDetail.jsp");

		return mav;
	}

	/**
	 * Create a new OrderItems entity
	 * 
	 */
	@RequestMapping("/newProductDetailOrderItemses")
	public ModelAndView newProductDetailOrderItemses(@RequestParam Integer productdetail_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("orderitems", new OrderItems());
		mav.addObject("newFlag", true);
		mav.setViewName("productdetail/orderitemses/editOrderItemses.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@RequestMapping("/deleteProductDetailProductOffers")
	public ModelAndView deleteProductDetailProductOffers(@RequestParam Integer productdetail_id, @RequestParam Integer related_productoffers_proId, @RequestParam Integer related_productoffers_offerId) {
		ModelAndView mav = new ModelAndView();

		ProductDetail productdetail = productDetailService.deleteProductDetailProductOffers(productdetail_id, related_productoffers_proId, related_productoffers_offerId);

		mav.addObject("productdetail_id", productdetail_id);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Show all ProductProperty entities by ProductDetail
	 * 
	 */
	@RequestMapping("/listProductDetailProductProperties")
	public ModelAndView listProductDetailProductProperties(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(idKey));
		mav.setViewName("productdetail/productproperties/listProductProperties.jsp");

		return mav;
	}
}