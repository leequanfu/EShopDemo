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
 * Unit test for the <code>ProductCatalogController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.ProductCatalogController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class ProductCatalogControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductCatalogCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductCatalogCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductCatalogCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductCatalogProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductCatalogProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductCatalogProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductCatalog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductCatalog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductCatalog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productcatalogControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductcatalogControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productcatalogController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductCatalogController controller = (ProductCatalogController) context.getBean("ProductCatalogController");

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