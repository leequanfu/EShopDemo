package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Payways;

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
public class PaywaysServiceTest {

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
	protected PaywaysService service;

	/**
	 * Instantiates a new PaywaysServiceTest.
	 *
	 */
	public PaywaysServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Payways entity
	 * 
	 */
	@Test
	public void savePayways() {
		// TODO: JUnit - Populate test inputs for operation: savePayways 
		Payways payways = new com.lqf.eshopdemo.domain.Payways();
		service.savePayways(payways);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Payways entity
	 * 
	 */
	@Test
	public void loadPaywayss() {
		Set<Payways> response = null;
		response = service.loadPaywayss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPaywayss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPaywaysByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPaywaysByPrimaryKey 
		String way = null;
		Payways response = null;
		response = service.findPaywaysByPrimaryKey(way);
		// TODO: JUnit - Add assertions to test outputs of operation: findPaywaysByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Payways entity
	 * 
	 */
	@Test
	public void deletePayways() {
		// TODO: JUnit - Populate test inputs for operation: deletePayways 
		Payways payways_1 = new com.lqf.eshopdemo.domain.Payways();
		service.deletePayways(payways_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Payways entity
	 * 
	 */
	@Test
	public void findAllPaywayss() {
		// TODO: JUnit - Populate test inputs for operation: findAllPaywayss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Payways> response = null;
		response = service.findAllPaywayss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPaywayss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Payways entity
	 * 
	 */
	@Test
	public void countPaywayss() {
		Integer response = null;
		response = service.countPaywayss();
		// TODO: JUnit - Add assertions to test outputs of operation: countPaywayss
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
