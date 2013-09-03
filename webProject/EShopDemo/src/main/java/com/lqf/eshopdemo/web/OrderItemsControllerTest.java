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
 * Unit test for the <code>OrderItemsController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.OrderItemsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class OrderItemsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderItemsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderItemsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderItemsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderItemsProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderItemsProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderItemsProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderitemsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderitemsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderitemsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsController controller = (OrderItemsController) context.getBean("OrderItemsController");

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