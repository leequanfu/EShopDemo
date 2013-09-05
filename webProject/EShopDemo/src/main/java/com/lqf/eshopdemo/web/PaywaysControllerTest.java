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
 * Unit test for the <code>PaywaysController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.PaywaysController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class PaywaysControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexPayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePayways()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePayways() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePayways");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>paywaysControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetpaywaysControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/paywaysController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PaywaysController controller = (PaywaysController) context.getBean("PaywaysController");

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