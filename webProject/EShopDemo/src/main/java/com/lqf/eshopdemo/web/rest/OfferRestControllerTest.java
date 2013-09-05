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
 * Unit test for the <code>OfferRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.OfferRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class OfferRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Offeroffer_idproductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOfferoffer_idproductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}/productOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offeroffer_idproductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOfferoffer_idproductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}/productOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offeroffer_idproductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOfferoffer_idproductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}/productOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offeroffer_idproductOffersproductoffer_proIdproductoffer_offerId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOfferoffer_idproductOffersproductoffer_proIdproductoffer_offerId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}/productOffers/{productoffer_proId}/{productoffer_offerId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offeroffer_idproductOffersproductoffer_proIdproductoffer_offerId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOfferoffer_idproductOffersproductoffer_proIdproductoffer_offerId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}/productOffers/{productoffer_proId}/{productoffer_offerId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offeroffer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOfferoffer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Offeroffer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOfferoffer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Offer/{offer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferRestController controller = (OfferRestController) context.getBean("OfferRestController");

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