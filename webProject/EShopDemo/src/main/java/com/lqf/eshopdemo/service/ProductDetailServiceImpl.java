package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.CustomerCommentDAO;
import com.lqf.eshopdemo.dao.OrderItemsDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductOfferDAO;
import com.lqf.eshopdemo.dao.ProductPropertyDAO;

import com.lqf.eshopdemo.domain.CustomerComment;
import com.lqf.eshopdemo.domain.OrderItems;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductOffer;
import com.lqf.eshopdemo.domain.ProductProperty;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductDetail entities
 * 
 */

@Service("ProductDetailService")
@Transactional
public class ProductDetailServiceImpl implements ProductDetailService {

	/**
	 * DAO injected by Spring that manages CustomerComment entities
	 * 
	 */
	@Autowired
	private CustomerCommentDAO customerCommentDAO;

	/**
	 * DAO injected by Spring that manages OrderItems entities
	 * 
	 */
	@Autowired
	private OrderItemsDAO orderItemsDAO;

	/**
	 * DAO injected by Spring that manages ProductCatalog entities
	 * 
	 */
	@Autowired
	private ProductCatalogDAO productCatalogDAO;

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * DAO injected by Spring that manages ProductOffer entities
	 * 
	 */
	@Autowired
	private ProductOfferDAO productOfferDAO;

	/**
	 * DAO injected by Spring that manages ProductProperty entities
	 * 
	 */
	@Autowired
	private ProductPropertyDAO productPropertyDAO;

	/**
	 * Instantiates a new ProductDetailServiceImpl.
	 *
	 */
	public ProductDetailServiceImpl() {
	}

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@Transactional
	public ProductDetail deleteProductDetailProductProperties(Integer productdetail_id, Integer related_productproperties_proId, String related_productproperties_key) {
		ProductProperty related_productproperties = productPropertyDAO.findProductPropertyByPrimaryKey(related_productproperties_proId, related_productproperties_key, -1, -1);

		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		related_productproperties.setProductDetail(null);
		productdetail.getProductProperties().remove(related_productproperties);

		productPropertyDAO.remove(related_productproperties);
		productPropertyDAO.flush();

		return productdetail;
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public ProductDetail deleteProductDetailProductCatalogs(Integer productdetail_id, Integer related_productcatalogs_productId, Integer related_productcatalogs_catalogId) {
		ProductCatalog related_productcatalogs = productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs_productId, related_productcatalogs_catalogId, -1, -1);

		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		related_productcatalogs.setProductDetail(null);
		productdetail.getProductCatalogs().remove(related_productcatalogs);

		productCatalogDAO.remove(related_productcatalogs);
		productCatalogDAO.flush();

		return productdetail;
	}

	/**
	 * Save an existing OrderItems entity
	 * 
	 */
	@Transactional
	public ProductDetail saveProductDetailOrderItemses(Integer id, OrderItems related_orderitemses) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(id, -1, -1);
		OrderItems existingorderItemses = orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses.getOrderId(), related_orderitemses.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingorderItemses != null) {
			existingorderItemses.setOrderId(related_orderitemses.getOrderId());
			existingorderItemses.setProductId(related_orderitemses.getProductId());
			existingorderItemses.setPrice(related_orderitemses.getPrice());
			existingorderItemses.setQuality(related_orderitemses.getQuality());
			related_orderitemses = existingorderItemses;
		} else {
			related_orderitemses = orderItemsDAO.store(related_orderitemses);
			orderItemsDAO.flush();
		}

		related_orderitemses.setProductDetail(productdetail);
		productdetail.getOrderItemses().add(related_orderitemses);
		related_orderitemses = orderItemsDAO.store(related_orderitemses);
		orderItemsDAO.flush();

		productdetail = productDetailDAO.store(productdetail);
		productDetailDAO.flush();

		return productdetail;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public void deleteProductDetail(ProductDetail productdetail) {
		productDetailDAO.remove(productdetail);
		productDetailDAO.flush();
	}

	/**
	 * Save an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public ProductDetail saveProductDetailProductOffers(Integer id, ProductOffer related_productoffers) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(id, -1, -1);
		ProductOffer existingproductOffers = productOfferDAO.findProductOfferByPrimaryKey(related_productoffers.getProId(), related_productoffers.getOfferId());

		// copy into the existing record to preserve existing relationships
		if (existingproductOffers != null) {
			existingproductOffers.setProId(related_productoffers.getProId());
			existingproductOffers.setOfferId(related_productoffers.getOfferId());
			related_productoffers = existingproductOffers;
		} else {
			related_productoffers = productOfferDAO.store(related_productoffers);
			productOfferDAO.flush();
		}

		related_productoffers.setProductDetail(productdetail);
		productdetail.getProductOffers().add(related_productoffers);
		related_productoffers = productOfferDAO.store(related_productoffers);
		productOfferDAO.flush();

		productdetail = productDetailDAO.store(productdetail);
		productDetailDAO.flush();

		return productdetail;
	}

	/**
	 * Load an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public Set<ProductDetail> loadProductDetails() {
		return productDetailDAO.findAllProductDetails();
	}

	/**
	 * Return a count of all ProductDetail entity
	 * 
	 */
	@Transactional
	public Integer countProductDetails() {
		return ((Long) productDetailDAO.createQuerySingleResult("select count(o) from ProductDetail o").getSingleResult()).intValue();
	}

	/**
	 * Return all ProductDetail entity
	 * 
	 */
	@Transactional
	public List<ProductDetail> findAllProductDetails(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductDetail>(productDetailDAO.findAllProductDetails(startResult, maxRows));
	}

	/**
	 * Delete an existing OrderItems entity
	 * 
	 */
	@Transactional
	public ProductDetail deleteProductDetailOrderItemses(Integer productdetail_id, Integer related_orderitemses_orderId, Integer related_orderitemses_productId) {
		OrderItems related_orderitemses = orderItemsDAO.findOrderItemsByPrimaryKey(related_orderitemses_orderId, related_orderitemses_productId, -1, -1);

		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		related_orderitemses.setProductDetail(null);
		productdetail.getOrderItemses().remove(related_orderitemses);

		orderItemsDAO.remove(related_orderitemses);
		orderItemsDAO.flush();

		return productdetail;
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public void saveProductDetail(ProductDetail productdetail) {
		ProductDetail existingProductDetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail.getId());

		if (existingProductDetail != null) {
			if (existingProductDetail != productdetail) {
				existingProductDetail.setId(productdetail.getId());
				existingProductDetail.setTitle(productdetail.getTitle());
				existingProductDetail.setPrice(productdetail.getPrice());
				existingProductDetail.setQuantity(productdetail.getQuantity());
				existingProductDetail.setDescription(productdetail.getDescription());
			}
			productdetail = productDetailDAO.store(existingProductDetail);
		} else {
			productdetail = productDetailDAO.store(productdetail);
		}
		productDetailDAO.flush();
	}

	/**
	 */
	@Transactional
	public ProductDetail findProductDetailByPrimaryKey(Integer id) {
		return productDetailDAO.findProductDetailByPrimaryKey(id);
	}

	/**
	 * Delete an existing ProductOffer entity
	 * 
	 */
	@Transactional
	public ProductDetail deleteProductDetailProductOffers(Integer productdetail_id, Integer related_productoffers_proId, Integer related_productoffers_offerId) {
		ProductOffer related_productoffers = productOfferDAO.findProductOfferByPrimaryKey(related_productoffers_proId, related_productoffers_offerId, -1, -1);

		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		related_productoffers.setProductDetail(null);
		productdetail.getProductOffers().remove(related_productoffers);

		productOfferDAO.remove(related_productoffers);
		productOfferDAO.flush();

		return productdetail;
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public ProductDetail saveProductDetailProductCatalogs(Integer id, ProductCatalog related_productcatalogs) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(id, -1, -1);
		ProductCatalog existingproductCatalogs = productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs.getProductId(), related_productcatalogs.getCatalogId());

		// copy into the existing record to preserve existing relationships
		if (existingproductCatalogs != null) {
			existingproductCatalogs.setProductId(related_productcatalogs.getProductId());
			existingproductCatalogs.setCatalogId(related_productcatalogs.getCatalogId());
			related_productcatalogs = existingproductCatalogs;
		} else {
			related_productcatalogs = productCatalogDAO.store(related_productcatalogs);
			productCatalogDAO.flush();
		}

		related_productcatalogs.setProductDetail(productdetail);
		productdetail.getProductCatalogs().add(related_productcatalogs);
		related_productcatalogs = productCatalogDAO.store(related_productcatalogs);
		productCatalogDAO.flush();

		productdetail = productDetailDAO.store(productdetail);
		productDetailDAO.flush();

		return productdetail;
	}

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	@Transactional
	public ProductDetail saveProductDetailProductProperties(Integer id, ProductProperty related_productproperties) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(id, -1, -1);
		ProductProperty existingproductProperties = productPropertyDAO.findProductPropertyByPrimaryKey(related_productproperties.getProId(), related_productproperties.getKey());

		// copy into the existing record to preserve existing relationships
		if (existingproductProperties != null) {
			existingproductProperties.setProId(related_productproperties.getProId());
			existingproductProperties.setKey(related_productproperties.getKey());
			existingproductProperties.setValue(related_productproperties.getValue());
			related_productproperties = existingproductProperties;
		} else {
			related_productproperties = productPropertyDAO.store(related_productproperties);
			productPropertyDAO.flush();
		}

		related_productproperties.setProductDetail(productdetail);
		productdetail.getProductProperties().add(related_productproperties);
		related_productproperties = productPropertyDAO.store(related_productproperties);
		productPropertyDAO.flush();

		productdetail = productDetailDAO.store(productdetail);
		productDetailDAO.flush();

		return productdetail;
	}

	/**
	 * Save an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public ProductDetail saveProductDetailCustomerComments(Integer id, CustomerComment related_customercomments) {
		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(id, -1, -1);
		CustomerComment existingcustomerComments = customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments.getProId(), related_customercomments.getUserId());

		// copy into the existing record to preserve existing relationships
		if (existingcustomerComments != null) {
			existingcustomerComments.setProId(related_customercomments.getProId());
			existingcustomerComments.setUserId(related_customercomments.getUserId());
			existingcustomerComments.setRate(related_customercomments.getRate());
			existingcustomerComments.setComment(related_customercomments.getComment());
			related_customercomments = existingcustomerComments;
		} else {
			related_customercomments = customerCommentDAO.store(related_customercomments);
			customerCommentDAO.flush();
		}

		related_customercomments.setProductDetail(productdetail);
		productdetail.getCustomerComments().add(related_customercomments);
		related_customercomments = customerCommentDAO.store(related_customercomments);
		customerCommentDAO.flush();

		productdetail = productDetailDAO.store(productdetail);
		productDetailDAO.flush();

		return productdetail;
	}

	/**
	 * Delete an existing CustomerComment entity
	 * 
	 */
	@Transactional
	public ProductDetail deleteProductDetailCustomerComments(Integer productdetail_id, Integer related_customercomments_proId, Integer related_customercomments_userId) {
		CustomerComment related_customercomments = customerCommentDAO.findCustomerCommentByPrimaryKey(related_customercomments_proId, related_customercomments_userId, -1, -1);

		ProductDetail productdetail = productDetailDAO.findProductDetailByPrimaryKey(productdetail_id, -1, -1);

		related_customercomments.setProductDetail(null);
		productdetail.getCustomerComments().remove(related_customercomments);

		customerCommentDAO.remove(related_customercomments);
		customerCommentDAO.flush();

		return productdetail;
	}
}
