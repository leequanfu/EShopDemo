package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.Order;
import com.lqf.eshopdemo.domain.Userinfo;

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
public class UserinfoServiceTest {

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
	protected UserinfoService service;

	/**
	 * Instantiates a new UserinfoServiceTest.
	 *
	 */
	public UserinfoServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Order entity
	 * 
	 */
	@Test
	public void saveUserinfoOrders() {
		// TODO: JUnit - Populate test inputs for operation: saveUserinfoOrders 
		Integer id = 0;
		Order related_orders = new com.lqf.eshopdemo.domain.Order();
		Userinfo response = null;
		response = service.saveUserinfoOrders(id, related_orders);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserinfoOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Userinfo entity
	 * 
	 */
	@Test
	public void deleteUserinfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserinfo 
		Userinfo userinfo = new com.lqf.eshopdemo.domain.Userinfo();
		service.deleteUserinfo(userinfo);
	}

	/**
	 * Operation Unit Test
	 * Return all Userinfo entity
	 * 
	 */
	@Test
	public void findAllUserinfos() {
		// TODO: JUnit - Populate test inputs for operation: findAllUserinfos 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Userinfo> response = null;
		response = service.findAllUserinfos(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUserinfos
	}

	/**
	 * Operation Unit Test
	 * Save an existing Userinfo entity
	 * 
	 */
	@Test
	public void saveUserinfo() {
		// TODO: JUnit - Populate test inputs for operation: saveUserinfo 
		Userinfo userinfo_1 = new com.lqf.eshopdemo.domain.Userinfo();
		service.saveUserinfo(userinfo_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUserinfoByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUserinfoByPrimaryKey 
		Integer id_1 = 0;
		Userinfo response = null;
		response = service.findUserinfoByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findUserinfoByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@Test
	public void deleteUserinfoCustomerComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserinfoCustomerComments 
		Integer userinfo_id = 0;
		Integer related_customercomments_proId = 0;
		Integer related_customercomments_userId = 0;
		Userinfo response = null;
		response = service.deleteUserinfoCustomerComments(userinfo_id, related_customercomments_proId, related_customercomments_userId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserinfoCustomerComments
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerComment entity
	 * 
	 */
	@Test
	public void saveUserinfoCustomerComments() {
		// TODO: JUnit - Populate test inputs for operation: saveUserinfoCustomerComments 
		Integer id_2 = 0;
		CustomerComment related_customercomments = new com.lqf.eshopdemo.domain.CustomerComment();
		Userinfo response = null;
		response = service.saveUserinfoCustomerComments(id_2, related_customercomments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserinfoCustomerComments
	}

	/**
	 * Operation Unit Test
	 * Load an existing Userinfo entity
	 * 
	 */
	@Test
	public void loadUserinfos() {
		Set<Userinfo> response = null;
		response = service.loadUserinfos();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUserinfos
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Userinfo entity
	 * 
	 */
	@Test
	public void countUserinfos() {
		Integer response = null;
		response = service.countUserinfos();
		// TODO: JUnit - Add assertions to test outputs of operation: countUserinfos
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Order entity
	 * 
	 */
	@Test
	public void deleteUserinfoOrders() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserinfoOrders 
		Integer userinfo_id_1 = 0;
		Integer related_orders_id = 0;
		Userinfo response = null;
		response = service.deleteUserinfoOrders(userinfo_id_1, related_orders_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserinfoOrders
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
