package com.lqf.eshopdemo.service;

import com.lqf.eshopdemo.domain.Payways;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Payways entities
 * 
 */
public interface PaywaysService {

	/**
	 * Save an existing Payways entity
	 * 
	 */
	public void savePayways(Payways payways);

	/**
	 * Load an existing Payways entity
	 * 
	 */
	public Set<Payways> loadPaywayss();

	/**
	 */
	public Payways findPaywaysByPrimaryKey(String way);

	/**
	 * Delete an existing Payways entity
	 * 
	 */
	public void deletePayways(Payways payways_1);

	/**
	 * Return all Payways entity
	 * 
	 */
	public List<Payways> findAllPaywayss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Payways entity
	 * 
	 */
	public Integer countPaywayss();
}