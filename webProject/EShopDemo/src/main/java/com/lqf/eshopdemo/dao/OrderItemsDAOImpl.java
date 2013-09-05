package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.OrderItems;

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
 * DAO to manage OrderItems entities.
 * 
 */
@Repository("OrderItemsDAO")
@Transactional
public class OrderItemsDAOImpl extends AbstractJpaDao<OrderItems> implements
		OrderItemsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { OrderItems.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderItemsDAOImpl
	 *
	 */
	public OrderItemsDAOImpl() {
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
	 * JPQL Query - findOrderItemsByOrderId
	 *
	 */
	@Transactional
	public Set<OrderItems> findOrderItemsByOrderId(Integer orderId) throws DataAccessException {

		return findOrderItemsByOrderId(orderId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderItemsByOrderId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderItems> findOrderItemsByOrderId(Integer orderId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderItemsByOrderId", startResult, maxRows, orderId);
		return new LinkedHashSet<OrderItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrderItemss
	 *
	 */
	@Transactional
	public Set<OrderItems> findAllOrderItemss() throws DataAccessException {

		return findAllOrderItemss(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderItemss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderItems> findAllOrderItemss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderItemss", startResult, maxRows);
		return new LinkedHashSet<OrderItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderItemsByPrimaryKey
	 *
	 */
	@Transactional
	public OrderItems findOrderItemsByPrimaryKey(Integer orderId, Integer productId) throws DataAccessException {

		return findOrderItemsByPrimaryKey(orderId, productId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderItemsByPrimaryKey
	 *
	 */

	@Transactional
	public OrderItems findOrderItemsByPrimaryKey(Integer orderId, Integer productId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderItemsByPrimaryKey", startResult, maxRows, orderId, productId);
			return (com.lqf.eshopdemo.domain.OrderItems) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderItemsByProductId
	 *
	 */
	@Transactional
	public Set<OrderItems> findOrderItemsByProductId(Integer productId) throws DataAccessException {

		return findOrderItemsByProductId(productId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderItemsByProductId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderItems> findOrderItemsByProductId(Integer productId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderItemsByProductId", startResult, maxRows, productId);
		return new LinkedHashSet<OrderItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderItemsByPrice
	 *
	 */
	@Transactional
	public Set<OrderItems> findOrderItemsByPrice(java.math.BigDecimal price) throws DataAccessException {

		return findOrderItemsByPrice(price, -1, -1);
	}

	/**
	 * JPQL Query - findOrderItemsByPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderItems> findOrderItemsByPrice(java.math.BigDecimal price, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderItemsByPrice", startResult, maxRows, price);
		return new LinkedHashSet<OrderItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderItemsByQuality
	 *
	 */
	@Transactional
	public Set<OrderItems> findOrderItemsByQuality(Integer quality) throws DataAccessException {

		return findOrderItemsByQuality(quality, -1, -1);
	}

	/**
	 * JPQL Query - findOrderItemsByQuality
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderItems> findOrderItemsByQuality(Integer quality, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderItemsByQuality", startResult, maxRows, quality);
		return new LinkedHashSet<OrderItems>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(OrderItems entity) {
		return true;
	}
}
