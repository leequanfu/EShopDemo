package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.Userinfo;

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
public class OrderServiceTest {

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
	protected OrderService service;

	/**
	 * Instantiates a new OrderServiceTest.
	 *
	 */
	public OrderServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Order entity
	 * 
	 */
	@Test
	public void saveOrder() {
		// TODO: JUnit - Populate test inputs for operation: saveOrder 
		Order order = new com.lqf.eshopdemo.domain.Order();
		service.saveOrder(order);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Order entity
	 * 
	 */
	@Test
	public void loadOrders() {
		Set<Order> response = null;
		response = service.loadOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderItems entity
	 * 
	 */
	@Test
	public void deleteOrderOrderItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderOrderItemses 
		Integer order_id = 0;
		Integer related_orderitemses_orderId = 0;
		Integer related_orderitemses_productId = 0;
		Order response = null;
		response = service.deleteOrderOrderItemses(order_id, related_orderitemses_orderId, related_orderitemses_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderOrderItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderItems entity
	 * 
	 */
	@Test
	public void saveOrderOrderItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderOrderItemses 
		Integer id = 0;
		OrderItems related_orderitemses = new com.lqf.eshopdemo.domain.OrderItems();
		Order response = null;
		response = service.saveOrderOrderItemses(id, related_orderitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderOrderItemses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderByPrimaryKey 
		Integer id_1 = 0;
		Order response = null;
		response = service.findOrderByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Userinfo entity
	 * 
	 */
	@Test
	public void deleteOrderUserinfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderUserinfo 
		Integer order_id_1 = 0;
		Integer related_userinfo_id = 0;
		Order response = null;
		response = service.deleteOrderUserinfo(order_id_1, related_userinfo_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderUserinfo
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Order entity
	 * 
	 */
	@Test
	public void countOrders() {
		Integer response = null;
		response = service.countOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Order entity
	 * 
	 */
	@Test
	public void deleteOrder() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrder 
		Order order_1 = new com.lqf.eshopdemo.domain.Order();
		service.deleteOrder(order_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Order entity
	 * 
	 */
	@Test
	public void findAllOrders() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrders 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Order> response = null;
		response = service.findAllOrders(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrders
	}

	/**
	 * Operation Unit Test
	 * Save an existing Userinfo entity
	 * 
	 */
	@Test
	public void saveOrderUserinfo() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderUserinfo 
		Integer id_2 = 0;
		Userinfo related_userinfo = new com.lqf.eshopdemo.domain.Userinfo();
		Order response = null;
		response = service.saveOrderUserinfo(id_2, related_userinfo);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderUserinfo
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
