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
 * Unit test for the <code>UserinfoController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.UserinfoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class UserinfoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserinfoCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserinfoCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserinfoCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserinfoOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserinfoOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserinfoOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>userinfoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetuserinfoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/userinfoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserinfoController controller = (UserinfoController) context.getBean("UserinfoController");

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