package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductCatalog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ProductCatalog entities.
 * 
 */
@Repository("ProductCatalogDAO")
@Transactional
public class ProductCatalogDAOImpl extends AbstractJpaDao<ProductCatalog>
		implements ProductCatalogDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductCatalog.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductCatalogDAOImpl
	 *
	 */
	public ProductCatalogDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findProductCatalogByProductId
	 *
	 */
	@Transactional
	public Set<ProductCatalog> findProductCatalogByProductId(Integer productId) throws DataAccessException {

		return findProductCatalogByProductId(productId, -1, -1);
	}

	/**
	 * JPQL Query - findProductCatalogByProductId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductCatalog> findProductCatalogByProductId(Integer productId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductCatalogByProductId", startResult, maxRows, productId);
		return new LinkedHashSet<ProductCatalog>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductCatalogs
	 *
	 */
	@Transactional
	public Set<ProductCatalog> findAllProductCatalogs() throws DataAccessException {

		return findAllProductCatalogs(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductCatalogs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductCatalog> findAllProductCatalogs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductCatalogs", startResult, maxRows);
		return new LinkedHashSet<ProductCatalog>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductCatalogByPrimaryKey
	 *
	 */
	@Transactional
	public ProductCatalog findProductCatalogByPrimaryKey(Integer productId, Integer catalogId) throws DataAccessException {

		return findProductCatalogByPrimaryKey(productId, catalogId, -1, -1);
	}

	/**
	 * JPQL Query - findProductCatalogByPrimaryKey
	 *
	 */

	@Transactional
	public ProductCatalog findProductCatalogByPrimaryKey(Integer productId, Integer catalogId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductCatalogByPrimaryKey", startResult, maxRows, productId, catalogId);
			return (com.lqf.eshopdemo.domain.ProductCatalog) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductCatalogByCatalogId
	 *
	 */
	@Transactional
	public Set<ProductCatalog> findProductCatalogByCatalogId(Integer catalogId) throws DataAccessException {

		return findProductCatalogByCatalogId(catalogId, -1, -1);
	}

	/**
	 * JPQL Query - findProductCatalogByCatalogId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductCatalog> findProductCatalogByCatalogId(Integer catalogId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductCatalogByCatalogId", startResult, maxRows, catalogId);
		return new LinkedHashSet<ProductCatalog>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductCatalog entity) {
		return true;
	}
}
