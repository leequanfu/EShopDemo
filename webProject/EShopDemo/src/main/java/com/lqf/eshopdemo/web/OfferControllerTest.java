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
 * Unit test for the <code>OfferController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.OfferController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class OfferControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOfferProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOfferProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOfferProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOffer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOffer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOffer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>offerControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetofferControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/offerController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OfferController controller = (OfferController) context.getBean("OfferController");

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