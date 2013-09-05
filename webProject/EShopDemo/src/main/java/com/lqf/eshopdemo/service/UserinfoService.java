package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.Userinfo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Userinfo entities
 * 
 */
public interface UserinfoService {

	/**
	 * Load an existing Userinfo entity
	 * 
	 */
	public Set<Userinfo> loadUserinfos();

	/**
	 * Return a count of all Userinfo entity
	 * 
	 */
	public Integer countUserinfos();

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	public void deleteUserinfo(Userinfo userinfo);

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	public void saveUserinfo(Userinfo userinfo_1);

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	public Userinfo saveUserinfoCustomerComments(Integer id, CustomerComment related_customercomments);

	/**
	 * Save an existing Order entity
	 * 
	 */
	public Userinfo saveUserinfoOrders(Integer id_1, Order related_orders);

	/**
	 */
	public Userinfo findUserinfoByPrimaryKey(Integer id_2);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public Userinfo deleteUserinfoOrders(Integer userinfo_id, Integer related_orders_id);

	/**
	 * Return all Userinfo entity
	 * 
	 */
	public List<Userinfo> findAllUserinfos(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	public Userinfo deleteUserinfoCustomerComments(Integer userinfo_id_1, Integer related_customercomments_proId, Integer related_customercomments_userId);
}