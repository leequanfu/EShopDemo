package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;

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
public class ProductCatalogServiceTest {

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
	protected ProductCatalogService service;

	/**
	 * Instantiates a new ProductCatalogServiceTest.
	 *
	 */
	public ProductCatalogServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all ProductCatalog entity
	 * 
	 */
	@Test
	public void findAllProductCatalogs() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductCatalogs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductCatalog> response = null;
		response = service.findAllProductCatalogs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductCatalogs
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Test
	public void saveProductCatalogProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: saveProductCatalogProductDetail 
		Integer productId = 0;
		Integer catalogId = 0;
		ProductDetail related_productdetail = new com.lqf.eshopdemo.domain.ProductDetail();
		ProductCatalog response = null;
		response = service.saveProductCatalogProductDetail(productId, catalogId, related_productdetail);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductCatalogProductDetail
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Test
	public void deleteProductCatalogProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductCatalogProductDetail 
		Integer productcatalog_productId = 0;
		Integer productcatalog_catalogId = 0;
		Integer related_productdetail_id = 0;
		ProductCatalog response = null;
		response = service.deleteProductCatalogProductDetail(productcatalog_productId, productcatalog_catalogId, related_productdetail_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductCatalogProductDetail
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void deleteProductCatalog() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductCatalog 
		ProductCatalog productcatalog = new com.lqf.eshopdemo.domain.ProductCatalog();
		service.deleteProductCatalog(productcatalog);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Catalog entity
	 * 
	 */
	@Test
	public void deleteProductCatalogCatalog() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductCatalogCatalog 
		Integer productcatalog_productId_1 = 0;
		Integer productcatalog_catalogId_1 = 0;
		Integer related_catalog_id = 0;
		ProductCatalog response = null;
		response = service.deleteProductCatalogCatalog(productcatalog_productId_1, productcatalog_catalogId_1, related_catalog_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductCatalogCatalog
	}

	/**
	 * Operation Unit Test
	 * Save an existing Catalog entity
	 * 
	 */
	@Test
	public void saveProductCatalogCatalog() {
		// TODO: JUnit - Populate test inputs for operation: saveProductCatalogCatalog 
		Integer productId_1 = 0;
		Integer catalogId_1 = 0;
		Catalog related_catalog = new com.lqf.eshopdemo.domain.Catalog();
		ProductCatalog response = null;
		response = service.saveProductCatalogCatalog(productId_1, catalogId_1, related_catalog);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductCatalogCatalog
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void loadProductCatalogs() {
		Set<ProductCatalog> response = null;
		response = service.loadProductCatalogs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductCatalogs
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductCatalog entity
	 * 
	 */
	@Test
	public void countProductCatalogs() {
		Integer response = null;
		response = service.countProductCatalogs();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductCatalogs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductCatalogByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductCatalogByPrimaryKey 
		Integer productId_2 = 0;
		Integer catalogId_2 = 0;
		ProductCatalog response = null;
		response = service.findProductCatalogByPrimaryKey(productId_2, catalogId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductCatalogByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void saveProductCatalog() {
		// TODO: JUnit - Populate test inputs for operation: saveProductCatalog 
		ProductCatalog productcatalog_1 = new com.lqf.eshopdemo.domain.ProductCatalog();
		service.saveProductCatalog(productcatalog_1);
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
