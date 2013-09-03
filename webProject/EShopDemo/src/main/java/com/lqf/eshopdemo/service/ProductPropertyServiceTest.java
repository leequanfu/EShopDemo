package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.ProductDetail;
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
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
@Transactional
public class ProductPropertyServiceTest {

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
	protected ProductPropertyService service;

	/**
	 * Instantiates a new ProductPropertyServiceTest.
	 *
	 */
	public ProductPropertyServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductPropertyByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductPropertyByPrimaryKey 
		Integer proId = 0;
		String key = null;
		ProductProperty response = null;
		response = service.findProductPropertyByPrimaryKey(proId, key);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductPropertyByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductProperty entity
	 * 
	 */
	@Test
	public void countProductPropertys() {
		Integer response = null;
		response = service.countProductPropertys();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductPropertys
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Test
	public void saveProductPropertyProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: saveProductPropertyProductDetail 
		Integer proId_1 = 0;
		String key_1 = null;
		ProductDetail related_productdetail = new com.lqf.eshopdemo.domain.ProductDetail();
		ProductProperty response = null;
		response = service.saveProductPropertyProductDetail(proId_1, key_1, related_productdetail);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductPropertyProductDetail
	}

	/**
	 * Operation Unit Test
	 * Return all ProductProperty entity
	 * 
	 */
	@Test
	public void findAllProductPropertys() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductPropertys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductProperty> response = null;
		response = service.findAllProductPropertys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductPropertys
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductProperty entity
	 * 
	 */
	@Test
	public void saveProductProperty() {
		// TODO: JUnit - Populate test inputs for operation: saveProductProperty 
		ProductProperty productproperty = new com.lqf.eshopdemo.domain.ProductProperty();
		service.saveProductProperty(productproperty);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Test
	public void deleteProductPropertyProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductPropertyProductDetail 
		Integer productproperty_proId = 0;
		String productproperty_key = null;
		Integer related_productdetail_id = 0;
		ProductProperty response = null;
		response = service.deleteProductPropertyProductDetail(productproperty_proId, productproperty_key, related_productdetail_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductPropertyProductDetail
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductProperty entity
	 * 
	 */
	@Test
	public void loadProductPropertys() {
		Set<ProductProperty> response = null;
		response = service.loadProductPropertys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductPropertys
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@Test
	public void deleteProductProperty() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductProperty 
		ProductProperty productproperty_1 = new com.lqf.eshopdemo.domain.ProductProperty();
		service.deleteProductProperty(productproperty_1);
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
