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
 * Unit test for the <code>UserinfoRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.UserinfoRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class UserinfoRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Userinfouserinfo_idcustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUserinfouserinfo_idcustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/customerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idcustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUserinfouserinfo_idcustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/customerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idcustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUserinfouserinfo_idcustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/customerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idcustomerCommentscustomercomment_proIdcustomercomment_userId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUserinfouserinfo_idcustomerCommentscustomercomment_proIdcustomercomment_userId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/customerComments/{customercomment_proId}/{customercomment_userId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idcustomerCommentscustomercomment_proIdcustomercomment_userId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUserinfouserinfo_idcustomerCommentscustomercomment_proIdcustomercomment_userId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/customerComments/{customercomment_proId}/{customercomment_userId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idorders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUserinfouserinfo_idorders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/orders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idorders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUserinfouserinfo_idorders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/orders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idorders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUserinfouserinfo_idorders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/orders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idordersorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUserinfouserinfo_idordersorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/orders/{order_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_idordersorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUserinfouserinfo_idordersorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}/orders/{order_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUserinfouserinfo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Userinfouserinfo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUserinfouserinfo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Userinfo/{userinfo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoRestController controller = (UserinfoRestController) context.getBean("UserinfoRestController");

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