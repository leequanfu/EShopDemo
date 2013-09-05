package com.lqf.eshopdemo.web.rest;

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
 * Unit test for the <code>ProductDetailRestController</code> controller.
 *
 * @see com.lqf.eshopdemo.web.rest.ProductDetailRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/t11-security-context.xml",
		"file:./resources/t11-service-context.xml",
		"file:./resources/t11-dao-context.xml",
		"file:./resources/t11-web-context.xml" })
public class ProductDetailRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>ProductDetailproductdetail_idproductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idproductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductDetailproductdetail_idproductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductCatalogs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductDetailproductdetail_idproductCatalogs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productCatalogs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductDetailproductdetail_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idproductCatalogsproductcatalog_productIdproductcatalog_catalogId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productCatalogs/{productcatalog_productId}/{productcatalog_catalogId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idorderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idorderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/orderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idorderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductDetailproductdetail_idorderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/orderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idorderItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductDetailproductdetail_idorderItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/orderItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idorderItemsesorderitems_orderIdorderitems_productId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductDetailproductdetail_idorderItemsesorderitems_orderIdorderitems_productId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idorderItemsesorderitems_orderIdorderitems_productId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idorderItemsesorderitems_orderIdorderitems_productId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/orderItemses/{orderitems_orderId}/{orderitems_productId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idproductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductDetailproductdetail_idproductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductOffers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductDetailproductdetail_idproductOffers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productOffers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductOffersproductoffer_proIdproductoffer_offerId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductDetailproductdetail_idproductOffersproductoffer_proIdproductoffer_offerId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productOffers/{productoffer_proId}/{productoffer_offerId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductOffersproductoffer_proIdproductoffer_offerId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idproductOffersproductoffer_proIdproductoffer_offerId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productOffers/{productoffer_proId}/{productoffer_offerId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idcustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idcustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/customerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idcustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductDetailproductdetail_idcustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/customerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idcustomerComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductDetailproductdetail_idcustomerComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/customerComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idcustomerCommentscustomercomment_proIdcustomercomment_userId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductDetailproductdetail_idcustomerCommentscustomercomment_proIdcustomercomment_userId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/customerComments/{customercomment_proId}/{customercomment_userId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idcustomerCommentscustomercomment_proIdcustomercomment_userId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idcustomerCommentscustomercomment_proIdcustomercomment_userId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/customerComments/{customercomment_proId}/{customercomment_userId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idproductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductDetailproductdetail_idproductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductProperties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductDetailproductdetail_idproductProperties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productProperties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductPropertiesproductproperty_proIdproductproperty_key()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductDetailproductdetail_idproductPropertiesproductproperty_proIdproductproperty_key() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productProperties/{productproperty_proId}/{productproperty_key}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_idproductPropertiesproductproperty_proIdproductproperty_key()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_idproductPropertiesproductproperty_proIdproductproperty_key() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}/productProperties/{productproperty_proId}/{productproperty_key}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetail()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductDetail() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProductDetailproductdetail_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductDetailproductdetail_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProductDetail/{productdetail_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductDetailRestController controller = (ProductDetailRestController) context.getBean("ProductDetailRestController");

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