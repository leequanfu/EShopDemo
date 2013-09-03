package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Catalog;

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
 * DAO to manage Catalog entities.
 * 
 */
@Repository("CatalogDAO")
@Transactional
public class CatalogDAOImpl extends AbstractJpaDao<Catalog> implements
		CatalogDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Catalog.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CatalogDAOImpl
	 *
	 */
	public CatalogDAOImpl() {
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
	 * JPQL Query - findCatalogByName
	 *
	 */
	@Transactional
	public Set<Catalog> findCatalogByName(String name) throws DataAccessException {

		return findCatalogByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findCatalogByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Catalog> findCatalogByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatalogByName", startResult, maxRows, name);
		return new LinkedHashSet<Catalog>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatalogByPrimaryKey
	 *
	 */
	@Transactional
	public Catalog findCatalogByPrimaryKey(Integer id) throws DataAccessException {

		return findCatalogByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findCatalogByPrimaryKey
	 *
	 */

	@Transactional
	public Catalog findCatalogByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatalogByPrimaryKey", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Catalog) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCatalogById
	 *
	 */
	@Transactional
	public Catalog findCatalogById(Integer id) throws DataAccessException {

		return findCatalogById(id, -1, -1);
	}

	/**
	 * JPQL Query - findCatalogById
	 *
	 */

	@Transactional
	public Catalog findCatalogById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCatalogById", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Catalog) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllCatalogs
	 *
	 */
	@Transactional
	public Set<Catalog> findAllCatalogs() throws DataAccessException {

		return findAllCatalogs(-1, -1);
	}

	/**
	 * JPQL Query - findAllCatalogs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Catalog> findAllCatalogs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCatalogs", startResult, maxRows);
		return new LinkedHashSet<Catalog>(query.getResultList());
	}

	/**
	 * JPQL Query - findCatalogByNameContaining
	 *
	 */
	@Transactional
	public Set<Catalog> findCatalogByNameContaining(String name) throws DataAccessException {

		return findCatalogByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findCatalogByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Catalog> findCatalogByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCatalogByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Catalog>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Catalog entity) {
		return true;
	}
}
