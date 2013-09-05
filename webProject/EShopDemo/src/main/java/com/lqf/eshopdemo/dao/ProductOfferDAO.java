package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.ProductOffer;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductOffer entities.
 * 
 */
public interface ProductOfferDAO extends JpaDao<ProductOffer> {

	/**
	 * JPQL Query - findProductOfferByProId
	 *
	 */
	public Set<ProductOffer> findProductOfferByProId(Integer proId) throws DataAccessException;

	/**
	 * JPQL Query - findProductOfferByProId
	 *
	 */
	public Set<ProductOffer> findProductOfferByProId(Integer proId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductOfferByOfferId
	 *
	 */
	public Set<ProductOffer> findProductOfferByOfferId(Integer offerId) throws DataAccessException;

	/**
	 * JPQL Query - findProductOfferByOfferId
	 *
	 */
	public Set<ProductOffer> findProductOfferByOfferId(Integer offerId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductOfferByPrimaryKey
	 *
	 */
	public ProductOffer findProductOfferByPrimaryKey(Integer proId_1, Integer offerId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductOfferByPrimaryKey
	 *
	 */
	public ProductOffer findProductOfferByPrimaryKey(Integer proId_1, Integer offerId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductOffers
	 *
	 */
	public Set<ProductOffer> findAllProductOffers() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductOffers
	 *
	 */
	public Set<ProductOffer> findAllProductOffers(int startResult, int maxRows) throws DataAccessException;

}