package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Userinfo;

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
 * DAO to manage Userinfo entities.
 * 
 */
@Repository("UserinfoDAO")
@Transactional
public class UserinfoDAOImpl extends AbstractJpaDao<Userinfo> implements
		UserinfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Userinfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql
	 *
	 */
	@PersistenceContext(unitName = "mysql")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UserinfoDAOImpl
	 *
	 */
	public UserinfoDAOImpl() {
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
	 * JPQL Query - findUserinfoByPostcode
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByPostcode(String postcode) throws DataAccessException {

		return findUserinfoByPostcode(postcode, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPostcode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByPostcode(String postcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByPostcode", startResult, maxRows, postcode);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByFirstnameContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByFirstnameContaining(String firstname) throws DataAccessException {

		return findUserinfoByFirstnameContaining(firstname, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByFirstnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByFirstnameContaining(String firstname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByFirstnameContaining", startResult, maxRows, firstname);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserinfos
	 *
	 */
	@Transactional
	public Set<Userinfo> findAllUserinfos() throws DataAccessException {

		return findAllUserinfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserinfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findAllUserinfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserinfos", startResult, maxRows);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByGenderContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByGenderContaining(String gender) throws DataAccessException {

		return findUserinfoByGenderContaining(gender, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByGenderContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByGenderContaining(String gender, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByGenderContaining", startResult, maxRows, gender);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoBySecondname
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoBySecondname(String secondname) throws DataAccessException {

		return findUserinfoBySecondname(secondname, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoBySecondname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoBySecondname(String secondname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoBySecondname", startResult, maxRows, secondname);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByPrimaryKey
	 *
	 */
	@Transactional
	public Userinfo findUserinfoByPrimaryKey(Integer id) throws DataAccessException {

		return findUserinfoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPrimaryKey
	 *
	 */

	@Transactional
	public Userinfo findUserinfoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserinfoByPrimaryKey", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Userinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserinfoByPostcodeContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByPostcodeContaining(String postcode) throws DataAccessException {

		return findUserinfoByPostcodeContaining(postcode, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPostcodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByPostcodeContaining(String postcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByPostcodeContaining", startResult, maxRows, postcode);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByBirthdayAfter
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByBirthdayAfter(java.util.Calendar birthday) throws DataAccessException {

		return findUserinfoByBirthdayAfter(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByBirthdayAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByBirthdayAfter(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByBirthdayAfter", startResult, maxRows, birthday);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByPassword
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByPassword(String password) throws DataAccessException {

		return findUserinfoByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByUsername
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByUsername(String username) throws DataAccessException {

		return findUserinfoByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByUsername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByPhone
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByPhone(String phone) throws DataAccessException {

		return findUserinfoByPhone(phone, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByPhone(String phone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByPhone", startResult, maxRows, phone);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByBirthday
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByBirthday(java.util.Calendar birthday) throws DataAccessException {

		return findUserinfoByBirthday(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByBirthday
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByBirthday(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByBirthday", startResult, maxRows, birthday);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByPhoneContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByPhoneContaining(String phone) throws DataAccessException {

		return findUserinfoByPhoneContaining(phone, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByPhoneContaining(String phone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByPhoneContaining", startResult, maxRows, phone);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByGender
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByGender(String gender) throws DataAccessException {

		return findUserinfoByGender(gender, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByGender
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByGender(String gender, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByGender", startResult, maxRows, gender);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByPasswordContaining(String password) throws DataAccessException {

		return findUserinfoByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByAddress
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByAddress(String address) throws DataAccessException {

		return findUserinfoByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByBirthdayBefore
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByBirthdayBefore(java.util.Calendar birthday) throws DataAccessException {

		return findUserinfoByBirthdayBefore(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByBirthdayBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByBirthdayBefore(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByBirthdayBefore", startResult, maxRows, birthday);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByAddressContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByAddressContaining(String address) throws DataAccessException {

		return findUserinfoByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoBySecondnameContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoBySecondnameContaining(String secondname) throws DataAccessException {

		return findUserinfoBySecondnameContaining(secondname, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoBySecondnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoBySecondnameContaining(String secondname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoBySecondnameContaining", startResult, maxRows, secondname);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByUsernameContaining(String username) throws DataAccessException {

		return findUserinfoByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByUsernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByEmail
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByEmail(String email) throws DataAccessException {

		return findUserinfoByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoById
	 *
	 */
	@Transactional
	public Userinfo findUserinfoById(Integer id) throws DataAccessException {

		return findUserinfoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoById
	 *
	 */

	@Transactional
	public Userinfo findUserinfoById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserinfoById", startResult, maxRows, id);
			return (com.lqf.eshopdemo.domain.Userinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserinfoByEmailContaining
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByEmailContaining(String email) throws DataAccessException {

		return findUserinfoByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserinfoByFirstname
	 *
	 */
	@Transactional
	public Set<Userinfo> findUserinfoByFirstname(String firstname) throws DataAccessException {

		return findUserinfoByFirstname(firstname, -1, -1);
	}

	/**
	 * JPQL Query - findUserinfoByFirstname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Userinfo> findUserinfoByFirstname(String firstname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserinfoByFirstname", startResult, maxRows, firstname);
		return new LinkedHashSet<Userinfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Userinfo entity) {
		return true;
	}
}
