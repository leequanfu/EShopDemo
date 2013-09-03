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
	 * Save an existing Order entity
	 * 
	 */
	public Userinfo saveUserinfoOrders(Integer id, Order related_orders);

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	public void deleteUserinfo(Userinfo userinfo);

	/**
	 * Return all Userinfo entity
	 * 
	 */
	public List<Userinfo> findAllUserinfos(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	public void saveUserinfo(Userinfo userinfo_1);

	/**
	 */
	public Userinfo findUserinfoByPrimaryKey(Integer id_1);

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	public Userinfo deleteUserinfoCustomerComments(Integer userinfo_id, Integer related_customercomments_proId, Integer related_customercomments_userId);

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	public Userinfo saveUserinfoCustomerComments(Integer id_2, CustomerComment related_customercomments);

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
	 * Delete an existing Order entity
	 * 
	 */
	public Userinfo deleteUserinfoOrders(Integer userinfo_id_1, Integer related_orders_id);
}