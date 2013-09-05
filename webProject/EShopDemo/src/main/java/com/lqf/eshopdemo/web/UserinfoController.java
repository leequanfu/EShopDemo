package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.Userinfo;

import com.lqf.eshopdemo.service.UserinfoService;

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
 * Spring MVC controller that handles CRUD requests for Userinfo entities
 * 
 */

@Controller("UserinfoController")
public class UserinfoController {

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
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteUserinfoOrders")
	public ModelAndView deleteUserinfoOrders(@RequestParam Integer userinfo_id, @RequestParam Integer related_orders_id) {
		ModelAndView mav = new ModelAndView();

		Userinfo userinfo = userinfoService.deleteUserinfoOrders(userinfo_id, related_orders_id);

		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("userinfo", userinfo);
		mav.setViewName("userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editUserinfoOrders")
	public ModelAndView editUserinfoOrders(@RequestParam Integer userinfo_id, @RequestParam Integer orders_id) {
		Order order = orderDAO.findOrderByPrimaryKey(orders_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("order", order);
		mav.setViewName("userinfo/orders/editOrders.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/saveUserinfoCustomerComments")
	public ModelAndView saveUserinfoCustomerComments(@RequestParam Integer userinfo_id, @ModelAttribute CustomerComment customercomments) {
		Userinfo parent_userinfo = userinfoService.saveUserinfoCustomerComments(userinfo_id, customercomments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("userinfo", parent_userinfo);
		mav.setViewName("userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Create a new Userinfo entity
	 * 
	 */
	@RequestMapping("/newUserinfo")
	public ModelAndView newUserinfo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", new Userinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("userinfo/editUserinfo.jsp");

		return mav;
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/deleteUserinfo")
	public String deleteUserinfo(@RequestParam Integer idKey) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(idKey);
		userinfoService.deleteUserinfo(userinfo);
		return "forward:/indexUserinfo";
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/saveUserinfo")
	public String saveUserinfo(@ModelAttribute Userinfo userinfo) {
		userinfoService.saveUserinfo(userinfo);
		return "forward:/indexUserinfo";
	}

	/**
	 * Entry point to show all Userinfo entities
	 * 
	 */
	public String indexUserinfo() {
		return "redirect:/indexUserinfo";
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newUserinfoOrders")
	public ModelAndView newUserinfoOrders(@RequestParam Integer userinfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("userinfo/orders/editOrders.jsp");

		return mav;
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping("/selectUserinfoOrders")
	public ModelAndView selectUserinfoOrders(@RequestParam Integer userinfo_id, @RequestParam Integer orders_id) {
		Order order = orderDAO.findOrderByPrimaryKey(orders_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("order", order);
		mav.setViewName("userinfo/orders/viewOrders.jsp");

		return mav;
	}

	/**
	 * Select the Userinfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserinfo")
	public ModelAndView confirmDeleteUserinfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(idKey));
		mav.setViewName("userinfo/deleteUserinfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/editUserinfo")
	public ModelAndView editUserinfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(idKey));
		mav.setViewName("userinfo/editUserinfo.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerComment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserinfoCustomerComments")
	public ModelAndView confirmDeleteUserinfoCustomerComments(@RequestParam Integer userinfo_id, @RequestParam Integer related_customercomments_proId, @RequestParam Integer related_customercomments_userId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments_proId, related_customercomments_userId));
		mav.addObject("userinfo_id", userinfo_id);
		mav.setViewName("userinfo/customercomments/deleteCustomerComments.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/editUserinfoCustomerComments")
	public ModelAndView editUserinfoCustomerComments(@RequestParam Integer userinfo_id, @RequestParam Integer customercomments_proId, @RequestParam Integer customercomments_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomments_proId, customercomments_userId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("customercomment", customercomment);
		mav.setViewName("userinfo/customercomments/editCustomerComments.jsp");

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
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/deleteUserinfoCustomerComments")
	public ModelAndView deleteUserinfoCustomerComments(@RequestParam Integer userinfo_id, @RequestParam Integer related_customercomments_proId, @RequestParam Integer related_customercomments_userId) {
		ModelAndView mav = new ModelAndView();

		Userinfo userinfo = userinfoService.deleteUserinfoCustomerComments(userinfo_id, related_customercomments_proId, related_customercomments_userId);

		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("userinfo", userinfo);
		mav.setViewName("userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Show all Userinfo entities
	 * 
	 */
	@RequestMapping("/indexUserinfo")
	public ModelAndView listUserinfos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfos", userinfoService.loadUserinfos());

		mav.setViewName("userinfo/listUserinfos.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/selectUserinfoCustomerComments")
	public ModelAndView selectUserinfoCustomerComments(@RequestParam Integer userinfo_id, @RequestParam Integer customercomments_proId, @RequestParam Integer customercomments_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomments_proId, customercomments_userId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("customercomment", customercomment);
		mav.setViewName("userinfo/customercomments/viewCustomerComments.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerComment entity
	 * 
	 */
	@RequestMapping("/newUserinfoCustomerComments")
	public ModelAndView newUserinfoCustomerComments(@RequestParam Integer userinfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("customercomment", new CustomerComment());
		mav.addObject("newFlag", true);
		mav.setViewName("userinfo/customercomments/editCustomerComments.jsp");

		return mav;
	}

	/**
	 * Select an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/selectUserinfo")
	public ModelAndView selectUserinfo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(idKey));
		mav.setViewName("userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Show all CustomerComment entities by Userinfo
	 * 
	 */
	@RequestMapping("/listUserinfoCustomerComments")
	public ModelAndView listUserinfoCustomerComments(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(idKey));
		mav.setViewName("userinfo/customercomments/listCustomerComments.jsp");

		return mav;
	}

	/**
	 * Show all Order entities by Userinfo
	 * 
	 */
	@RequestMapping("/listUserinfoOrders")
	public ModelAndView listUserinfoOrders(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(idKey));
		mav.setViewName("userinfo/orders/listOrders.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/userinfoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveUserinfoOrders")
	public ModelAndView saveUserinfoOrders(@RequestParam Integer userinfo_id, @ModelAttribute Order orders) {
		Userinfo parent_userinfo = userinfoService.saveUserinfoOrders(userinfo_id, orders);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userinfo_id", userinfo_id);
		mav.addObject("userinfo", parent_userinfo);
		mav.setViewName("userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserinfoOrders")
	public ModelAndView confirmDeleteUserinfoOrders(@RequestParam Integer userinfo_id, @RequestParam Integer related_orders_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_orders_id));
		mav.addObject("userinfo_id", userinfo_id);
		mav.setViewName("userinfo/orders/deleteOrders.jsp");

		return mav;
	}
}