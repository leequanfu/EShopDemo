package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductOffer;

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
 * DAO to manage ProductOffer entities.
 * 
 */
@Repository("ProductOfferDAO")
@Transactional
public class ProductOfferDAOImpl extends AbstractJpaDao<ProductOffer> implements
		ProductOfferDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ProductOffer.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductOfferDAOImpl
	 *
	 */
	public ProductOfferDAOImpl() {
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
	 * JPQL Query - findProductOfferByPrimaryKey
	 *
	 */
	@Transactional
	public ProductOffer findProductOfferByPrimaryKey(Integer proId, Integer offerId) throws DataAccessException {

		return findProductOfferByPrimaryKey(proId, offerId, -1, -1);
	}

	/**
	 * JPQL Query - findProductOfferByPrimaryKey
	 *
	 */

	@Transactional
	public ProductOffer findProductOfferByPrimaryKey(Integer proId, Integer offerId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductOfferByPrimaryKey", startResult, maxRows, proId, offerId);
			return (com.lqf.eshopdemo.domain.ProductOffer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllProductOffers
	 *
	 */
	@Transactional
	public Set<ProductOffer> findAllProductOffers() throws DataAccessException {

		return findAllProductOffers(-1, -1);
	}

	/**
	 * JPQL Query - findAllProductOffers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductOffer> findAllProductOffers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProductOffers", startResult, maxRows);
		return new LinkedHashSet<ProductOffer>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductOfferByProId
	 *
	 */
	@Transactional
	public Set<ProductOffer> findProductOfferByProId(Integer proId) throws DataAccessException {

		return findProductOfferByProId(proId, -1, -1);
	}

	/**
	 * JPQL Query - findProductOfferByProId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductOffer> findProductOfferByProId(Integer proId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductOfferByProId", startResult, maxRows, proId);
		return new LinkedHashSet<ProductOffer>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductOfferByOfferId
	 *
	 */
	@Transactional
	public Set<ProductOffer> findProductOfferByOfferId(Integer offerId) throws DataAccessException {

		return findProductOfferByOfferId(offerId, -1, -1);
	}

	/**
	 * JPQL Query - findProductOfferByOfferId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProductOffer> findProductOfferByOfferId(Integer offerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductOfferByOfferId", startResult, maxRows, offerId);
		return new LinkedHashSet<ProductOffer>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProductOffer entity) {
		return true;
	}
}
