package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Offer;

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
 * DAO to manage Offer entities.
 * 
 */
@Repository("OfferDAO")
@Transactional
public class OfferDAOImpl extends AbstractJpaDao<Offer> implements OfferDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Offer.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OfferDAOImpl
	 *
	 */
	public OfferDAOImpl() {
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
	 * JPQL Query - findOfferById
	 *
	 */
	@Transactional
	public Offer findOfferById(Integer id) throws DataAccessException {

		return findOfferById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOfferById
	 *
	 */

	@Transactional
	public Offer findOfferById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOfferById", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Offer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOfferByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Offer> findOfferByDescriptionContaining(String description) throws DataAccessException {

		return findOfferByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findOfferByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Offer> findOfferByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOfferByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Offer>(query.getResultList());
	}

	/**
	 * JPQL Query - findOfferByPrimaryKey
	 *
	 */
	@Transactional
	public Offer findOfferByPrimaryKey(Integer id) throws DataAccessException {

		return findOfferByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOfferByPrimaryKey
	 *
	 */

	@Transactional
	public Offer findOfferByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOfferByPrimaryKey", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Offer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOfferByDescription
	 *
	 */
	@Transactional
	public Set<Offer> findOfferByDescription(String description) throws DataAccessException {

		return findOfferByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findOfferByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Offer> findOfferByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOfferByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Offer>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOffers
	 *
	 */
	@Transactional
	public Set<Offer> findAllOffers() throws DataAccessException {

		return findAllOffers(-1, -1);
	}

	/**
	 * JPQL Query - findAllOffers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Offer> findAllOffers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOffers", startResult, maxRows);
		return new LinkedHashSet<Offer>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Offer entity) {
		return true;
	}
}
