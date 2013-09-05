package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.ProductDetail;
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
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
@Transactional
public class CustomerCommentServiceTest {

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
	protected CustomerCommentService service;

	/**
	 * Instantiates a new CustomerCommentServiceTest.
	 *
	 */
	public CustomerCommentServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Userinfo entity
	 * 
	 */
	@Test
	public void deleteCustomerCommentUserinfo() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerCommentUserinfo 
		Integer customercomment_proId = 0;
		Integer customercomment_userId = 0;
		Integer related_userinfo_id = 0;
		CustomerComment response = null;
		response = service.deleteCustomerCommentUserinfo(customercomment_proId, customercomment_userId, related_userinfo_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerCommentUserinfo
	}

	/**
	 * Operation Unit Test
	 * Load an existing CustomerComment entity
	 * 
	 */
	@Test
	public void loadCustomerComments() {
		Set<CustomerComment> response = null;
		response = service.loadCustomerComments();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCustomerComments
	}

	/**
	 * Operation Unit Test
	 * Save an existing Userinfo entity
	 * 
	 */
	@Test
	public void saveCustomerCommentUserinfo() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerCommentUserinfo 
		Integer proId = 0;
		Integer userId = 0;
		Userinfo related_userinfo = new com.lqf.eshopdemo.domain.Userinfo();
		CustomerComment response = null;
		response = service.saveCustomerCommentUserinfo(proId, userId, related_userinfo);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerCommentUserinfo
	}

	/**
	 * Operation Unit Test
	 * Return a count of all CustomerComment entity
	 * 
	 */
	@Test
	public void countCustomerComments() {
		Integer response = null;
		response = service.countCustomerComments();
		// TODO: JUnit - Add assertions to test outputs of operation: countCustomerComments
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCustomerCommentByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCustomerCommentByPrimaryKey 
		Integer proId_1 = 0;
		Integer userId_1 = 0;
		CustomerComment response = null;
		response = service.findCustomerCommentByPrimaryKey(proId_1, userId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findCustomerCommentByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerComment entity
	 * 
	 */
	@Test
	public void saveCustomerComment() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerComment 
		CustomerComment customercomment = new com.lqf.eshopdemo.domain.CustomerComment();
		service.saveCustomerComment(customercomment);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Test
	public void deleteCustomerCommentProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerCommentProductDetail 
		Integer customercomment_proId_1 = 0;
		Integer customercomment_userId_1 = 0;
		Integer related_productdetail_id = 0;
		CustomerComment response = null;
		response = service.deleteCustomerCommentProductDetail(customercomment_proId_1, customercomment_userId_1, related_productdetail_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerCommentProductDetail
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Test
	public void saveCustomerCommentProductDetail() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerCommentProductDetail 
		Integer proId_2 = 0;
		Integer userId_2 = 0;
		ProductDetail related_productdetail = new com.lqf.eshopdemo.domain.ProductDetail();
		CustomerComment response = null;
		response = service.saveCustomerCommentProductDetail(proId_2, userId_2, related_productdetail);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerCommentProductDetail
	}

	/**
	 * Operation Unit Test
	 * Return all CustomerComment entity
	 * 
	 */
	@Test
	public void findAllCustomerComments() {
		// TODO: JUnit - Populate test inputs for operation: findAllCustomerComments 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CustomerComment> response = null;
		response = service.findAllCustomerComments(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCustomerComments
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@Test
	public void deleteCustomerComment() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerComment 
		CustomerComment customercomment_1 = new com.lqf.eshopdemo.domain.CustomerComment();
		service.deleteCustomerComment(customercomment_1);
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
