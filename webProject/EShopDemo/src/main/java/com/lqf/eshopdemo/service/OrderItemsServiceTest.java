package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductDetail;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
@Transactional
public class OrderItemsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected OrderItemsService service;

	/**
	 * Instantiates a new OrderItemsServiceTest.
	 *
	 */
	public OrderItemsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all OrderItems entity
	 * 
	 */
	@Test
	public void findAllOrderItemss() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrderItemss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<OrderItems> response = null;
		response = service.findAllOrderItemss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrderItemss
	}

	/**
	 * Operation Unit Test
	 * Load an existing OrderItems entity
	 * 
	 */
	@Test
	public void loadOrderItemss() {
		Set<OrderItems> response = null;
		response = service.loadOrderItemss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrderItemss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Test
	public void saveOrderItemsProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderItemsProductDetail 
		Integer orderId = 0;
		Integer productId = 0;
		ProductDetail related_productdetail = new com.lqf.eshopdemo.domain.ProductDetail();
		OrderItems response = null;
		response = service.saveOrderItemsProductDetail(orderId, productId, related_productdetail);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderItemsProductDetail
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderItemsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderItemsByPrimaryKey 
		Integer orderId_1 = 0;
		Integer productId_1 = 0;
		OrderItems response = null;
		response = service.findOrderItemsByPrimaryKey(orderId_1, productId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderItemsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Order entity
	 * 
	 */
	@Test
	public void saveOrderItemsOrder() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderItemsOrder 
		Integer orderId_2 = 0;
		Integer productId_2 = 0;
		Order related_order = new com.lqf.eshopdemo.domain.Order();
		OrderItems response = null;
		response = service.saveOrderItemsOrder(orderId_2, productId_2, related_order);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderItemsOrder
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderItems entity
	 * 
	 */
	@Test
	public void saveOrderItems() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderItems 
		OrderItems orderitems = new com.lqf.eshopdemo.domain.OrderItems();
		service.saveOrderItems(orderitems);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderItems entity
	 * 
	 */
	@Test
	public void deleteOrderItems() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderItems 
		OrderItems orderitems_1 = new com.lqf.eshopdemo.domain.OrderItems();
		service.deleteOrderItems(orderitems_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Order entity
	 * 
	 */
	@Test
	public void deleteOrderItemsOrder() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderItemsOrder 
		Integer orderitems_orderId = 0;
		Integer orderitems_productId = 0;
		Integer related_order_id = 0;
		OrderItems response = null;
		response = service.deleteOrderItemsOrder(orderitems_orderId, orderitems_productId, related_order_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderItemsOrder
	}

	/**
	 * Operation Unit Test
	 * Return a count of all OrderItems entity
	 * 
	 */
	@Test
	public void countOrderItemss() {
		Integer response = null;
		response = service.countOrderItemss();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrderItemss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Test
	public void deleteOrderItemsProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderItemsProductDetail 
		Integer orderitems_orderId_1 = 0;
		Integer orderitems_productId_1 = 0;
		Integer related_productdetail_id = 0;
		OrderItems response = null;
		response = service.deleteOrderItemsProductDetail(orderitems_orderId_1, orderitems_productId_1, related_productdetail_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderItemsProductDetail
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
