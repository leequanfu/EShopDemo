package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductDetail;

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
 * DAO to manage ProductDetail entities.
 * 
 */
@Repository("ProductDetailDAO")
@Transactional
public class ProductDetailDAOImpl extends AbstractJpaDao<ProductDetail>
		implements ProductDetailDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductDetail.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductDetailDAOImpl
	 *
	 */
	public ProductDetailDAOImpl() {
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
	 * JPQL Query - findAllProductDetails
	 *
	 */
	@Transactional
	public Set<ProductDetail> findAllProductDetails() throws DataAccessException {

		return findAllProductDetails(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductDetails
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findAllProductDetails(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductDetails", startResult, maxRows);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductDetailByQuantity
	 *
	 */
	@Transactional
	public Set<ProductDetail> findProductDetailByQuantity(Integer quantity) throws DataAccessException {

		return findProductDetailByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findProductDetailByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductDetailByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductDetailByDescription
	 *
	 */
	@Transactional
	public Set<ProductDetail> findProductDetailByDescription(String description) throws DataAccessException {

		return findProductDetailByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findProductDetailByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductDetailByDescription", startResult, maxRows, description);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductDetailByTitleContaining
	 *
	 */
	@Transactional
	public Set<ProductDetail> findProductDetailByTitleContaining(String title) throws DataAccessException {

		return findProductDetailByTitleContaining(title, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findProductDetailByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductDetailByTitleContaining", startResult, maxRows, title);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductDetailByPrimaryKey
	 *
	 */
	@Transactional
	public ProductDetail findProductDetailByPrimaryKey(Integer id) throws DataAccessException {

		return findProductDetailByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByPrimaryKey
	 *
	 */

	@Transactional
	public ProductDetail findProductDetailByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductDetailByPrimaryKey", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.ProductDetail) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductDetailByTitle
	 *
	 */
	@Transactional
	public Set<ProductDetail> findProductDetailByTitle(String title) throws DataAccessException {

		return findProductDetailByTitle(title, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findProductDetailByTitle(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductDetailByTitle", startResult, maxRows, title);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductDetailByPrice
	 *
	 */
	@Transactional
	public Set<ProductDetail> findProductDetailByPrice(java.math.BigDecimal price) throws DataAccessException {

		return findProductDetailByPrice(price, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findProductDetailByPrice(java.math.BigDecimal price, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductDetailByPrice", startResult, maxRows, price);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductDetailById
	 *
	 */
	@Transactional
	public ProductDetail findProductDetailById(Integer id) throws DataAccessException {

		return findProductDetailById(id, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailById
	 *
	 */

	@Transactional
	public ProductDetail findProductDetailById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductDetailById", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.ProductDetail) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductDetailByPicnum
	 *
	 */
	@Transactional
	public Set<ProductDetail> findProductDetailByPicnum(Integer picnum) throws DataAccessException {

		return findProductDetailByPicnum(picnum, -1, -1);
	}

	/**
	 * JPQL Query - findProductDetailByPicnum
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductDetail> findProductDetailByPicnum(Integer picnum, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductDetailByPicnum", startResult, maxRows, picnum);
		return new LinkedHashSet<ProductDetail>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductDetail entity) {
		return true;
	}
}
