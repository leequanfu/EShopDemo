package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Offer;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
@Transactional
public class ProductOfferServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ProductOfferService service;

	/**
	 * Instantiates a new ProductOfferServiceTest.
	 *
	 */
	public ProductOfferServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Offer entity
	 * 
	 */
	@Test
	public void deleteProductOfferOffer() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductOfferOffer 
		Integer productoffer_proId = 0;
		Integer productoffer_offerId = 0;
		Integer related_offer_id = 0;
		ProductOffer response = null;
		response = service.deleteProductOfferOffer(productoffer_proId, productoffer_offerId, related_offer_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductOfferOffer
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductOfferByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductOfferByPrimaryKey 
		Integer proId = 0;
		Integer offerId = 0;
		ProductOffer response = null;
		response = service.findProductOfferByPrimaryKey(proId, offerId);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductOfferByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductOffer entity
	 * 
	 */
	@Test
	public void loadProductOffers() {
		Set<ProductOffer> response = null;
		response = service.loadProductOffers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductOffers
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Test
	public void saveProductOfferProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: saveProductOfferProductDetail 
		Integer proId_1 = 0;
		Integer offerId_1 = 0;
		ProductDetail related_productdetail = new com.lqf.eshopdemo.domain.ProductDetail();
		ProductOffer response = null;
		response = service.saveProductOfferProductDetail(proId_1, offerId_1, related_productdetail);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductOfferProductDetail
	}

	/**
	 * Operation Unit Test
	 * Save an existing Offer entity
	 * 
	 */
	@Test
	public void saveProductOfferOffer() {
		// TODO: JUnit - Populate test inputs for operation: saveProductOfferOffer 
		Integer proId_2 = 0;
		Integer offerId_2 = 0;
		Offer related_offer = new com.lqf.eshopdemo.domain.Offer();
		ProductOffer response = null;
		response = service.saveProductOfferOffer(proId_2, offerId_2, related_offer);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductOfferOffer
	}

	/**
	 * Operation Unit Test
	 * Return all ProductOffer entity
	 * 
	 */
	@Test
	public void findAllProductOffers() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductOffers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductOffer> response = null;
		response = service.findAllProductOffers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductOffers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Test
	public void deleteProductOfferProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductOfferProductDetail 
		Integer productoffer_proId_1 = 0;
		Integer productoffer_offerId_1 = 0;
		Integer related_productdetail_id = 0;
		ProductOffer response = null;
		response = service.deleteProductOfferProductDetail(productoffer_proId_1, productoffer_offerId_1, related_productdetail_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductOfferProductDetail
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@Test
	public void deleteProductOffer() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductOffer 
		ProductOffer productoffer = new com.lqf.eshopdemo.domain.ProductOffer();
		service.deleteProductOffer(productoffer);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductOffer entity
	 * 
	 */
	@Test
	public void countProductOffers() {
		Integer response = null;
		response = service.countProductOffers();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductOffers
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductOffer entity
	 * 
	 */
	@Test
	public void saveProductOffer() {
		// TODO: JUnit - Populate test inputs for operation: saveProductOffer 
		ProductOffer productoffer_1 = new com.lqf.eshopdemo.domain.ProductOffer();
		service.saveProductOffer(productoffer_1);
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
