package com.lqf.eshopdemo.dao;

import com.lqf.eshopdemo.domain.Userinfo;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Userinfo entities.
 * 
 */
public interface UserinfoDAO extends JpaDao<Userinfo> {

	/**
	 * JPQL Query - findUserinfoBySecondname
	 *
	 */
	public Set<Userinfo> findUserinfoBySecondname(String secondname) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoBySecondname
	 *
	 */
	public Set<Userinfo> findUserinfoBySecondname(String secondname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByGender
	 *
	 */
	public Set<Userinfo> findUserinfoByGender(String gender) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByGender
	 *
	 */
	public Set<Userinfo> findUserinfoByGender(String gender, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPostcode
	 *
	 */
	public Set<Userinfo> findUserinfoByPostcode(String postcode) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPostcode
	 *
	 */
	public Set<Userinfo> findUserinfoByPostcode(String postcode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByGenderContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByGenderContaining(String gender_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByGenderContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByGenderContaining(String gender_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByUsernameContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByUsernameContaining(String username) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByUsernameContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPostcodeContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByPostcodeContaining(String postcode_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPostcodeContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByPostcodeContaining(String postcode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByUsername
	 *
	 */
	public Set<Userinfo> findUserinfoByUsername(String username_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByUsername
	 *
	 */
	public Set<Userinfo> findUserinfoByUsername(String username_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPasswordContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPasswordContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByBirthday
	 *
	 */
	public Set<Userinfo> findUserinfoByBirthday(java.util.Calendar birthday) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByBirthday
	 *
	 */
	public Set<Userinfo> findUserinfoByBirthday(Calendar birthday, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByFirstnameContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByFirstnameContaining(String firstname) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByFirstnameContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByFirstnameContaining(String firstname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByFirstname
	 *
	 */
	public Set<Userinfo> findUserinfoByFirstname(String firstname_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByFirstname
	 *
	 */
	public Set<Userinfo> findUserinfoByFirstname(String firstname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoBySecondnameContaining
	 *
	 */
	public Set<Userinfo> findUserinfoBySecondnameContaining(String secondname_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoBySecondnameContaining
	 *
	 */
	public Set<Userinfo> findUserinfoBySecondnameContaining(String secondname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByAddress
	 *
	 */
	public Set<Userinfo> findUserinfoByAddress(String address) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByAddress
	 *
	 */
	public Set<Userinfo> findUserinfoByAddress(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByAddressContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByAddressContaining(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByAddressContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByAddressContaining(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserinfos
	 *
	 */
	public Set<Userinfo> findAllUserinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserinfos
	 *
	 */
	public Set<Userinfo> findAllUserinfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByBirthdayAfter
	 *
	 */
	public Set<Userinfo> findUserinfoByBirthdayAfter(java.util.Calendar birthday_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByBirthdayAfter
	 *
	 */
	public Set<Userinfo> findUserinfoByBirthdayAfter(Calendar birthday_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByEmailContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByEmailContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPhone
	 *
	 */
	public Set<Userinfo> findUserinfoByPhone(String phone) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPhone
	 *
	 */
	public Set<Userinfo> findUserinfoByPhone(String phone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByEmail
	 *
	 */
	public Set<Userinfo> findUserinfoByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByEmail
	 *
	 */
	public Set<Userinfo> findUserinfoByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPrimaryKey
	 *
	 */
	public Userinfo findUserinfoByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPrimaryKey
	 *
	 */
	public Userinfo findUserinfoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPhoneContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByPhoneContaining(String phone_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPhoneContaining
	 *
	 */
	public Set<Userinfo> findUserinfoByPhoneContaining(String phone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPassword
	 *
	 */
	public Set<Userinfo> findUserinfoByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByPassword
	 *
	 */
	public Set<Userinfo> findUserinfoByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByBirthdayBefore
	 *
	 */
	public Set<Userinfo> findUserinfoByBirthdayBefore(java.util.Calendar birthday_2) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoByBirthdayBefore
	 *
	 */
	public Set<Userinfo> findUserinfoByBirthdayBefore(Calendar birthday_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoById
	 *
	 */
	public Userinfo findUserinfoById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserinfoById
	 *
	 */
	public Userinfo findUserinfoById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}