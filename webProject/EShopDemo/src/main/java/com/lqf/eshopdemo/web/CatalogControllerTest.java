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
 * Unit test for the <code>CatalogController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.CatalogController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class CatalogControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCatalogProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCatalogProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCatalogProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>catalogControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcatalogControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/catalogController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CatalogController controller = (CatalogController) context.getBean("CatalogController");

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