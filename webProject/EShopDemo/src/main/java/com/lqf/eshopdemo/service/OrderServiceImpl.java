package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.UserinfoDAO;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.Userinfo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */

@Service("OrderService")
@Transactional
public class OrderServiceImpl implements OrderService {

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
	 * Instantiates a new OrderServiceImpl.
	 *
	 */
	public OrderServiceImpl() {
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public void saveOrder(Order order) {
		Order existingOrder = orderDAO.findOrderByPrimaryKey(order.getId());

		if (existingOrder != null) {
			if (existingOrder != order) {
				existingOrder.setId(order.getId());
				existingOrder.setAddress(order.getAddress());
				existingOrder.setPhone(order.getPhone());
				existingOrder.setPayway(order.getPayway());
			}
			order = orderDAO.store(existingOrder);
		} else {
			order = orderDAO.store(order);
		}
		orderDAO.flush();
	}

	/**
	 * Load an existing Order entity
	 * 
	 */
	@Transactional
	public Set<Order> loadOrders() {
		return orderDAO.findAllOrders();
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@Transactional
	public Order deleteOrderOrderItemses(Integer order_id, Integer related_orderitemses_orderId, Integer related_orderitemses_productId) {
		OrderItems related_orderitemses = orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses_orderId, related_orderitemses_productId, -1, -1);

		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		related_orderitemses.setOrder(null);
		order.getOrderItemses().remove(related_orderitemses);

		orderItemsDAO.remove(related_orderitemses);
		orderItemsDAO.flush();

		return order;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@Transactional
	public Order saveOrderOrderItemses(Integer id, OrderItems related_orderitemses) {
		Order order = orderDAO.findOrderByPrimaryKey(id, -1, -1);
		OrderItems existingorderItemses = orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses.getOrderId(), related_orderitemses.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingorderItemses != null) {
			existingorderItemses.setOrderId(related_orderitemses.getOrderId());
			existingorderItemses.setProductId(related_orderitemses.getProductId());
			existingorderItemses.setPrice(related_orderitemses.getPrice());
			existingorderItemses.setQuality(related_orderitemses.getQuality());
			related_orderitemses = existingorderItemses;
		} else {
			related_orderitemses = orderItemsDAO.store(related_orderitemses);
			orderItemsDAO.flush();
		}

		related_orderitemses.setOrder(order);
		order.getOrderItemses().add(related_orderitemses);
		related_orderitemses = orderItemsDAO.store(related_orderitemses);
		orderItemsDAO.flush();

		order = orderDAO.store(order);
		orderDAO.flush();

		return order;
	}

	/**
	 */
	@Transactional
	public Order findOrderByPrimaryKey(Integer id) {
		return orderDAO.findOrderByPrimaryKey(id);
	}

	/**
	 * Delete an existing Userinfo entity
	 * 
	 */
	@Transactional
	public Order deleteOrderUserinfo(Integer order_id, Integer related_userinfo_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);
		Userinfo related_userinfo = userinfoDAO.findUserinfoByPrimaryKey(related_userinfo_id, -1, -1);

		order.setUserinfo(null);
		related_userinfo.getOrders().remove(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_userinfo = userinfoDAO.store(related_userinfo);
		userinfoDAO.flush();

		userinfoDAO.remove(related_userinfo);
		userinfoDAO.flush();

		return order;
	}

	/**
	 * Return a count of all Order entity
	 * 
	 */
	@Transactional
	public Integer countOrders() {
		return ((Long) orderDAO.createQuerySingleResult("select count(o) from Order o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public void deleteOrder(Order order) {
		orderDAO.remove(order);
		orderDAO.flush();
	}

	/**
	 * Return all Order entity
	 * 
	 */
	@Transactional
	public List<Order> findAllOrders(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Order>(orderDAO.findAllOrders(startResult, maxRows));
	}

	/**
	 * Save an existing Userinfo entity
	 * 
	 */
	@Transactional
	public Order saveOrderUserinfo(Integer id, Userinfo related_userinfo) {
		Order order = orderDAO.findOrderByPrimaryKey(id, -1, -1);
		Userinfo existinguserinfo = userinfoDAO.findUserinfoByPrimaryKey(related_userinfo.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguserinfo != null) {
			existinguserinfo.setId(related_userinfo.getId());
			existinguserinfo.setUsername(related_userinfo.getUsername());
			existinguserinfo.setPassword(related_userinfo.getPassword());
			existinguserinfo.setFirstname(related_userinfo.getFirstname());
			existinguserinfo.setSecondname(related_userinfo.getSecondname());
			existinguserinfo.setGender(related_userinfo.getGender());
			existinguserinfo.setBirthday(related_userinfo.getBirthday());
			existinguserinfo.setEmail(related_userinfo.getEmail());
			existinguserinfo.setAddress(related_userinfo.getAddress());
			existinguserinfo.setPostcode(related_userinfo.getPostcode());
			existinguserinfo.setPhone(related_userinfo.getPhone());
			related_userinfo = existinguserinfo;
		}

		order.setUserinfo(related_userinfo);
		related_userinfo.getOrders().add(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_userinfo = userinfoDAO.store(related_userinfo);
		userinfoDAO.flush();

		return order;
	}
}
