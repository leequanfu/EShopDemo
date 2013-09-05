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
 * Unit test for the <code>ProductPropertyRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.ProductPropertyRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class ProductPropertyRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_keyproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductPropertyproductproperty_proIdproductproperty_keyproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_keyproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductPropertyproductproperty_proIdproductproperty_keyproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_keyproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductPropertyproductproperty_proIdproductproperty_keyproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_keyproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductPropertyproductproperty_proIdproductproperty_keyproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_keyproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductPropertyproductproperty_proIdproductproperty_keyproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_key()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductPropertyproductproperty_proIdproductproperty_key() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductProperty()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductProperty() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductPropertyproductproperty_proIdproductproperty_key()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductPropertyproductproperty_proIdproductproperty_key() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductProperty/{productproperty_proId}/{productproperty_key}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductPropertyRestController controller = (ProductPropertyRestController) context.getBean("ProductPropertyRestController");

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