package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.OrderDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductDetail;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for OrderItems entities
 * 
 */

@Service("OrderItemsService")
@Transactional
public class OrderItemsServiceImpl implements OrderItemsService {

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
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * Instantiates a new OrderItemsServiceImpl.
	 *
	 */
	public OrderItemsServiceImpl() {
	}

	/**
	 * Return all OrderItems entity
	 * 
	 */
	@Transactional
	public List<OrderItems> findAllOrderItemss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<OrderItems>(orderItemsDAO.findAllOrderItemss(startResult, maxRows));
	}

	/**
	 * Load an existing OrderItems entity
	 * 
	 */
	@Transactional
	public Set<OrderItems> loadOrderItemss() {
		return orderItemsDAO.findAllOrderItemss();
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public OrderItems saveOrderItemsProductDetail(Integer orderId, Integer productId, ProductDetail related_productdetail) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderId, productId, -1, -1);
		ProductDetail existingproductDetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproductDetail != null) {
			existingproductDetail.setId(related_productdetail.getId());
			existingproductDetail.setTitle(related_productdetail.getTitle());
			existingproductDetail.setPrice(related_productdetail.getPrice());
			existingproductDetail.setQuantity(related_productdetail.getQuantity());
			existingproductDetail.setDescription(related_productdetail.getDescription());
			related_productdetail = existingproductDetail;
		} else {
			related_productdetail = productDetailDAO.store(related_productdetail);
			productDetailDAO.flush();
		}

		orderitems.setProductDetail(related_productdetail);
		related_productdetail.getOrderItemses().add(orderitems);
		orderitems = orderItemsDAO.store(orderitems);
		orderItemsDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		return orderitems;
	}

	/**
	 */
	@Transactional
	public OrderItems findOrderItemsByPrimaryKey(Integer orderId, Integer productId) {
		return orderItemsDAO.findOrderItemsByPrimaryKey(orderId, productId);
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public OrderItems saveOrderItemsOrder(Integer orderId, Integer productId, Order related_order) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderId, productId, -1, -1);
		Order existingorder = orderDAO.findOrderByPrimaryKey(related_order.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorder != null) {
			existingorder.setId(related_order.getId());
			existingorder.setAddress(related_order.getAddress());
			existingorder.setPhone(related_order.getPhone());
			existingorder.setPayway(related_order.getPayway());
			related_order = existingorder;
		} else {
			related_order = orderDAO.store(related_order);
			orderDAO.flush();
		}

		orderitems.setOrder(related_order);
		related_order.getOrderItemses().add(orderitems);
		orderitems = orderItemsDAO.store(orderitems);
		orderItemsDAO.flush();

		related_order = orderDAO.store(related_order);
		orderDAO.flush();

		return orderitems;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@Transactional
	public void saveOrderItems(OrderItems orderitems) {
		OrderItems existingOrderItems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitems.getOrderId(), orderitems.getProductId());

		if (existingOrderItems != null) {
			if (existingOrderItems != orderitems) {
				existingOrderItems.setOrderId(orderitems.getOrderId());
				existingOrderItems.setProductId(orderitems.getProductId());
				existingOrderItems.setPrice(orderitems.getPrice());
				existingOrderItems.setQuality(orderitems.getQuality());
			}
			orderitems = orderItemsDAO.store(existingOrderItems);
		} else {
			orderitems = orderItemsDAO.store(orderitems);
		}
		orderItemsDAO.flush();
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@Transactional
	public void deleteOrderItems(OrderItems orderitems) {
		orderItemsDAO.remove(orderitems);
		orderItemsDAO.flush();
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public OrderItems deleteOrderItemsOrder(Integer orderitems_orderId, Integer orderitems_productId, Integer related_order_id) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitems_orderId, orderitems_productId, -1, -1);
		Order related_order = orderDAO.findOrderByPrimaryKey(related_order_id, -1, -1);

		orderitems.setOrder(null);
		related_order.getOrderItemses().remove(orderitems);
		orderitems = orderItemsDAO.store(orderitems);
		orderItemsDAO.flush();

		related_order = orderDAO.store(related_order);
		orderDAO.flush();

		orderDAO.remove(related_order);
		orderDAO.flush();

		return orderitems;
	}

	/**
	 * Return a count of all OrderItems entity
	 * 
	 */
	@Transactional
	public Integer countOrderItemss() {
		return ((Long) orderItemsDAO.createQuerySingleResult("select count(*) from OrderItems o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public OrderItems deleteOrderItemsProductDetail(Integer orderitems_orderId, Integer orderitems_productId, Integer related_productdetail_id) {
		OrderItems orderitems = orderItemsDAO.findOrderItemsByPrimaryKey(orderitems_orderId, orderitems_productId, -1, -1);
		ProductDetail related_productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		orderitems.setProductDetail(null);
		related_productdetail.getOrderItemses().remove(orderitems);
		orderitems = orderItemsDAO.store(orderitems);
		orderItemsDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		productDetailDAO.remove(related_productdetail);
		productDetailDAO.flush();

		return orderitems;
	}
}
