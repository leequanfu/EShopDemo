package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductDetail;

import com.lqf.eshopdemo.service.OrderItemsService;

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
 * Spring Rest controller that handles CRUD requests for OrderItems entities
 * 
 */

@Controller("OrderItemsRestController")
public class OrderItemsRestController {

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages OrderItems entities
	 * 
	 */
	@Autowired
	private OrderItemsDAO orderItemsDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for OrderItems entities
	 * 
	 */
	@Autowired
	private OrderItemsService orderItemsService;

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail", method = RequestMethod.PUT)
	@ResponseBody
	public ProductDetail saveOrderItemsProductDetail(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @RequestBody ProductDetail productdetail) {
		orderItemsService.saveOrderItemsProductDetail(orderitems_orderId, orderitems_productId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Select an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}", method = RequestMethod.GET)
	@ResponseBody
	public OrderItems loadOrderItems(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId) {
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems_orderId, orderitems_productId);
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/order/{order_id}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadOrderItemsOrder(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @PathVariable Integer related_order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(related_order_id, -1, -1);

		return order;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems", method = RequestMethod.PUT)
	@ResponseBody
	public OrderItems saveOrderItems(@RequestBody OrderItems orderitems) {
		orderItemsService.saveOrderItems(orderitems);
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems.getOrderId(), orderitems.getProductId());
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail/{productdetail_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderItemsProductDetail(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @PathVariable Integer related_productdetail_id) {
		orderItemsService.deleteOrderItemsProductDetail(orderitems_orderId, orderitems_productId, related_productdetail_id);
	}

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail/{productdetail_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail loadOrderItemsProductDetail(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @PathVariable Integer related_productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		return productdetail;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/order", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveOrderItemsOrder(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @RequestBody Order order) {
		orderItemsService.saveOrderItemsOrder(orderitems_orderId, orderitems_productId, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Show all OrderItems entities
	 * 
	 */
	@RequestMapping(value = "/OrderItems", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderItems> listOrderItemss() {
		return new java.util.ArrayList<OrderItems>(orderItemsService.loadOrderItemss());
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/order", method = RequestMethod.POST)
	@ResponseBody
	public Order newOrderItemsOrder(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @RequestBody Order order) {
		orderItemsService.saveOrderItemsOrder(orderitems_orderId, orderitems_productId, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
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
	 * Get Order entity by OrderItems
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/order", method = RequestMethod.GET)
	@ResponseBody
	public Order getOrderItemsOrder(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId) {
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems_orderId, orderitems_productId).getOrder();
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderItems(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitems_orderId, orderitems_productId);
		orderItemsService.deleteOrderItems(orderitems);
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail", method = RequestMethod.POST)
	@ResponseBody
	public ProductDetail newOrderItemsProductDetail(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @RequestBody ProductDetail productdetail) {
		orderItemsService.saveOrderItemsProductDetail(orderitems_orderId, orderitems_productId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Create a new OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems", method = RequestMethod.POST)
	@ResponseBody
	public OrderItems newOrderItems(@RequestBody OrderItems orderitems) {
		orderItemsService.saveOrderItems(orderitems);
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems.getOrderId(), orderitems.getProductId());
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/order/{order_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderItemsOrder(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId, @PathVariable Integer related_order_id) {
		orderItemsService.deleteOrderItemsOrder(orderitems_orderId, orderitems_productId, related_order_id);
	}

	/**
	 * Get ProductDetail entity by OrderItems
	 * 
	 */
	@RequestMapping(value = "/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail getOrderItemsProductDetail(@PathVariable Integer orderitems_orderId, @PathVariable Integer orderitems_productId) {
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems_orderId, orderitems_productId).getProductDetail();
	}
}