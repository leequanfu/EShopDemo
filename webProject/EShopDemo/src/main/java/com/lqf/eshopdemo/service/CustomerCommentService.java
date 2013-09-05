package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.Userinfo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for CustomerComment entities
 * 
 */
public interface CustomerCommentService {

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	public CustomerComment deleteCustomerCommentUserinfo(Integer customercomment_proId, Integer customercomment_userId, Integer related_userinfo_id);

	/**
	 * Load an existing CustomerComment entity
	 * 
	 */
	public Set<CustomerComment> loadCustomerComments();

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	public CustomerComment saveCustomerCommentUserinfo(Integer proId, Integer userId, Userinfo related_userinfo);

	/**
	 * Return a count of all CustomerComment entity
	 * 
	 */
	public Integer countCustomerComments();

	/**
	 */
	public CustomerComment findCustomerCommentByPrimaryKey(Integer proId_1, Integer userId_1);

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	public void saveCustomerComment(CustomerComment customercomment);

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	public CustomerComment deleteCustomerCommentProductDetail(Integer customercomment_proId_1, Integer customercomment_userId_1, Integer related_productdetail_id);

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	public CustomerComment saveCustomerCommentProductDetail(Integer proId_2, Integer userId_2, ProductDetail related_productdetail);

	/**
	 * Return all CustomerComment entity
	 * 
	 */
	public List<CustomerComment> findAllCustomerComments(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	public void deleteCustomerComment(CustomerComment customercomment_1);
}