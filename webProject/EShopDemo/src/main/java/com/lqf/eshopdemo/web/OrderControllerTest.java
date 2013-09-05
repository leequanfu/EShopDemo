package com.lqf.eshopdemo.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>OrderController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.OrderController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class OrderControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}