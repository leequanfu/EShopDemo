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
 * Unit test for the <code>ProductPropertyController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.ProductPropertyController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class ProductPropertyControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductPropertyProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductPropertyProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductPropertyProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productpropertyControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductpropertyControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productpropertyController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyController controller = (ProductPropertyController) context.getBean("ProductPropertyController");

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