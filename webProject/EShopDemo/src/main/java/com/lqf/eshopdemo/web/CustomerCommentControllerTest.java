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
 * Unit test for the <code>CustomerCommentController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.CustomerCommentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class CustomerCommentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerCommentUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerCommentUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerCommentUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerCommentProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerCommentProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerCommentProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>customercommentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcustomercommentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/customercommentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerCommentController controller = (CustomerCommentController) context.getBean("CustomerCommentController");

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