package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.Userinfo;

import com.lqf.eshopdemo.service.UserinfoService;

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
 * Spring Rest controller that handles CRUD requests for Userinfo entities
 * 
 */

@Controller("UserinfoRestController")
public class UserinfoRestController {

	/**
	 * DAO injected by Spring that manages CustomerComment entities
	 * 
	 */
	@Autowired
	private CustomerCommentDAO customerCommentDAO;

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages Userinfo entities
	 * 
	 */
	@Autowired
	private UserinfoDAO userinfoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Userinfo entities
	 * 
	 */
	@Autowired
	private UserinfoService userinfoService;

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/orders", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveUserinfoOrders(@PathVariable Integer userinfo_id, @RequestBody Order orders) {
		userinfoService.saveUserinfoOrders(userinfo_id, orders);
		return orderDAO.findOrderByPrimaryKey(orders.getId());
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
	 * Create a new Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo", method = RequestMethod.POST)
	@ResponseBody
	public Userinfo newUserinfo(@RequestBody Userinfo userinfo) {
		userinfoService.saveUserinfo(userinfo);
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());
	}

	/**
	 * Select an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Userinfo loadUserinfo(@PathVariable Integer userinfo_id) {
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo_id);
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo", method = RequestMethod.PUT)
	@ResponseBody
	public Userinfo saveUserinfo(@RequestBody Userinfo userinfo) {
		userinfoService.saveUserinfo(userinfo);
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());
	}

	/**
	 * Show all CustomerComment entities by Userinfo
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/customerComments", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerComment> getUserinfoCustomerComments(@PathVariable Integer userinfo_id) {
		return new java.util.ArrayList<CustomerComment>(userinfoDAO.findUserinfoByPrimaryKey(userinfo_id).getCustomerComments());
	}

	/**
	 * Show all Userinfo entities
	 * 
	 */
	@RequestMapping(value = "/Userinfo", method = RequestMethod.GET)
	@ResponseBody
	public List<Userinfo> listUserinfos() {
		return new java.util.ArrayList<Userinfo>(userinfoService.loadUserinfos());
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/orders/{order_id}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadUserinfoOrders(@PathVariable Integer userinfo_id, @PathVariable Integer related_orders_id) {
		Order order = orderDAO.findOrderByPrimaryKey(related_orders_id, -1, -1);

		return order;
	}

	/**
	 * Create a new CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/customerComments", method = RequestMethod.POST)
	@ResponseBody
	public CustomerComment newUserinfoCustomerComments(@PathVariable Integer userinfo_id, @RequestBody CustomerComment customercomment) {
		userinfoService.saveUserinfoCustomerComments(userinfo_id, customercomment);
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment.getProId(), customercomment.getUserId());
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUserinfo(@PathVariable Integer userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id);
		userinfoService.deleteUserinfo(userinfo);
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/customerComments/{customercomment_proId}/{customercomment_userId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUserinfoCustomerComments(@PathVariable Integer userinfo_id, @PathVariable Integer related_customercomments_proId, @PathVariable Integer related_customercomments_userId) {
		userinfoService.deleteUserinfoCustomerComments(userinfo_id, related_customercomments_proId, related_customercomments_userId);
	}

	/**
	 * Show all Order entities by Userinfo
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/orders", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> getUserinfoOrders(@PathVariable Integer userinfo_id) {
		return new java.util.ArrayList<Order>(userinfoDAO.findUserinfoByPrimaryKey(userinfo_id).getOrders());
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/customerComments", method = RequestMethod.PUT)
	@ResponseBody
	public CustomerComment saveUserinfoCustomerComments(@PathVariable Integer userinfo_id, @RequestBody CustomerComment customercomments) {
		userinfoService.saveUserinfoCustomerComments(userinfo_id, customercomments);
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomments.getProId(), customercomments.getUserId());
	}

	/**
	 * View an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/customerComments/{customercomment_proId}/{customercomment_userId}", method = RequestMethod.GET)
	@ResponseBody
	public CustomerComment loadUserinfoCustomerComments(@PathVariable Integer userinfo_id, @PathVariable Integer related_customercomments_proId, @PathVariable Integer related_customercomments_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments_proId, related_customercomments_userId, -1, -1);

		return customercomment;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/orders", method = RequestMethod.POST)
	@ResponseBody
	public Order newUserinfoOrders(@PathVariable Integer userinfo_id, @RequestBody Order order) {
		userinfoService.saveUserinfoOrders(userinfo_id, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Userinfo/{userinfo_id}/orders/{order_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUserinfoOrders(@PathVariable Integer userinfo_id, @PathVariable Integer related_orders_id) {
		userinfoService.deleteUserinfoOrders(userinfo_id, related_orders_id);
	}
}