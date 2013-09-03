package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.ProductDetailDAO;
import com.lqf.eshopdemo.dao.ProductPropertyDAO;

import com.lqf.eshopdemo.domain.ProductDetail;
import com.lqf.eshopdemo.domain.ProductProperty;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductProperty entities
 * 
 */

@Service("ProductPropertyService")
@Transactional
public class ProductPropertyServiceImpl implements ProductPropertyService {

	/**
	 * DAO injected by Spring that manages ProductDetail entities
	 * 
	 */
	@Autowired
	private ProductDetailDAO productDetailDAO;

	/**
	 * DAO injected by Spring that manages ProductProperty entities
	 * 
	 */
	@Autowired
	private ProductPropertyDAO productPropertyDAO;

	/**
	 * Instantiates a new ProductPropertyServiceImpl.
	 *
	 */
	public ProductPropertyServiceImpl() {
	}

	/**
	 */
	@Transactional
	public ProductProperty findProductPropertyByPrimaryKey(Integer proId, String key) {
		return productPropertyDAO.findProductPropertyByPrimaryKey(proId, key);
	}

	/**
	 * Return a count of all ProductProperty entity
	 * 
	 */
	@Transactional
	public Integer countProductPropertys() {
		return ((Long) productPropertyDAO.createQuerySingleResult("select count(*) from ProductProperty o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public ProductProperty saveProductPropertyProductDetail(Integer proId, String key, ProductDetail related_productdetail) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(proId, key, -1, -1);
		ProductDetail existingproductDetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproductDetail != null) {
			existingproductDetail.setId(related_productdetail.getId());
			existingproductDetail.setTitle(related_productdetail.getTitle());
			existingproductDetail.setPrice(related_productdetail.getPrice());
			existingproductDetail.setQuantity(related_productdetail.getQuantity());
			existingproductDetail.setDescription(related_productdetail.getDescription());
			related_productdetail = existingproductDetail;
		} else {
			related_productdetail = productDetailDAO.store(related_productdetail);
			productDetailDAO.flush();
		}

		productproperty.setProductDetail(related_productdetail);
		related_productdetail.getProductProperties().add(productproperty);
		productproperty = productPropertyDAO.store(productproperty);
		productPropertyDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		return productproperty;
	}

	/**
	 * Return all ProductProperty entity
	 * 
	 */
	@Transactional
	public List<ProductProperty> findAllProductPropertys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductProperty>(productPropertyDAO.findAllProductPropertys(startResult, maxRows));
	}

	/**
	 * Save an existing ProductProperty entity
	 * 
	 */
	@Transactional
	public void saveProductProperty(ProductProperty productproperty) {
		ProductProperty existingProductProperty = productPropertyDAO.findProductPropertyByPrimaryKey(productproperty.getProId(), productproperty.getKey());

		if (existingProductProperty != null) {
			if (existingProductProperty != productproperty) {
				existingProductProperty.setProId(productproperty.getProId());
				existingProductProperty.setKey(productproperty.getKey());
				existingProductProperty.setValue(productproperty.getValue());
			}
			productproperty = productPropertyDAO.store(existingProductProperty);
		} else {
			productproperty = productPropertyDAO.store(productproperty);
		}
		productPropertyDAO.flush();
	}

	/**
	 * Delete an existing ProductDetail entity
	 * 
	 */
	@Transactional
	public ProductProperty deleteProductPropertyProductDetail(Integer productproperty_proId, String productproperty_key, Integer related_productdetail_id) {
		ProductProperty productproperty = productPropertyDAO.findProductPropertyByPrimaryKey(productproperty_proId, productproperty_key, -1, -1);
		ProductDetail related_productdetail = productDetailDAO.findProductDetailByPrimaryKey(related_productdetail_id, -1, -1);

		productproperty.setProductDetail(null);
		related_productdetail.getProductProperties().remove(productproperty);
		productproperty = productPropertyDAO.store(productproperty);
		productPropertyDAO.flush();

		related_productdetail = productDetailDAO.store(related_productdetail);
		productDetailDAO.flush();

		productDetailDAO.remove(related_productdetail);
		productDetailDAO.flush();

		return productproperty;
	}

	/**
	 * Load an existing ProductProperty entity
	 * 
	 */
	@Transactional
	public Set<ProductProperty> loadProductPropertys() {
		return productPropertyDAO.findAllProductPropertys();
	}

	/**
	 * Delete an existing ProductProperty entity
	 * 
	 */
	@Transactional
	public void deleteProductProperty(ProductProperty productproperty) {
		productPropertyDAO.remove(productproperty);
		productPropertyDAO.flush();
	}
}
