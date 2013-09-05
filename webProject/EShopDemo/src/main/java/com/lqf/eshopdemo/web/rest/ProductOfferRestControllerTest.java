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
 * Unit test for the <code>ProductOfferRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.ProductOfferRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class ProductOfferRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdoffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductOfferproductoffer_proIdproductoffer_offerIdoffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdoffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductOfferproductoffer_proIdproductoffer_offerIdoffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdoffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductOfferproductoffer_proIdproductoffer_offerIdoffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdofferoffer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductOfferproductoffer_proIdproductoffer_offerIdofferoffer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer/{offer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdofferoffer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductOfferproductoffer_proIdproductoffer_offerIdofferoffer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/offer/{offer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductOfferproductoffer_proIdproductoffer_offerIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductOfferproductoffer_proIdproductoffer_offerIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdproductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductOfferproductoffer_proIdproductoffer_offerIdproductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductOfferproductoffer_proIdproductoffer_offerIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerIdproductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductOfferproductoffer_proIdproductoffer_offerIdproductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}/productDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductOfferproductoffer_proIdproductoffer_offerId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductOfferproductoffer_proIdproductoffer_offerId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductOfferproductoffer_proIdproductoffer_offerId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductOffer/{productoffer_proId}/{productoffer_offerId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductOfferRestController controller = (ProductOfferRestController) context.getBean("ProductOfferRestController");

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