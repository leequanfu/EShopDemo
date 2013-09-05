package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;
import com.lqf.eshopdemo.domain.ProductProperty;

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
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
@Transactional
public class ProductDetailServiceTest {

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
	protected ProductDetailService service;

	/**
	 * Instantiates a new ProductDetailServiceTest.
	 *
	 */
	public ProductDetailServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@Test
	public void deleteProductDetailProductOffers() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductDetailProductOffers 
		Integer productdetail_id = 0;
		Integer related_productoffers_proId = 0;
		Integer related_productoffers_offerId = 0;
		ProductDetail response = null;
		response = service.deleteProductDetailProductOffers(productdetail_id, related_productoffers_proId, related_productoffers_offerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductDetailProductOffers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductDetailByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductDetailByPrimaryKey 
		Integer id = 0;
		ProductDetail response = null;
		response = service.findProductDetailByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductDetailByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Test
	public void saveProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: saveProductDetail 
		ProductDetail productdetail = new com.lqf.eshopdemo.domain.ProductDetail();
		service.saveProductDetail(productdetail);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Test
	public void deleteProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductDetail 
		ProductDetail productdetail_1 = new com.lqf.eshopdemo.domain.ProductDetail();
		service.deleteProductDetail(productdetail_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductDetail entity
	 * 
	 */
	@Test
	public void loadProductDetails() {
		Set<ProductDetail> response = null;
		response = service.loadProductDetails();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductDetails
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderItems entity
	 * 
	 */
	@Test
	public void saveProductDetailOrderItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveProductDetailOrderItemses 
		Integer id_1 = 0;
		OrderItems related_orderitemses = new com.lqf.eshopdemo.domain.OrderItems();
		ProductDetail response = null;
		response = service.saveProductDetailOrderItemses(id_1, related_orderitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductDetailOrderItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductOffer entity
	 * 
	 */
	@Test
	public void saveProductDetailProductOffers() {
		// TODO: JUnit - Populate test inputs for operation: saveProductDetailProductOffers 
		Integer id_2 = 0;
		ProductOffer related_productoffers = new com.lqf.eshopdemo.domain.ProductOffer();
		ProductDetail response = null;
		response = service.saveProductDetailProductOffers(id_2, related_productoffers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductDetailProductOffers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@Test
	public void deleteProductDetailCustomerComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductDetailCustomerComments 
		Integer productdetail_id_1 = 0;
		Integer related_customercomments_proId = 0;
		Integer related_customercomments_userId = 0;
		ProductDetail response = null;
		response = service.deleteProductDetailCustomerComments(productdetail_id_1, related_customercomments_proId, related_customercomments_userId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductDetailCustomerComments
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@Test
	public void deleteProductDetailProductProperties() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductDetailProductProperties 
		Integer productdetail_id_2 = 0;
		Integer related_productproperties_proId = 0;
		String related_productproperties_key = null;
		ProductDetail response = null;
		response = service.deleteProductDetailProductProperties(productdetail_id_2, related_productproperties_proId, related_productproperties_key);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductDetailProductProperties
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductDetail entity
	 * 
	 */
	@Test
	public void countProductDetails() {
		Integer response = null;
		response = service.countProductDetails();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductDetails
	}

	/**
	 * Operation Unit Test
	 * Return all ProductDetail entity
	 * 
	 */
	@Test
	public void findAllProductDetails() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductDetails 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductDetail> response = null;
		response = service.findAllProductDetails(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductDetails
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void saveProductDetailProductCatalogs() {
		// TODO: JUnit - Populate test inputs for operation: saveProductDetailProductCatalogs 
		Integer id_3 = 0;
		ProductCatalog related_productcatalogs = new com.lqf.eshopdemo.domain.ProductCatalog();
		ProductDetail response = null;
		response = service.saveProductDetailProductCatalogs(id_3, related_productcatalogs);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductDetailProductCatalogs
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerComment entity
	 * 
	 */
	@Test
	public void saveProductDetailCustomerComments() {
		// TODO: JUnit - Populate test inputs for operation: saveProductDetailCustomerComments 
		Integer id_4 = 0;
		CustomerComment related_customercomments = new com.lqf.eshopdemo.domain.CustomerComment();
		ProductDetail response = null;
		response = service.saveProductDetailCustomerComments(id_4, related_customercomments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductDetailCustomerComments
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderItems entity
	 * 
	 */
	@Test
	public void deleteProductDetailOrderItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductDetailOrderItemses 
		Integer productdetail_id_3 = 0;
		Integer related_orderitemses_orderId = 0;
		Integer related_orderitemses_productId = 0;
		ProductDetail response = null;
		response = service.deleteProductDetailOrderItemses(productdetail_id_3, related_orderitemses_orderId, related_orderitemses_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductDetailOrderItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductProperty entity
	 * 
	 */
	@Test
	public void saveProductDetailProductProperties() {
		// TODO: JUnit - Populate test inputs for operation: saveProductDetailProductProperties 
		Integer id_5 = 0;
		ProductProperty related_productproperties = new com.lqf.eshopdemo.domain.ProductProperty();
		ProductDetail response = null;
		response = service.saveProductDetailProductProperties(id_5, related_productproperties);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductDetailProductProperties
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void deleteProductDetailProductCatalogs() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductDetailProductCatalogs 
		Integer productdetail_id_4 = 0;
		Integer related_productcatalogs_productId = 0;
		Integer related_productcatalogs_catalogId = 0;
		ProductDetail response = null;
		response = service.deleteProductDetailProductCatalogs(productdetail_id_4, related_productcatalogs_productId, related_productcatalogs_catalogId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductDetailProductCatalogs
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
