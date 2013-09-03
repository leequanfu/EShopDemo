package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.CustomerComment;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CustomerComment entities.
 * 
 */
public interface CustomerCommentDAO extends JpaDao<CustomerComment> {

	/**
	 * JPQL Query - findCustomerCommentByUserId
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByUserId(Integer userId) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByUserId
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomerComments
	 *
	 */
	public Set<CustomerComment> findAllCustomerComments() throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomerComments
	 *
	 */
	public Set<CustomerComment> findAllCustomerComments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByComment
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByComment(String comment) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByComment
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByComment(String comment, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByProId
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByProId(Integer proId) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByProId
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByProId(Integer proId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByRate
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByRate(Integer rate) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByRate
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByRate(Integer rate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByPrimaryKey
	 *
	 */
	public CustomerComment findCustomerCommentByPrimaryKey(Integer proId_1, Integer userId_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByPrimaryKey
	 *
	 */
	public CustomerComment findCustomerCommentByPrimaryKey(Integer proId_1, Integer userId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByCommentContaining
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByCommentContaining(String comment_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerCommentByCommentContaining
	 *
	 */
	public Set<CustomerComment> findCustomerCommentByCommentContaining(String comment_1, int startResult, int maxRows) throws DataAccessException;

}