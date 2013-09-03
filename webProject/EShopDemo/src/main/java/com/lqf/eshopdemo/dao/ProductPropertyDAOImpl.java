package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductProperty;

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
 * DAO to manage ProductProperty entities.
 * 
 */
@Repository("ProductPropertyDAO")
@Transactional
public class ProductPropertyDAOImpl extends AbstractJpaDao<ProductProperty>
		implements ProductPropertyDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductProperty.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductPropertyDAOImpl
	 *
	 */
	public ProductPropertyDAOImpl() {
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
	 * JPQL Query - findProductPropertyByValue
	 *
	 */
	@Transactional
	public Set<ProductProperty> findProductPropertyByValue(String value) throws DataAccessException {

		return findProductPropertyByValue(value, -1, -1);
	}

	/**
	 * JPQL Query - findProductPropertyByValue
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductProperty> findProductPropertyByValue(String value, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductPropertyByValue", startResult, maxRows, value);
		return new LinkedHashSet<ProductProperty>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductPropertyByProId
	 *
	 */
	@Transactional
	public Set<ProductProperty> findProductPropertyByProId(Integer proId) throws DataAccessException {

		return findProductPropertyByProId(proId, -1, -1);
	}

	/**
	 * JPQL Query - findProductPropertyByProId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductProperty> findProductPropertyByProId(Integer proId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductPropertyByProId", startResult, maxRows, proId);
		return new LinkedHashSet<ProductProperty>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductPropertyByKey
	 *
	 */
	@Transactional
	public Set<ProductProperty> findProductPropertyByKey(String key) throws DataAccessException {

		return findProductPropertyByKey(key, -1, -1);
	}

	/**
	 * JPQL Query - findProductPropertyByKey
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductProperty> findProductPropertyByKey(String key, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductPropertyByKey", startResult, maxRows, key);
		return new LinkedHashSet<ProductProperty>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProductPropertys
	 *
	 */
	@Transactional
	public Set<ProductProperty> findAllProductPropertys() throws DataAccessException {

		return findAllProductPropertys(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductPropertys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductProperty> findAllProductPropertys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductPropertys", startResult, maxRows);
		return new LinkedHashSet<ProductProperty>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductPropertyByValueContaining
	 *
	 */
	@Transactional
	public Set<ProductProperty> findProductPropertyByValueContaining(String value) throws DataAccessException {

		return findProductPropertyByValueContaining(value, -1, -1);
	}

	/**
	 * JPQL Query - findProductPropertyByValueContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductProperty> findProductPropertyByValueContaining(String value, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductPropertyByValueContaining", startResult, maxRows, value);
		return new LinkedHashSet<ProductProperty>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductPropertyByPrimaryKey
	 *
	 */
	@Transactional
	public ProductProperty findProductPropertyByPrimaryKey(Integer proId, String key) throws DataAccessException {

		return findProductPropertyByPrimaryKey(proId, key, -1, -1);
	}

	/**
	 * JPQL Query - findProductPropertyByPrimaryKey
	 *
	 */

	@Transactional
	public ProductProperty findProductPropertyByPrimaryKey(Integer proId, String key, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductPropertyByPrimaryKey", startResult, maxRows, proId, key);
			return (com.lqf.eshopdemo.domain.ProductProperty) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductPropertyByKeyContaining
	 *
	 */
	@Transactional
	public Set<ProductProperty> findProductPropertyByKeyContaining(String key) throws DataAccessException {

		return findProductPropertyByKeyContaining(key, -1, -1);
	}

	/**
	 * JPQL Query - findProductPropertyByKeyContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductProperty> findProductPropertyByKeyContaining(String key, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductPropertyByKeyContaining", startResult, maxRows, key);
		return new LinkedHashSet<ProductProperty>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductProperty entity) {
		return true;
	}
}
