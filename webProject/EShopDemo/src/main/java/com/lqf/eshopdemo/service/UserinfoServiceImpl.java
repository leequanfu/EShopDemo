package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.Userinfo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Userinfo entities
 * 
 */

@Service("UserinfoService")
@Transactional
public class UserinfoServiceImpl implements UserinfoService {

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
	 * Instantiates a new UserinfoServiceImpl.
	 *
	 */
	public UserinfoServiceImpl() {
	}

	/**
	 * Load an existing Userinfo entity
	 * 
	 */
	@Transactional
	public Set<Userinfo> loadUserinfos() {
		return userinfoDAO.findAllUserinfos();
	}

	/**
	 * Return a count of all Userinfo entity
	 * 
	 */
	@Transactional
	public Integer countUserinfos() {
		return ((Long) userinfoDAO.createQuerySingleResult("select count(o) from Userinfo o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@Transactional
	public void deleteUserinfo(Userinfo userinfo) {
		userinfoDAO.remove(userinfo);
		userinfoDAO.flush();
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@Transactional
	public void saveUserinfo(Userinfo userinfo) {
		Userinfo existingUserinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo.getId());

		if (existingUserinfo != null) {
			if (existingUserinfo != userinfo) {
				existingUserinfo.setId(userinfo.getId());
				existingUserinfo.setUsername(userinfo.getUsername());
				existingUserinfo.setPassword(userinfo.getPassword());
				existingUserinfo.setFirstname(userinfo.getFirstname());
				existingUserinfo.setSecondname(userinfo.getSecondname());
				existingUserinfo.setGender(userinfo.getGender());
				existingUserinfo.setBirthday(userinfo.getBirthday());
				existingUserinfo.setEmail(userinfo.getEmail());
				existingUserinfo.setAddress(userinfo.getAddress());
				existingUserinfo.setPostcode(userinfo.getPostcode());
				existingUserinfo.setPhone(userinfo.getPhone());
			}
			userinfo = userinfoDAO.store(existingUserinfo);
		} else {
			userinfo = userinfoDAO.store(userinfo);
		}
		userinfoDAO.flush();
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public Userinfo saveUserinfoCustomerComments(Integer id, CustomerComment related_customercomments) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(id, -1, -1);
		CustomerComment existingcustomerComments = customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments.getProId(), related_customercomments.getUserId());

		// copy into the existing record to preserve existing relationships
		if (existingcustomerComments != null) {
			existingcustomerComments.setProId(related_customercomments.getProId());
			existingcustomerComments.setUserId(related_customercomments.getUserId());
			existingcustomerComments.setRate(related_customercomments.getRate());
			existingcustomerComments.setComment(related_customercomments.getComment());
			related_customercomments = existingcustomerComments;
		} else {
			related_customercomments = customerCommentDAO.store(related_customercomments);
			customerCommentDAO.flush();
		}

		related_customercomments.setUserinfo(userinfo);
		userinfo.getCustomerComments().add(related_customercomments);
		related_customercomments = customerCommentDAO.store(related_customercomments);
		customerCommentDAO.flush();

		userinfo = userinfoDAO.store(userinfo);
		userinfoDAO.flush();

		return userinfo;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public Userinfo saveUserinfoOrders(Integer id, Order related_orders) {
		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(id, -1, -1);
		Order existingorders = orderDAO.findOrderByPrimaryKey(related_orders.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorders != null) {
			existingorders.setId(related_orders.getId());
			existingorders.setAddress(related_orders.getAddress());
			existingorders.setPhone(related_orders.getPhone());
			existingorders.setPayway(related_orders.getPayway());
			related_orders = existingorders;
		}

		related_orders.setUserinfo(userinfo);
		userinfo.getOrders().add(related_orders);
		related_orders = orderDAO.store(related_orders);
		orderDAO.flush();

		userinfo = userinfoDAO.store(userinfo);
		userinfoDAO.flush();

		return userinfo;
	}

	/**
	 */
	@Transactional
	public Userinfo findUserinfoByPrimaryKey(Integer id) {
		return userinfoDAO.findUserinfoByPrimaryKey(id);
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public Userinfo deleteUserinfoOrders(Integer userinfo_id, Integer related_orders_id) {
		Order related_orders = orderDAO.findOrderByPrimaryKey(related_orders_id, -1, -1);

		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id, -1, -1);

		related_orders.setUserinfo(null);
		userinfo.getOrders().remove(related_orders);

		orderDAO.remove(related_orders);
		orderDAO.flush();

		return userinfo;
	}

	/**
	 * Return all Userinfo entity
	 * 
	 */
	@Transactional
	public List<Userinfo> findAllUserinfos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Userinfo>(userinfoDAO.findAllUserinfos(startResult, maxRows));
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public Userinfo deleteUserinfoCustomerComments(Integer userinfo_id, Integer related_customercomments_proId, Integer related_customercomments_userId) {
		CustomerComment related_customercomments = customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments_proId, related_customercomments_userId, -1, -1);

		Userinfo userinfo = userinfoDAO.findUserinfoByPrimaryKey(userinfo_id, -1, -1);

		related_customercomments.setUserinfo(null);
		userinfo.getCustomerComments().remove(related_customercomments);

		customerCommentDAO.remove(related_customercomments);
		customerCommentDAO.flush();

		return userinfo;
	}
}
