package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.CustomerComment;

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
 * DAO to manage CustomerComment entities.
 * 
 */
@Repository("CustomerCommentDAO")
@Transactional
public class CustomerCommentDAOImpl extends AbstractJpaDao<CustomerComment>
		implements CustomerCommentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { CustomerComment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CustomerCommentDAOImpl
	 *
	 */
	public CustomerCommentDAOImpl() {
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
	 * JPQL Query - findCustomerCommentByComment
	 *
	 */
	@Transactional
	public Set<CustomerComment> findCustomerCommentByComment(String comment) throws DataAccessException {

		return findCustomerCommentByComment(comment, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerCommentByComment
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerComment> findCustomerCommentByComment(String comment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerCommentByComment", startResult, maxRows, comment);
		return new LinkedHashSet<CustomerComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerCommentByCommentContaining
	 *
	 */
	@Transactional
	public Set<CustomerComment> findCustomerCommentByCommentContaining(String comment) throws DataAccessException {

		return findCustomerCommentByCommentContaining(comment, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerCommentByCommentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerComment> findCustomerCommentByCommentContaining(String comment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerCommentByCommentContaining", startResult, maxRows, comment);
		return new LinkedHashSet<CustomerComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerCommentByPrimaryKey
	 *
	 */
	@Transactional
	public CustomerComment findCustomerCommentByPrimaryKey(Integer proId, Integer userId) throws DataAccessException {

		return findCustomerCommentByPrimaryKey(proId, userId, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerCommentByPrimaryKey
	 *
	 */

	@Transactional
	public CustomerComment findCustomerCommentByPrimaryKey(Integer proId, Integer userId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerCommentByPrimaryKey", startResult, maxRows, proId, userId);
			return (com.lqf.eshopdemo.domain.CustomerComment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllCustomerComments
	 *
	 */
	@Transactional
	public Set<CustomerComment> findAllCustomerComments() throws DataAccessException {

		return findAllCustomerComments(-1, -1);
	}

	/**
	 * JPQL Query - findAllCustomerComments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerComment> findAllCustomerComments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCustomerComments", startResult, maxRows);
		return new LinkedHashSet<CustomerComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerCommentByRate
	 *
	 */
	@Transactional
	public Set<CustomerComment> findCustomerCommentByRate(Integer rate) throws DataAccessException {

		return findCustomerCommentByRate(rate, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerCommentByRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerComment> findCustomerCommentByRate(Integer rate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerCommentByRate", startResult, maxRows, rate);
		return new LinkedHashSet<CustomerComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerCommentByProId
	 *
	 */
	@Transactional
	public Set<CustomerComment> findCustomerCommentByProId(Integer proId) throws DataAccessException {

		return findCustomerCommentByProId(proId, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerCommentByProId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerComment> findCustomerCommentByProId(Integer proId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerCommentByProId", startResult, maxRows, proId);
		return new LinkedHashSet<CustomerComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerCommentByUserId
	 *
	 */
	@Transactional
	public Set<CustomerComment> findCustomerCommentByUserId(Integer userId) throws DataAccessException {

		return findCustomerCommentByUserId(userId, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerCommentByUserId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerComment> findCustomerCommentByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerCommentByUserId", startResult, maxRows, userId);
		return new LinkedHashSet<CustomerComment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(CustomerComment entity) {
		return true;
	}
}
