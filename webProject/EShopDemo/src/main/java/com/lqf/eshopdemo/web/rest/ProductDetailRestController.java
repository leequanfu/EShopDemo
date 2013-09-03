package com.lqf.eshopdemo.web.rest;

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
 * Spring Rest controller that handles CRUD requests for ProductDetail entities
 * 
 */

@Controller("ProductDetailRestController")
public class ProductDetailRestController {

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
	 * Show all ProductProperty entities by ProductDetail
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productProperties", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductProperty> getProductDetailProductProperties(@PathVariable Integer productdetail_id) {
		return new java.util.ArrayList<ProductProperty>(productDetailDAO.findProductDetailByPrimaryKey(productdetail_id).getProductProperties());
	}

	/**
	 * Create a new ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productCatalogs", method = RequestMethod.POST)
	@ResponseBody
	public ProductCatalog newProductDetailProductCatalogs(@PathVariable Integer productdetail_id, @RequestBody ProductCatalog productcatalog) {
		productDetailService.saveProductDetailProductCatalogs(productdetail_id, productcatalog);
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog.getProductId(), productcatalog.getCatalogId());
	}

	/**
	 * View an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/customerComments/{customercomment_proId}/{customercomment_userId}", method = RequestMethod.GET)
	@ResponseBody
	public CustomerComment loadProductDetailCustomerComments(@PathVariable Integer productdetail_id, @PathVariable Integer related_customercomments_proId, @PathVariable Integer related_customercomments_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments_proId, related_customercomments_userId, -1, -1);

		return customercomment;
	}

	/**
	 * Select an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail loadProductDetail(@PathVariable Integer productdetail_id) {
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail_id);
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductDetailProductCatalogs(@PathVariable Integer productdetail_id, @PathVariable Integer related_productcatalogs_productId, @PathVariable Integer related_productcatalogs_catalogId) {
		productDetailService.deleteProductDetailProductCatalogs(productdetail_id, related_productcatalogs_productId, related_productcatalogs_catalogId);
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/customerComments/{customercomment_proId}/{customercomment_userId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductDetailCustomerComments(@PathVariable Integer productdetail_id, @PathVariable Integer related_customercomments_proId, @PathVariable Integer related_customercomments_userId) {
		productDetailService.deleteProductDetailCustomerComments(productdetail_id, related_customercomments_proId, related_customercomments_userId);
	}

	/**
	 * View an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}", method = RequestMethod.GET)
	@ResponseBody
	public OrderItems loadProductDetailOrderItemses(@PathVariable Integer productdetail_id, @PathVariable Integer related_orderitemses_orderId, @PathVariable Integer related_orderitemses_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses_orderId, related_orderitemses_productId, -1, -1);

		return orderitems;
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/customerComments", method = RequestMethod.PUT)
	@ResponseBody
	public CustomerComment saveProductDetailCustomerComments(@PathVariable Integer productdetail_id, @RequestBody CustomerComment customercomments) {
		productDetailService.saveProductDetailCustomerComments(productdetail_id, customercomments);
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomments.getProId(), customercomments.getUserId());
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductDetail(@PathVariable Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id);
		productDetailService.deleteProductDetail(productdetail);
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/orderItemses", method = RequestMethod.PUT)
	@ResponseBody
	public OrderItems saveProductDetailOrderItemses(@PathVariable Integer productdetail_id, @RequestBody OrderItems orderitemses) {
		productDetailService.saveProductDetailOrderItemses(productdetail_id, orderitemses);
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitemses.getOrderId(), orderitemses.getProductId());
	}

	/**
	 * Show all ProductDetail entities
	 * 
	 */
	@RequestMapping(value = "/ProductDetail", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductDetail> listProductDetails() {
		return new java.util.ArrayList<ProductDetail>(productDetailService.loadProductDetails());
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
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail", method = RequestMethod.POST)
	@ResponseBody
	public ProductDetail newProductDetail(@RequestBody ProductDetail productdetail) {
		productDetailService.saveProductDetail(productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Show all OrderItems entities by ProductDetail
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/orderItemses", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderItems> getProductDetailOrderItemses(@PathVariable Integer productdetail_id) {
		return new java.util.ArrayList<OrderItems>(productDetailDAO.findProductDetailByPrimaryKey(productdetail_id).getOrderItemses());
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail", method = RequestMethod.PUT)
	@ResponseBody
	public ProductDetail saveProductDetail(@RequestBody ProductDetail productdetail) {
		productDetailService.saveProductDetail(productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Create a new OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/orderItemses", method = RequestMethod.POST)
	@ResponseBody
	public OrderItems newProductDetailOrderItemses(@PathVariable Integer productdetail_id, @RequestBody OrderItems orderitems) {
		productDetailService.saveProductDetailOrderItemses(productdetail_id, orderitems);
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems.getOrderId(), orderitems.getProductId());
	}

	/**
	 * Create a new CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/customerComments", method = RequestMethod.POST)
	@ResponseBody
	public CustomerComment newProductDetailCustomerComments(@PathVariable Integer productdetail_id, @RequestBody CustomerComment customercomment) {
		productDetailService.saveProductDetailCustomerComments(productdetail_id, customercomment);
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment.getProId(), customercomment.getUserId());
	}

	/**
	 * View an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}", method = RequestMethod.GET)
	@ResponseBody
	public ProductCatalog loadProductDetailProductCatalogs(@PathVariable Integer productdetail_id, @PathVariable Integer related_productcatalogs_productId, @PathVariable Integer related_productcatalogs_catalogId) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs_productId, related_productcatalogs_catalogId, -1, -1);

		return productcatalog;
	}

	/**
	 * Show all CustomerComment entities by ProductDetail
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/customerComments", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerComment> getProductDetailCustomerComments(@PathVariable Integer productdetail_id) {
		return new java.util.ArrayList<CustomerComment>(productDetailDAO.findProductDetailByPrimaryKey(productdetail_id).getCustomerComments());
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productCatalogs", method = RequestMethod.PUT)
	@ResponseBody
	public ProductCatalog saveProductDetailProductCatalogs(@PathVariable Integer productdetail_id, @RequestBody ProductCatalog productcatalogs) {
		productDetailService.saveProductDetailProductCatalogs(productdetail_id, productcatalogs);
		return productCatalogDAO.findProductCatalogByPrimaryKey(productcatalogs.getProductId(), productcatalogs.getCatalogId());
	}

	/**
	 * Create a new ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productProperties", method = RequestMethod.POST)
	@ResponseBody
	public ProductProperty newProductDetailProductProperties(@PathVariable Integer productdetail_id, @RequestBody ProductProperty productproperty) {
		productDetailService.saveProductDetailProductProperties(productdetail_id, productproperty);
		return productPropertyDAO.findProductPropertyByPrimaryKey(productproperty.getProId(), productproperty.getKey());
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductDetailOrderItemses(@PathVariable Integer productdetail_id, @PathVariable Integer related_orderitemses_orderId, @PathVariable Integer related_orderitemses_productId) {
		productDetailService.deleteProductDetailOrderItemses(productdetail_id, related_orderitemses_orderId, related_orderitemses_productId);
	}

	/**
	 * Show all ProductCatalog entities by ProductDetail
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productCatalogs", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductCatalog> getProductDetailProductCatalogs(@PathVariable Integer productdetail_id) {
		return new java.util.ArrayList<ProductCatalog>(productDetailDAO.findProductDetailByPrimaryKey(productdetail_id).getProductCatalogs());
	}

	/**
	 * View an existing ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productProperties/{productproperty_proId}/{productproperty_key}", method = RequestMethod.GET)
	@ResponseBody
	public ProductProperty loadProductDetailProductProperties(@PathVariable Integer productdetail_id, @PathVariable Integer related_productproperties_proId, @PathVariable String related_productproperties_key) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(related_productproperties_proId, related_productproperties_key, -1, -1);

		return productproperty;
	}

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productProperties/{productproperty_proId}/{productproperty_key}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductDetailProductProperties(@PathVariable Integer productdetail_id, @PathVariable Integer related_productproperties_proId, @PathVariable String related_productproperties_key) {
		productDetailService.deleteProductDetailProductProperties(productdetail_id, related_productproperties_proId, related_productproperties_key);
	}

	/**
	 * Show all ProductOffer entities by ProductDetail
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productOffers", method = RequestMethod.GET)
	@ResponseBody
	public List<ProductOffer> getProductDetailProductOffers(@PathVariable Integer productdetail_id) {
		return new java.util.ArrayList<ProductOffer>(productDetailDAO.findProductDetailByPrimaryKey(productdetail_id).getProductOffers());
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productOffers", method = RequestMethod.PUT)
	@ResponseBody
	public ProductOffer saveProductDetailProductOffers(@PathVariable Integer productdetail_id, @RequestBody ProductOffer productoffers) {
		productDetailService.saveProductDetailProductOffers(productdetail_id, productoffers);
		return productOfferDAO.findProductOfferByPrimaryKey(productoffers.getProId(), productoffers.getOfferId());
	}

	/**
	 * Create a new ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productOffers", method = RequestMethod.POST)
	@ResponseBody
	public ProductOffer newProductDetailProductOffers(@PathVariable Integer productdetail_id, @RequestBody ProductOffer productoffer) {
		productDetailService.saveProductDetailProductOffers(productdetail_id, productoffer);
		return productOfferDAO.findProductOfferByPrimaryKey(productoffer.getProId(), productoffer.getOfferId());
	}

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productProperties", method = RequestMethod.PUT)
	@ResponseBody
	public ProductProperty saveProductDetailProductProperties(@PathVariable Integer productdetail_id, @RequestBody ProductProperty productproperties) {
		productDetailService.saveProductDetailProductProperties(productdetail_id, productproperties);
		return productPropertyDAO.findProductPropertyByPrimaryKey(productproperties.getProId(), productproperties.getKey());
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productOffers/{productoffer_proId}/{productoffer_offerId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductDetailProductOffers(@PathVariable Integer productdetail_id, @PathVariable Integer related_productoffers_proId, @PathVariable Integer related_productoffers_offerId) {
		productDetailService.deleteProductDetailProductOffers(productdetail_id, related_productoffers_proId, related_productoffers_offerId);
	}

	/**
	 * View an existing ProductOffer entity
	 * 
	 */
	@RequestMapping(value = "/ProductDetail/{productdetail_id}/productOffers/{productoffer_proId}/{productoffer_offerId}", method = RequestMethod.GET)
	@ResponseBody
	public ProductOffer loadProductDetailProductOffers(@PathVariable Integer productdetail_id, @PathVariable Integer related_productoffers_proId, @PathVariable Integer related_productoffers_offerId) {
		ProductOffer productoffer = productOfferDAO.findProductOfferByPrimaryKey(related_productoffers_proId, related_productoffers_offerId, -1, -1);

		return productoffer;
	}
}