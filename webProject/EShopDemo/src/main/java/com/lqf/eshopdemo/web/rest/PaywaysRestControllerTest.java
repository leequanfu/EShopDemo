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
 * Unit test for the <code>PaywaysRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.PaywaysRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class PaywaysRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Payways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Payways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysRestController controller = (PaywaysRestController) context.getBean("PaywaysRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Paywayspayways_way()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPaywayspayways_way() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Payways/{payways_way}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysRestController controller = (PaywaysRestController) context.getBean("PaywaysRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Payways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Payways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysRestController controller = (PaywaysRestController) context.getBean("PaywaysRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Payways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Payways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysRestController controller = (PaywaysRestController) context.getBean("PaywaysRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Paywayspayways_way()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeletePaywayspayways_way() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Payways/{payways_way}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysRestController controller = (PaywaysRestController) context.getBean("PaywaysRestController");

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