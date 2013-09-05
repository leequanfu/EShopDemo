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
 * Unit test for the <code>CustomerCommentRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.CustomerCommentRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class CustomerCommentRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIduserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomerCommentcustomercomment_proIdcustomercomment_userIduserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIduserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCustomerCommentcustomercomment_proIdcustomercomment_userIduserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIduserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCustomerCommentcustomercomment_proIdcustomercomment_userIduserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIduserinfouserinfo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCustomerCommentcustomercomment_proIdcustomercomment_userIduserinfouserinfo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo/{userinfo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIduserinfouserinfo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomerCommentcustomercomment_proIdcustomercomment_userIduserinfouserinfo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/userinfo/{userinfo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomerCommentcustomercomment_proIdcustomercomment_userIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomerCommentcustomercomment_proIdcustomercomment_userId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>CustomerCommentcustomercomment_proIdcustomercomment_userId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCustomerCommentcustomercomment_proIdcustomercomment_userId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/CustomerComment/{customercomment_proId}/{customercomment_userId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentRestController controller = (CustomerCommentRestController) context.getBean("CustomerCommentRestController");

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