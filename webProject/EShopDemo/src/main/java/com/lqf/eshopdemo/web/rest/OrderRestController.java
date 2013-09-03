package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.Userinfo;

import com.lqf.eshopdemo.service.OrderService;

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
 * Spring Rest controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderRestController")
public class OrderRestController {

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
	 * DAO injected by Spring that manages Userinfo entities
	 * 
	 */
	@Autowired
	private UserinfoDAO userinfoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Order entities
	 * 
	 */
	@Autowired
	private OrderService orderService;

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.POST)
	@ResponseBody
	public Order newOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * View an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/userinfo/{userinfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Userinfo loadOrderUserinfo(@PathVariable Integer order_id, @PathVariable Integer related_userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(related_userinfo_id, -1, -1);

		return userinfo;
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/userinfo/{userinfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderUserinfo(@PathVariable Integer order_id, @PathVariable Integer related_userinfo_id) {
		orderService.deleteOrderUserinfo(order_id, related_userinfo_id);
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Show all OrderItems entities by Order
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderItemses", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderItems> getOrderOrderItemses(@PathVariable Integer order_id) {
		return new java.util.ArrayList<OrderItems>(orderDAO.findOrderByPrimaryKey(order_id).getOrderItemses());
	}

	/**
	 * Show all Order entities
	 * 
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> listOrders() {
		return new java.util.ArrayList<Order>(orderService.loadOrders());
	}

	/**
	 * Get Userinfo entity by Order
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/userinfo", method = RequestMethod.GET)
	@ResponseBody
	public Userinfo getOrderUserinfo(@PathVariable Integer order_id) {
		return orderDAO.findOrderByPrimaryKey(order_id).getUserinfo();
	}

	/**
	 * View an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}", method = RequestMethod.GET)
	@ResponseBody
	public OrderItems loadOrderOrderItemses(@PathVariable Integer order_id, @PathVariable Integer related_orderitemses_orderId, @PathVariable Integer related_orderitemses_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses_orderId, related_orderitemses_productId, -1, -1);

		return orderitems;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrder(@PathVariable Integer order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id);
		orderService.deleteOrder(order);
	}

	/**
	 * Create a new OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderItemses", method = RequestMethod.POST)
	@ResponseBody
	public OrderItems newOrderOrderItemses(@PathVariable Integer order_id, @RequestBody OrderItems orderitems) {
		orderService.saveOrderOrderItemses(order_id, orderitems);
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitems.getOrderId(), orderitems.getProductId());
	}

	/**
	 * Create a new Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/userinfo", method = RequestMethod.POST)
	@ResponseBody
	public Userinfo newOrderUserinfo(@PathVariable Integer order_id, @RequestBody Userinfo userinfo) {
		orderService.saveOrderUserinfo(order_id, userinfo);
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderOrderItemses(@PathVariable Integer order_id, @PathVariable Integer related_orderitemses_orderId, @PathVariable Integer related_orderitemses_productId) {
		orderService.deleteOrderOrderItemses(order_id, related_orderitemses_orderId, related_orderitemses_productId);
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderItemses", method = RequestMethod.PUT)
	@ResponseBody
	public OrderItems saveOrderOrderItemses(@PathVariable Integer order_id, @RequestBody OrderItems orderitemses) {
		orderService.saveOrderOrderItemses(order_id, orderitemses);
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderitemses.getOrderId(), orderitemses.getProductId());
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
	 * Select an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadOrder(@PathVariable Integer order_id) {
		return orderDAO.findOrderByPrimaryKey(order_id);
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/userinfo", method = RequestMethod.PUT)
	@ResponseBody
	public Userinfo saveOrderUserinfo(@PathVariable Integer order_id, @RequestBody Userinfo userinfo) {
		orderService.saveOrderUserinfo(order_id, userinfo);
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());
	}
}