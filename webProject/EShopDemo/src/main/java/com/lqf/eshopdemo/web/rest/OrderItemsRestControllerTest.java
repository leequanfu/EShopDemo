package com.lqf.eshopdemo.web.rest;

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
 * Unit test for the <code>OrderItemsRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.OrderItemsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class OrderItemsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdorder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderItemsorderitems_orderIdorderitems_productIdorder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdorder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderItemsorderitems_orderIdorderitems_productIdorder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdorder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderItemsorderitems_orderIdorderitems_productIdorder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdorderorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderItemsorderitems_orderIdorderitems_productIdorderorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/order/{order_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdorderorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderItemsorderitems_orderIdorderitems_productIdorderorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/order/{order_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderItemsorderitems_orderIdorderitems_productIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderItemsorderitems_orderIdorderitems_productIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderItemsorderitems_orderIdorderitems_productIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderItemsorderitems_orderIdorderitems_productIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderItemsorderitems_orderIdorderitems_productIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderItemsorderitems_orderIdorderitems_productId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderItemsorderitems_orderIdorderitems_productId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderItemsorderitems_orderIdorderitems_productId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderItems/{orderitems_orderId}/{orderitems_productId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderItemsRestController controller = (OrderItemsRestController) context.getBean("OrderItemsRestController");

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