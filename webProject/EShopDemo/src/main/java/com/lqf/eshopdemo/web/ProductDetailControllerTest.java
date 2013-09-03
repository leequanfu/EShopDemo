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
 * Unit test for the <code>ProductDetailController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.ProductDetailController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/EShopDemo-security-context.xml",
		"file:./src/main/resources/EShopDemo-service-context.xml",
		"file:./src/main/resources/EShopDemo-dao-context.xml",
		"file:./src/main/resources/EShopDemo-web-context.xml" })
public class ProductDetailControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductDetailProductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductDetailProductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductDetailProductCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductDetailOrderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductDetailOrderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductDetailOrderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductDetailProductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductDetailProductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductDetailProductOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductDetailCustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductDetailCustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductDetailCustomerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductDetailProductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductDetailProductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductDetailProductProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productdetailControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductdetailControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productdetailController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailController controller = (ProductDetailController) context.getBean("ProductDetailController");

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