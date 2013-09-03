package com.lqf.eshopdemo.web;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.Userinfo;

import com.lqf.eshopdemo.service.CustomerCommentService;

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
 * Spring MVC controller that handles CRUD requests for CustomerComment entities
 * 
 */

@Controller("CustomerCommentController")
public class CustomerCommentController {

	/**
	 * DAO injected by Spring that manages CustomerComment entities
	 * 
	 */
	@Autowired
	private CustomerCommentDAO customerCommentDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * DAO injected by Spring that manages Userinfo entities
	 * 
	 */
	@Autowired
	private UserinfoDAO userinfoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CustomerComment entities
	 * 
	 */
	@Autowired
	private CustomerCommentService customerCommentService;

	/**
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/selectCustomerCommentProductDetail")
	public ModelAndView selectCustomerCommentProductDetail(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("customercomment/productdetail/viewProductDetail.jsp");

		return mav;
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/saveCustomerCommentUserinfo")
	public ModelAndView saveCustomerCommentUserinfo(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @ModelAttribute Userinfo userinfo) {
		CustomerComment parent_customercomment = customerCommentService.saveCustomerCommentUserinfo(customercomment_proId, customercomment_userId, userinfo);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("customercomment", parent_customercomment);
		mav.setViewName("customercomment/viewCustomerComment.jsp");

		return mav;
	}

	/**
	 * Select an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/selectCustomerComment")
	public ModelAndView selectCustomerComment(@RequestParam Integer proIdKey, @RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(proIdKey, userIdKey));
		mav.setViewName("customercomment/viewCustomerComment.jsp");

		return mav;
	}

	/**
	 * View an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/selectCustomerCommentUserinfo")
	public ModelAndView selectCustomerCommentUserinfo(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("userinfo", userinfo);
		mav.setViewName("customercomment/userinfo/viewUserinfo.jsp");

		return mav;
	}

	/**
	 * Show all Userinfo entities by CustomerComment
	 * 
	 */
	@RequestMapping("/listCustomerCommentUserinfo")
	public ModelAndView listCustomerCommentUserinfo(@RequestParam Integer proIdKey, @RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(proIdKey, userIdKey));
		mav.setViewName("customercomment/userinfo/listUserinfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/editCustomerCommentUserinfo")
	public ModelAndView editCustomerCommentUserinfo(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("userinfo", userinfo);
		mav.setViewName("customercomment/userinfo/editUserinfo.jsp");

		return mav;
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping("/newCustomerCommentProductDetail")
	public ModelAndView newCustomerCommentProductDetail(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("productdetail", new ProductDetail());
		mav.addObject("newFlag", true);
		mav.setViewName("customercomment/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerComment entity
	 * 
	 */
	@RequestMapping("/newCustomerComment")
	public ModelAndView newCustomerComment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", new CustomerComment());
		mav.addObject("newFlag", true);
		mav.setViewName("customercomment/editCustomerComment.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/saveCustomerComment")
	public String saveCustomerComment(@ModelAttribute CustomerComment customercomment) {
		customerCommentService.saveCustomerComment(customercomment);
		return "forward:/indexCustomerComment";
	}

	/**
	 */
	@RequestMapping("/customercommentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the child ProductDetail entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerCommentProductDetail")
	public ModelAndView confirmDeleteCustomerCommentProductDetail(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productdetail", productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id));
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.setViewName("customercomment/productdetail/deleteProductDetail.jsp");

		return mav;
	}

	/**
	 * Show all CustomerComment entities
	 * 
	 */
	@RequestMapping("/indexCustomerComment")
	public ModelAndView listCustomerComments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomments", customerCommentService.loadCustomerComments());

		mav.setViewName("customercomment/listCustomerComments.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/editCustomerComment")
	public ModelAndView editCustomerComment(@RequestParam Integer proIdKey, @RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(proIdKey, userIdKey));
		mav.setViewName("customercomment/editCustomerComment.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/deleteCustomerCommentProductDetail")
	public ModelAndView deleteCustomerCommentProductDetail(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer related_productdetail_id) {
		ModelAndView mav = new ModelAndView();

		CustomerComment customercomment = customerCommentService.deleteCustomerCommentProductDetail(customercomment_proId, customercomment_userId, related_productdetail_id);

		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("customercomment", customercomment);
		mav.setViewName("customercomment/viewCustomerComment.jsp");

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
	 * Edit an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/editCustomerCommentProductDetail")
	public ModelAndView editCustomerCommentProductDetail(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("productdetail", productdetail);
		mav.setViewName("customercomment/productdetail/editProductDetail.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping("/saveCustomerCommentProductDetail")
	public ModelAndView saveCustomerCommentProductDetail(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @ModelAttribute ProductDetail productdetail) {
		CustomerComment parent_customercomment = customerCommentService.saveCustomerCommentProductDetail(customercomment_proId, customercomment_userId, productdetail);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("customercomment", parent_customercomment);
		mav.setViewName("customercomment/viewCustomerComment.jsp");

		return mav;
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@RequestMapping("/deleteCustomerCommentUserinfo")
	public ModelAndView deleteCustomerCommentUserinfo(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer related_userinfo_id) {
		ModelAndView mav = new ModelAndView();

		CustomerComment customercomment = customerCommentService.deleteCustomerCommentUserinfo(customercomment_proId, customercomment_userId, related_userinfo_id);

		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("customercomment", customercomment);
		mav.setViewName("customercomment/viewCustomerComment.jsp");

		return mav;
	}

	/**
	 * Show all ProductDetail entities by CustomerComment
	 * 
	 */
	@RequestMapping("/listCustomerCommentProductDetail")
	public ModelAndView listCustomerCommentProductDetail(@RequestParam Integer proIdKey, @RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(proIdKey, userIdKey));
		mav.setViewName("customercomment/productdetail/listProductDetail.jsp");

		return mav;
	}

	/**
	 * Select the CustomerComment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerComment")
	public ModelAndView confirmDeleteCustomerComment(@RequestParam Integer proIdKey, @RequestParam Integer userIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customercomment", customerCommentDAO.findCustomerCommentByPrimaryKey(proIdKey, userIdKey));
		mav.setViewName("customercomment/deleteCustomerComment.jsp");

		return mav;
	}

	/**
	 * Create a new Userinfo entity
	 * 
	 */
	@RequestMapping("/newCustomerCommentUserinfo")
	public ModelAndView newCustomerCommentUserinfo(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.addObject("userinfo", new Userinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("customercomment/userinfo/editUserinfo.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@RequestMapping("/deleteCustomerComment")
	public String deleteCustomerComment(@RequestParam Integer proIdKey, @RequestParam Integer userIdKey) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(proIdKey, userIdKey);
		customerCommentService.deleteCustomerComment(customercomment);
		return "forward:/indexCustomerComment";
	}

	/**
	 * Select the child Userinfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerCommentUserinfo")
	public ModelAndView confirmDeleteCustomerCommentUserinfo(@RequestParam Integer customercomment_proId, @RequestParam Integer customercomment_userId, @RequestParam Integer related_userinfo_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userinfo", userinfoDAO.findUserinfoByPrimaryKey(related_userinfo_id));
		mav.addObject("customercomment_proId", customercomment_proId);
		mav.addObject("customercomment_userId", customercomment_userId);
		mav.setViewName("customercomment/userinfo/deleteUserinfo.jsp");

		return mav;
	}

	/**
	 * Entry point to show all CustomerComment entities
	 * 
	 */
	public String indexCustomerComment() {
		return "redirect:/indexCustomerComment";
	}
}