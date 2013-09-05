package com.lqf.eshopdemo.web.rest;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.Userinfo;

import com.lqf.eshopdemo.service.CustomerCommentService;

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
 * Spring Rest controller that handles CRUD requests for CustomerComment entities
 * 
 */

@Controller("CustomerCommentRestController")
public class CustomerCommentRestController {

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
	 * Create a new Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo", method = RequestMethod.POST)
	@ResponseBody
	public Userinfo newCustomerCommentUserinfo(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @RequestBody Userinfo userinfo) {
		customerCommentService.saveCustomerCommentUserinfo(customercomment_proId, customercomment_userId, userinfo);
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo/{userinfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCustomerCommentUserinfo(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @PathVariable Integer related_userinfo_id) {
		customerCommentService.deleteCustomerCommentUserinfo(customercomment_proId, customercomment_userId, related_userinfo_id);
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo", method = RequestMethod.PUT)
	@ResponseBody
	public Userinfo saveCustomerCommentUserinfo(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @RequestBody Userinfo userinfo) {
		customerCommentService.saveCustomerCommentUserinfo(customercomment_proId, customercomment_userId, userinfo);
		return userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail/{productdetail_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCustomerCommentProductDetail(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @PathVariable Integer related_productdetail_id) {
		customerCommentService.deleteCustomerCommentProductDetail(customercomment_proId, customercomment_userId, related_productdetail_id);
	}

	/**
	 * Create a new CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment", method = RequestMethod.POST)
	@ResponseBody
	public CustomerComment newCustomerComment(@RequestBody CustomerComment customercomment) {
		customerCommentService.saveCustomerComment(customercomment);
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment.getProId(), customercomment.getUserId());
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
	 * View an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail/{productdetail_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail loadCustomerCommentProductDetail(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @PathVariable Integer related_productdetail_id) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		return productdetail;
	}

	/**
	 * Create a new ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail", method = RequestMethod.POST)
	@ResponseBody
	public ProductDetail newCustomerCommentProductDetail(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @RequestBody ProductDetail productdetail) {
		customerCommentService.saveCustomerCommentProductDetail(customercomment_proId, customercomment_userId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * Get ProductDetail entity by CustomerComment
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail", method = RequestMethod.GET)
	@ResponseBody
	public ProductDetail getCustomerCommentProductDetail(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId) {
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment_proId, customercomment_userId).getProductDetail();
	}

	/**
	 * Get Userinfo entity by CustomerComment
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo", method = RequestMethod.GET)
	@ResponseBody
	public Userinfo getCustomerCommentUserinfo(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId) {
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment_proId, customercomment_userId).getUserinfo();
	}

	/**
	 * Show all CustomerComment entities
	 * 
	 */
	@RequestMapping(value = "/CustomerComment", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerComment> listCustomerComments() {
		return new java.util.ArrayList<CustomerComment>(customerCommentService.loadCustomerComments());
	}

	/**
	 * Select an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}", method = RequestMethod.GET)
	@ResponseBody
	public CustomerComment loadCustomerComment(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId) {
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment_proId, customercomment_userId);
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail", method = RequestMethod.PUT)
	@ResponseBody
	public ProductDetail saveCustomerCommentProductDetail(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @RequestBody ProductDetail productdetail) {
		customerCommentService.saveCustomerCommentProductDetail(customercomment_proId, customercomment_userId, productdetail);
		return productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());
	}

	/**
	 * View an existing Userinfo entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo/{userinfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Userinfo loadCustomerCommentUserinfo(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId, @PathVariable Integer related_userinfo_id) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(related_userinfo_id, -1, -1);

		return userinfo;
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment", method = RequestMethod.PUT)
	@ResponseBody
	public CustomerComment saveCustomerComment(@RequestBody CustomerComment customercomment) {
		customerCommentService.saveCustomerComment(customercomment);
		return customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment.getProId(), customercomment.getUserId());
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@RequestMapping(value = "/CustomerComment/{customercomment_proId}/{customercomment_userId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCustomerComment(@PathVariable Integer customercomment_proId, @PathVariable Integer customercomment_userId) {
		CustomerComment customercomment = customerCommentDAO.findCustomerCommentByPrimaryKey(customercomment_proId, customercomment_userId);
		customerCommentService.deleteCustomerComment(customercomment);
	}
}