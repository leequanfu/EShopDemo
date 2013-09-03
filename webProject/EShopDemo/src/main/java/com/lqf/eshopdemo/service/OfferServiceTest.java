package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Offer;
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
public class OfferServiceTest {

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
	protected OfferService service;

	/**
	 * Instantiates a new OfferServiceTest.
	 *
	 */
	public OfferServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOfferByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOfferByPrimaryKey 
		Integer id = 0;
		Offer response = null;
		response = service.findOfferByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findOfferByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Offer entity
	 * 
	 */
	@Test
	public void loadOffers() {
		Set<Offer> response = null;
		response = service.loadOffers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOffers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Offer entity
	 * 
	 */
	@Test
	public void deleteOffer() {
		// TODO: JUnit - Populate test inputs for operation: deleteOffer 
		Offer offer = new com.lqf.eshopdemo.domain.Offer();
		service.deleteOffer(offer);
	}

	/**
	 * Operation Unit Test
	 * Return all Offer entity
	 * 
	 */
	@Test
	public void findAllOffers() {
		// TODO: JUnit - Populate test inputs for operation: findAllOffers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Offer> response = null;
		response = service.findAllOffers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOffers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@Test
	public void deleteOfferProductOffers() {
		// TODO: JUnit - Populate test inputs for operation: deleteOfferProductOffers 
		Integer offer_id = 0;
		Integer related_productoffers_proId = 0;
		Integer related_productoffers_offerId = 0;
		Offer response = null;
		response = service.deleteOfferProductOffers(offer_id, related_productoffers_proId, related_productoffers_offerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOfferProductOffers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Offer entity
	 * 
	 */
	@Test
	public void saveOffer() {
		// TODO: JUnit - Populate test inputs for operation: saveOffer 
		Offer offer_1 = new com.lqf.eshopdemo.domain.Offer();
		service.saveOffer(offer_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Offer entity
	 * 
	 */
	@Test
	public void countOffers() {
		Integer response = null;
		response = service.countOffers();
		// TODO: JUnit - Add assertions to test outputs of operation: countOffers
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductOffer entity
	 * 
	 */
	@Test
	public void saveOfferProductOffers() {
		// TODO: JUnit - Populate test inputs for operation: saveOfferProductOffers 
		Integer id_1 = 0;
		ProductOffer related_productoffers = new com.lqf.eshopdemo.domain.ProductOffer();
		Offer response = null;
		response = service.saveOfferProductOffers(id_1, related_productoffers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOfferProductOffers
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
