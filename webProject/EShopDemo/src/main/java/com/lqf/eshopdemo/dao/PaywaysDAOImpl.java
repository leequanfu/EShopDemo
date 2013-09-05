package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Payways;

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
 * DAO to manage Payways entities.
 * 
 */
@Repository("PaywaysDAO")
@Transactional
public class PaywaysDAOImpl extends AbstractJpaDao<Payways> implements
		PaywaysDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Payways.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PaywaysDAOImpl
	 *
	 */
	public PaywaysDAOImpl() {
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
	 * JPQL Query - findPaywaysByWay
	 *
	 */
	@Transactional
	public Payways findPaywaysByWay(String way) throws DataAccessException {

		return findPaywaysByWay(way, -1, -1);
	}

	/**
	 * JPQL Query - findPaywaysByWay
	 *
	 */

	@Transactional
	public Payways findPaywaysByWay(String way, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPaywaysByWay", startResult, maxRows, way);
			return (com.lqf.eshopdemo.domain.Payways) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPaywaysByPrimaryKey
	 *
	 */
	@Transactional
	public Payways findPaywaysByPrimaryKey(String way) throws DataAccessException {

		return findPaywaysByPrimaryKey(way, -1, -1);
	}

	/**
	 * JPQL Query - findPaywaysByPrimaryKey
	 *
	 */

	@Transactional
	public Payways findPaywaysByPrimaryKey(String way, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPaywaysByPrimaryKey", startResult, maxRows, way);
			return (com.lqf.eshopdemo.domain.Payways) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllPaywayss
	 *
	 */
	@Transactional
	public Set<Payways> findAllPaywayss() throws DataAccessException {

		return findAllPaywayss(-1, -1);
	}

	/**
	 * JPQL Query - findAllPaywayss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Payways> findAllPaywayss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPaywayss", startResult, maxRows);
		return new LinkedHashSet<Payways>(query.getResultList());
	}

	/**
	 * JPQL Query - findPaywaysByWayContaining
	 *
	 */
	@Transactional
	public Set<Payways> findPaywaysByWayContaining(String way) throws DataAccessException {

		return findPaywaysByWayContaining(way, -1, -1);
	}

	/**
	 * JPQL Query - findPaywaysByWayContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Payways> findPaywaysByWayContaining(String way, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPaywaysByWayContaining", startResult, maxRows, way);
		return new LinkedHashSet<Payways>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Payways entity) {
		return true;
	}
}
