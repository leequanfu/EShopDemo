package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Payways;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Payways entities.
 * 
 */
public interface PaywaysDAO extends JpaDao<Payways> {

	/**
	 * JPQL Query - findPaywaysByWay
	 *
	 */
	public Payways findPaywaysByWay(String way) throws DataAccessException;

	/**
	 * JPQL Query - findPaywaysByWay
	 *
	 */
	public Payways findPaywaysByWay(String way, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPaywaysByPrimaryKey
	 *
	 */
	public Payways findPaywaysByPrimaryKey(String way_1) throws DataAccessException;

	/**
	 * JPQL Query - findPaywaysByPrimaryKey
	 *
	 */
	public Payways findPaywaysByPrimaryKey(String way_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPaywayss
	 *
	 */
	public Set<Payways> findAllPaywayss() throws DataAccessException;

	/**
	 * JPQL Query - findAllPaywayss
	 *
	 */
	public Set<Payways> findAllPaywayss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPaywaysByWayContaining
	 *
	 */
	public Set<Payways> findPaywaysByWayContaining(String way_2) throws DataAccessException;

	/**
	 * JPQL Query - findPaywaysByWayContaining
	 *
	 */
	public Set<Payways> findPaywaysByWayContaining(String way_2, int startResult, int maxRows) throws DataAccessException;

}