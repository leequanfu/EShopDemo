package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.Userinfo;

import com.lqf.eshopdemo.service.OrderService;

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
 * Spring MVC controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderController")
public class OrderController {

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
	 * Create a new Userinfo entity
	 * 
	 */
	@RequestMapping("/newOrderUserinfo")
	public ModelAndView newOrderUserinfo(@RequestParam Integer order_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("userinfo", new Userinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("order/userinfo/editUserinfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/editOrderUserinfo")
	public ModelAndView editOrderUserinfo(@RequestParam Integer order_id, @RequestParam Integer userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("userinfo", userinfo);
		mav.setViewName("order/userinfo/editUserinfo.jsp");

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
	 * View an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/selectOrderUserinfo")
	public ModelAndView selectOrderUserinfo(@RequestParam Integer order_id, @RequestParam Integer userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("userinfo", userinfo);
		mav.setViewName("order/userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Select the Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrder")
	public ModelAndView confirmDeleteOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/deleteOrder.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveOrder")
	public String saveOrder(@ModelAttribute Order order) {
		orderService.saveOrder(order);
		return "forward:/indexOrder";
	}

	/**
	 * Edit an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/editOrderOrderItemses")
	public ModelAndView editOrderOrderItemses(@RequestParam Integer order_id, @RequestParam Integer orderitemses_orderId, @RequestParam Integer orderitemses_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitemses_orderId, orderitemses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("orderitems", orderitems);
		mav.setViewName("order/orderitemses/editOrderItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/saveOrderUserinfo")
	public ModelAndView saveOrderUserinfo(@RequestParam Integer order_id, @ModelAttribute Userinfo userinfo) {
		Order parent_order = orderService.saveOrderUserinfo(order_id, userinfo);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newOrder")
	public ModelAndView newOrder() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orderController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/deleteOrderOrderItemses")
	public ModelAndView deleteOrderOrderItemses(@RequestParam Integer order_id, @RequestParam Integer related_orderitemses_orderId, @RequestParam Integer related_orderitemses_productId) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderOrderItemses(order_id, related_orderitemses_orderId, related_orderitemses_productId);

		mav.addObject("order_id", order_id);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Show all OrderItems entities by Order
	 * 
	 */
	@RequestMapping("/listOrderOrderItemses")
	public ModelAndView listOrderOrderItemses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/orderitemses/listOrderItemses.jsp");

		return mav;
	}

	/**
	 * Show all Userinfo entities by Order
	 * 
	 */
	@RequestMapping("/listOrderUserinfo")
	public ModelAndView listOrderUserinfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/userinfo/listUserinfo.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteOrder")
	public String deleteOrder(@RequestParam Integer idKey) {
		Order order = orderDAO.findOrderByPrimaryKey(idKey);
		orderService.deleteOrder(order);
		return "forward:/indexOrder";
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/deleteOrderUserinfo")
	public ModelAndView deleteOrderUserinfo(@RequestParam Integer order_id, @RequestParam Integer related_userinfo_id) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderUserinfo(order_id, related_userinfo_id);

		mav.addObject("order_id", order_id);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Select an existing Order entity
	 * 
	 */
	@RequestMapping("/selectOrder")
	public ModelAndView selectOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editOrder")
	public ModelAndView editOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Order entities
	 * 
	 */
	public String indexOrder() {
		return "redirect:/indexOrder";
	}

	/**
	 * Show all Order entities
	 * 
	 */
	@RequestMapping("/indexOrder")
	public ModelAndView listOrders() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orders", orderService.loadOrders());

		mav.setViewName("order/listOrders.jsp");

		return mav;
	}

	/**
	 * Select the child Userinfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderUserinfo")
	public ModelAndView confirmDeleteOrderUserinfo(@RequestParam Integer order_id, @RequestParam Integer related_userinfo_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(related_userinfo_id));
		mav.addObject("order_id", order_id);
		mav.setViewName("order/userinfo/deleteUserinfo.jsp");

		return mav;
	}

	/**
	 * View an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/selectOrderOrderItemses")
	public ModelAndView selectOrderOrderItemses(@RequestParam Integer order_id, @RequestParam Integer orderitemses_orderId, @RequestParam Integer orderitemses_productId) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitemses_orderId, orderitemses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("orderitems", orderitems);
		mav.setViewName("order/orderitemses/viewOrderItemses.jsp");

		return mav;
	}

	/**
	 * Select the child OrderItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderOrderItemses")
	public ModelAndView confirmDeleteOrderOrderItemses(@RequestParam Integer order_id, @RequestParam Integer related_orderitemses_orderId, @RequestParam Integer related_orderitemses_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderitems", orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses_orderId, related_orderitemses_productId));
		mav.addObject("order_id", order_id);
		mav.setViewName("order/orderitemses/deleteOrderItemses.jsp");

		return mav;
	}

	/**
	 * Create a new OrderItems entity
	 * 
	 */
	@RequestMapping("/newOrderOrderItemses")
	public ModelAndView newOrderOrderItemses(@RequestParam Integer order_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("orderitems", new OrderItems());
		mav.addObject("newFlag", true);
		mav.setViewName("order/orderitemses/editOrderItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@RequestMapping("/saveOrderOrderItemses")
	public ModelAndView saveOrderOrderItemses(@RequestParam Integer order_id, @ModelAttribute OrderItems orderitemses) {
		Order parent_order = orderService.saveOrderOrderItemses(order_id, orderitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}
}