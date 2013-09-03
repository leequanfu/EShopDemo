package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;

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
public class CatalogServiceTest {

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
	protected CatalogService service;

	/**
	 * Instantiates a new CatalogServiceTest.
	 *
	 */
	public CatalogServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Catalog entity
	 * 
	 */
	@Test
	public void loadCatalogs() {
		Set<Catalog> response = null;
		response = service.loadCatalogs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCatalogs
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Catalog entity
	 * 
	 */
	@Test
	public void deleteCatalog() {
		// TODO: JUnit - Populate test inputs for operation: deleteCatalog 
		Catalog catalog = new com.lqf.eshopdemo.domain.Catalog();
		service.deleteCatalog(catalog);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void deleteCatalogProductCatalogs() {
		// TODO: JUnit - Populate test inputs for operation: deleteCatalogProductCatalogs 
		Integer catalog_id = 0;
		Integer related_productcatalogs_productId = 0;
		Integer related_productcatalogs_catalogId = 0;
		Catalog response = null;
		response = service.deleteCatalogProductCatalogs(catalog_id, related_productcatalogs_productId, related_productcatalogs_catalogId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCatalogProductCatalogs
	}

	/**
	 * Operation Unit Test
	 * Save an existing Catalog entity
	 * 
	 */
	@Test
	public void saveCatalog() {
		// TODO: JUnit - Populate test inputs for operation: saveCatalog 
		Catalog catalog_1 = new com.lqf.eshopdemo.domain.Catalog();
		service.saveCatalog(catalog_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Catalog entity
	 * 
	 */
	@Test
	public void findAllCatalogs() {
		// TODO: JUnit - Populate test inputs for operation: findAllCatalogs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Catalog> response = null;
		response = service.findAllCatalogs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCatalogs
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@Test
	public void saveCatalogProductCatalogs() {
		// TODO: JUnit - Populate test inputs for operation: saveCatalogProductCatalogs 
		Integer id = 0;
		ProductCatalog related_productcatalogs = new com.lqf.eshopdemo.domain.ProductCatalog();
		Catalog response = null;
		response = service.saveCatalogProductCatalogs(id, related_productcatalogs);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCatalogProductCatalogs
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Catalog entity
	 * 
	 */
	@Test
	public void countCatalogs() {
		Integer response = null;
		response = service.countCatalogs();
		// TODO: JUnit - Add assertions to test outputs of operation: countCatalogs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCatalogByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCatalogByPrimaryKey 
		Integer id_1 = 0;
		Catalog response = null;
		response = service.findCatalogByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findCatalogByPrimaryKey
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
