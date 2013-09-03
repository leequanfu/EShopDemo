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
	 * Delete an existing Payways entity
	 * 
	 */
	public void deletePayways(Payways payways);

	/**
	 * Save an existing Payways entity
	 * 
	 */
	public void savePayways(Payways payways_1);

	/**
	 */
	public Payways findPaywaysByPrimaryKey(String way);

	/**
	 * Return all Payways entity
	 * 
	 */
	public List<Payways> findAllPaywayss(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Payways entity
	 * 
	 */
	public Set<Payways> loadPaywayss();

	/**
	 * Return a count of all Payways entity
	 * 
	 */
	public Integer countPaywayss();
}