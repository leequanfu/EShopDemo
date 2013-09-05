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
 * Unit test for the <code>OrderRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.OrderRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class OrderRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Orderorder_iduserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_iduserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_iduserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderorder_iduserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_iduserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderorder_iduserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_iduserinfouserinfo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_iduserinfouserinfo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/userinfo/{userinfo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_iduserinfouserinfo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_iduserinfouserinfo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/userinfo/{userinfo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_idorderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_idorderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/orderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_idorderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderorder_idorderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/orderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_idorderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderorder_idorderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/orderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_idorderItemsesorderitems_orderIdorderitems_productId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_idorderItemsesorderitems_orderIdorderitems_productId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_idorderItemsesorderitems_orderIdorderitems_productId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_idorderItemsesorderitems_orderIdorderitems_productId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Order()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Order()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Order()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

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