package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Offer;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Offer entities.
 * 
 */
public interface OfferDAO extends JpaDao<Offer> {

	/**
	 * JPQL Query - findOfferByDescription
	 *
	 */
	public Set<Offer> findOfferByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findOfferByDescription
	 *
	 */
	public Set<Offer> findOfferByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOfferById
	 *
	 */
	public Offer findOfferById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findOfferById
	 *
	 */
	public Offer findOfferById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOfferByPrimaryKey
	 *
	 */
	public Offer findOfferByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOfferByPrimaryKey
	 *
	 */
	public Offer findOfferByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOffers
	 *
	 */
	public Set<Offer> findAllOffers() throws DataAccessException;

	/**
	 * JPQL Query - findAllOffers
	 *
	 */
	public Set<Offer> findAllOffers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOfferByDescriptionContaining
	 *
	 */
	public Set<Offer> findOfferByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findOfferByDescriptionContaining
	 *
	 */
	public Set<Offer> findOfferByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

}