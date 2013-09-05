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
 * Unit test for the <code>ProductCatalogRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.ProductCatalogRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class ProductCatalogRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalogcatalog_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalogcatalog_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog/{catalog_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalogcatalog_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductCatalogproductcatalog_productIdproductcatalog_catalogIdcatalogcatalog_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/catalog/{catalog_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductCatalogproductcatalog_productIdproductcatalog_catalogIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductCatalogproductcatalog_productIdproductcatalog_catalogId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductCatalogproductcatalog_productIdproductcatalog_catalogId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductCatalogproductcatalog_productIdproductcatalog_catalogId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductCatalog/{productcatalog_productId}/{productcatalog_catalogId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogRestController controller = (ProductCatalogRestController) context.getBean("ProductCatalogRestController");

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