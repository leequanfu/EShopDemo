package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Order;

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
 * DAO to manage Order entities.
 * 
 */
@Repository("OrderDAO")
@Transactional
public class OrderDAOImpl extends AbstractJpaDao<Order> implements OrderDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Order.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderDAOImpl
	 *
	 */
	public OrderDAOImpl() {
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
	 * JPQL Query - findOrderByPhone
	 *
	 */
	@Transactional
	public Set<Order> findOrderByPhone(String phone) throws DataAccessException {

		return findOrderByPhone(phone, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByPhone(String phone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByPhone", startResult, maxRows, phone);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByPaywayContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByPaywayContaining(String payway) throws DataAccessException {

		return findOrderByPaywayContaining(payway, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPaywayContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByPaywayContaining(String payway, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByPaywayContaining", startResult, maxRows, payway);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	@Transactional
	public Order findOrderById(Integer id) throws DataAccessException {

		return findOrderById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderById
	 *
	 */

	@Transactional
	public Order findOrderById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderById", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByAddressContaining(String address) throws DataAccessException {

		return findOrderByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	@Transactional
	public Set<Order> findOrderByAddress(String address) throws DataAccessException {

		return findOrderByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	@Transactional
	public Set<Order> findAllOrders() throws DataAccessException {

		return findAllOrders(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrders
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrders", startResult, maxRows);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByPayway
	 *
	 */
	@Transactional
	public Set<Order> findOrderByPayway(String payway) throws DataAccessException {

		return findOrderByPayway(payway, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPayway
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByPayway(String payway, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByPayway", startResult, maxRows, payway);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	@Transactional
	public Order findOrderByPrimaryKey(Integer id) throws DataAccessException {

		return findOrderByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */

	@Transactional
	public Order findOrderByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderByPrimaryKey", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByPhoneContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByPhoneContaining(String phone) throws DataAccessException {

		return findOrderByPhoneContaining(phone, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByPhoneContaining(String phone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByPhoneContaining", startResult, maxRows, phone);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Order entity) {
		return true;
	}
}
