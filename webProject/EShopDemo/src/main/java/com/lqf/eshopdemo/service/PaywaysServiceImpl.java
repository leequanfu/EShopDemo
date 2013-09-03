package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.dao.PaywaysDAO;

import com.lqf.eshopdemo.domain.Payways;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Payways entities
 * 
 */

@Service("PaywaysService")
@Transactional
public class PaywaysServiceImpl implements PaywaysService {

	/**
	 * DAO injected by Spring that manages Payways entities
	 * 
	 */
	@Autowired
	private PaywaysDAO paywaysDAO;

	/**
	 * Instantiates a new PaywaysServiceImpl.
	 *
	 */
	public PaywaysServiceImpl() {
	}

	/**
	 * Delete an existing Payways entity
	 * 
	 */
	@Transactional
	public void deletePayways(Payways payways) {
		paywaysDAO.remove(payways);
		paywaysDAO.flush();
	}

	/**
	 * Save an existing Payways entity
	 * 
	 */
	@Transactional
	public void savePayways(Payways payways) {
		Payways existingPayways = paywaysDAO.findPaywaysByPrimaryKey(payways.getWay());

		if (existingPayways != null) {
			if (existingPayways != payways) {
				existingPayways.setWay(payways.getWay());
			}
			payways = paywaysDAO.store(existingPayways);
		} else {
			payways = paywaysDAO.store(payways);
		}
		paywaysDAO.flush();
	}

	/**
	 */
	@Transactional
	public Payways findPaywaysByPrimaryKey(String way) {
		return paywaysDAO.findPaywaysByPrimaryKey(way);
	}

	/**
	 * Return all Payways entity
	 * 
	 */
	@Transactional
	public List<Payways> findAllPaywayss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Payways>(paywaysDAO.findAllPaywayss(startResult, maxRows));
	}

	/**
	 * Load an existing Payways entity
	 * 
	 */
	@Transactional
	public Set<Payways> loadPaywayss() {
		return paywaysDAO.findAllPaywayss();
	}

	/**
	 * Return a count of all Payways entity
	 * 
	 */
	@Transactional
	public Integer countPaywayss() {
		return ((Long) paywaysDAO.createQuerySingleResult("select count(o) from Payways o").getSingleResult()).intValue();
	}
}
