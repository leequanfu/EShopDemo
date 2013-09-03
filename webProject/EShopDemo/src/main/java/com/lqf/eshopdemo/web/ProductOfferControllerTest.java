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
 * Unit test for the <code>ProductOfferController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.ProductOfferController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class ProductOfferControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductOfferOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductOfferOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductOfferOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductOfferProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductOfferProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductOfferProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productofferControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductofferControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productofferController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferController controller = (ProductOfferController) context.getBean("ProductOfferController");

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