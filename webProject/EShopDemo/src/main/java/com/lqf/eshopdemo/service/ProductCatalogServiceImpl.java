package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;
import com.lqf.eshopdemo.dao.ProductDetailDAO;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;
import com.lqf.eshopdemo.domain.ProductDetail;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductCatalog entities
 * 
 */

@Service("ProductCatalogService")
@Transactional
public class ProductCatalogServiceImpl implements ProductCatalogService {

	/**
	 * DAO injected by Spring that manages Catalog entities
	 * 
	 */
	@Autowired
	private CatalogDAO catalogDAO;

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
	 * Instantiates a new ProductCatalogServiceImpl.
	 *
	 */
	public ProductCatalogServiceImpl() {
	}

	/**
	 * Return all ProductCatalog entity
	 * 
	 */
	@Transactional
	public List<ProductCatalog> findAllProductCatalogs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductCatalog>(productCatalogDAO.findAllProductCatalogs(startResult, maxRows));
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public void deleteProductCatalog(ProductCatalog productcatalog) {
		productCatalogDAO.remove(productcatalog);
		productCatalogDAO.flush();
	}

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	@Transactional
	public ProductCatalog deleteProductCatalogCatalog(Integer productcatalog_productId, Integer productcatalog_catalogId, Integer related_catalog_id) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog_productId, productcatalog_catalogId, -1, -1);
		Catalog related_catalog = catalogDAO.findCatalogByPrimaryKey(related_catalog_id, -1, -1);

		productcatalog.setCatalog(null);
		related_catalog.getProductCatalogs().remove(productcatalog);
		productcatalog = productCatalogDAO.store(productcatalog);
		productCatalogDAO.flush();

		related_catalog = catalogDAO.store(related_catalog);
		catalogDAO.flush();

		catalogDAO.remove(related_catalog);
		catalogDAO.flush();

		return productcatalog;
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public void saveProductCatalog(ProductCatalog productcatalog) {
		ProductCatalog existingProductCatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog.getProductId(), productcatalog.getCatalogId());

		if (existingProductCatalog != null) {
			if (existingProductCatalog != productcatalog) {
				existingProductCatalog.setProductId(productcatalog.getProductId());
				existingProductCatalog.setCatalogId(productcatalog.getCatalogId());
			}
			productcatalog = productCatalogDAO.store(existingProductCatalog);
		} else {
			productcatalog = productCatalogDAO.store(productcatalog);
		}
		productCatalogDAO.flush();
	}

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	@Transactional
	public ProductCatalog saveProductCatalogCatalog(Integer productId, Integer catalogId, Catalog related_catalog) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productId, catalogId, -1, -1);
		Catalog existingcatalog = catalogDAO.findCatalogByPrimaryKey(related_catalog.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcatalog != null) {
			existingcatalog.setId(related_catalog.getId());
			existingcatalog.setName(related_catalog.getName());
			related_catalog = existingcatalog;
		} else {
			related_catalog = catalogDAO.store(related_catalog);
			catalogDAO.flush();
		}

		productcatalog.setCatalog(related_catalog);
		related_catalog.getProductCatalogs().add(productcatalog);
		productcatalog = productCatalogDAO.store(productcatalog);
		productCatalogDAO.flush();

		related_catalog = catalogDAO.store(related_catalog);
		catalogDAO.flush();

		return productcatalog;
	}

	/**
	 */
	@Transactional
	public ProductCatalog findProductCatalogByPrimaryKey(Integer productId, Integer catalogId) {
		return productCatalogDAO.findProductCatalogByPrimaryKey(productId, catalogId);
	}

	/**
	 * Return a count of all ProductCatalog entity
	 * 
	 */
	@Transactional
	public Integer countProductCatalogs() {
		return ((Long) productCatalogDAO.createQuerySingleResult("select count(*) from ProductCatalog o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public ProductCatalog saveProductCatalogProductDetail(Integer productId, Integer catalogId, ProductDetail related_productdetail) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productId, catalogId, -1, -1);
		ProductDetail existingproductDetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproductDetail != null) {
			existingproductDetail.setId(related_productdetail.getId());
			existingproductDetail.setTitle(related_productdetail.getTitle());
			existingproductDetail.setPrice(related_productdetail.getPrice());
			existingproductDetail.setQuantity(related_productdetail.getQuantity());
			existingproductDetail.setDescription(related_productdetail.getDescription());
			existingproductDetail.setPicnum(related_productdetail.getPicnum());
			related_productdetail = existingproductDetail;
		} else {
			related_productdetail = productDetailDAO.store(related_productdetail);
			productDetailDAO.flush();
		}

		productcatalog.setProductDetail(related_productdetail);
		related_productdetail.getProductCatalogs().add(productcatalog);
		productcatalog = productCatalogDAO.store(productcatalog);
		productCatalogDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		return productcatalog;
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public ProductCatalog deleteProductCatalogProductDetail(Integer productcatalog_productId, Integer productcatalog_catalogId, Integer related_productdetail_id) {
		ProductCatalog productcatalog = productCatalogDAO.findProductCatalogByPrimaryKey(productcatalog_productId, productcatalog_catalogId, -1, -1);
		ProductDetail related_productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		productcatalog.setProductDetail(null);
		related_productdetail.getProductCatalogs().remove(productcatalog);
		productcatalog = productCatalogDAO.store(productcatalog);
		productCatalogDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		productDetailDAO.remove(related_productdetail);
		productDetailDAO.flush();

		return productcatalog;
	}

	/**
	 * Load an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public Set<ProductCatalog> loadProductCatalogs() {
		return productCatalogDAO.findAllProductCatalogs();
	}
}
