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
 * Unit test for the <code>CatalogRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.CatalogRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class CatalogRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Catalogcatalog_idproductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCatalogcatalog_idproductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}/productCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalogcatalog_idproductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCatalogcatalog_idproductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}/productCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalogcatalog_idproductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCatalogcatalog_idproductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}/productCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalogcatalog_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCatalogcatalog_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalogcatalog_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCatalogcatalog_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalogcatalog_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCatalogcatalog_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Catalogcatalog_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCatalogcatalog_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Catalog/{catalog_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogRestController controller = (CatalogRestController) context.getBean("CatalogRestController");

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