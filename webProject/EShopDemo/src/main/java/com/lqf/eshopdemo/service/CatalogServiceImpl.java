package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.CatalogDAO;
import com.lqf.eshopdemo.dao.ProductCatalogDAO;

import com.lqf.eshopdemo.domain.Catalog;
import com.lqf.eshopdemo.domain.ProductCatalog;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Catalog entities
 * 
 */

@Service("CatalogService")
@Transactional
public class CatalogServiceImpl implements CatalogService {

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
	 * Instantiates a new CatalogServiceImpl.
	 *
	 */
	public CatalogServiceImpl() {
	}

	/**
	 * Load an existing Catalog entity
	 * 
	 */
	@Transactional
	public Set<Catalog> loadCatalogs() {
		return catalogDAO.findAllCatalogs();
	}

	/**
	 * Delete an existing Catalog entity
	 * 
	 */
	@Transactional
	public void deleteCatalog(Catalog catalog) {
		catalogDAO.remove(catalog);
		catalogDAO.flush();
	}

	/**
	 * Delete an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public Catalog deleteCatalogProductCatalogs(Integer catalog_id, Integer related_productcatalogs_productId, Integer related_productcatalogs_catalogId) {
		ProductCatalog related_productcatalogs = productCatalogDAO.findProductCatalogByPrimaryKey(related_productcatalogs_productId, related_productcatalogs_catalogId, -1, -1);

		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(catalog_id, -1, -1);

		related_productcatalogs.setCatalog(null);
		catalog.getProductCatalogs().remove(related_productcatalogs);

		productCatalogDAO.remove(related_productcatalogs);
		productCatalogDAO.flush();

		return catalog;
	}

	/**
	 * Save an existing Catalog entity
	 * 
	 */
	@Transactional
	public void saveCatalog(Catalog catalog) {
		Catalog existingCatalog = catalogDAO.findCatalogByPrimaryKey(catalog.getId());

		if (existingCatalog != null) {
			if (existingCatalog != catalog) {
				existingCatalog.setId(catalog.getId());
				existingCatalog.setName(catalog.getName());
			}
			catalog = catalogDAO.store(existingCatalog);
		} else {
			catalog = catalogDAO.store(catalog);
		}
		catalogDAO.flush();
	}

	/**
	 * Return all Catalog entity
	 * 
	 */
	@Transactional
	public List<Catalog> findAllCatalogs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Catalog>(catalogDAO.findAllCatalogs(startResult, maxRows));
	}

	/**
	 * Save an existing ProductCatalog entity
	 * 
	 */
	@Transactional
	public Catalog saveCatalogProductCatalogs(Integer id, ProductCatalog related_productcatalogs) {
		Catalog catalog = catalogDAO.findCatalogByPrimaryKey(id, -1, -1);
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

		related_productcatalogs.setCatalog(catalog);
		catalog.getProductCatalogs().add(related_productcatalogs);
		related_productcatalogs = productCatalogDAO.store(related_productcatalogs);
		productCatalogDAO.flush();

		catalog = catalogDAO.store(catalog);
		catalogDAO.flush();

		return catalog;
	}

	/**
	 * Return a count of all Catalog entity
	 * 
	 */
	@Transactional
	public Integer countCatalogs() {
		return ((Long) catalogDAO.createQuerySingleResult("select count(o) from Catalog o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Catalog findCatalogByPrimaryKey(Integer id) {
		return catalogDAO.findCatalogByPrimaryKey(id);
	}
}
