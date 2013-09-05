package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllUserinfos", query = "select myUserinfo from Userinfo myUserinfo"),
		@NamedQuery(name = "findUserinfoByAddress", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.address = ?1"),
		@NamedQuery(name = "findUserinfoByAddressContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.address like ?1"),
		@NamedQuery(name = "findUserinfoByBirthday", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.birthday = ?1"),
		@NamedQuery(name = "findUserinfoByBirthdayAfter", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.birthday > ?1"),
		@NamedQuery(name = "findUserinfoByBirthdayBefore", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.birthday < ?1"),
		@NamedQuery(name = "findUserinfoByEmail", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.email = ?1"),
		@NamedQuery(name = "findUserinfoByEmailContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.email like ?1"),
		@NamedQuery(name = "findUserinfoByFirstname", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.firstname = ?1"),
		@NamedQuery(name = "findUserinfoByFirstnameContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.firstname like ?1"),
		@NamedQuery(name = "findUserinfoByGender", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.gender = ?1"),
		@NamedQuery(name = "findUserinfoByGenderContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.gender like ?1"),
		@NamedQuery(name = "findUserinfoById", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.id = ?1"),
		@NamedQuery(name = "findUserinfoByPassword", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.password = ?1"),
		@NamedQuery(name = "findUserinfoByPasswordContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.password like ?1"),
		@NamedQuery(name = "findUserinfoByPhone", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.phone = ?1"),
		@NamedQuery(name = "findUserinfoByPhoneContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.phone like ?1"),
		@NamedQuery(name = "findUserinfoByPostcode", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.postcode = ?1"),
		@NamedQuery(name = "findUserinfoByPostcodeContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.postcode like ?1"),
		@NamedQuery(name = "findUserinfoByPrimaryKey", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.id = ?1"),
		@NamedQuery(name = "findUserinfoBySecondname", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.secondname = ?1"),
		@NamedQuery(name = "findUserinfoBySecondnameContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.secondname like ?1"),
		@NamedQuery(name = "findUserinfoByUsername", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.username = ?1"),
		@NamedQuery(name = "findUserinfoByUsernameContaining", query = "select myUserinfo from Userinfo myUserinfo where myUserinfo.username like ?1") })
@Table(catalog = "eshopdemo", name = "userinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "t11/com/lqf/eshopdemo/domain", name = "Userinfo")
@XmlRootElement(namespace = "t11/com/lqf/eshopdemo/domain")
public class Userinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "username", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;
	/**
	 */

	@Column(name = "password", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 */

	@Column(name = "firstname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstname;
	/**
	 */

	@Column(name = "secondname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String secondname;
	/**
	 */

	@Column(name = "gender", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String gender;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar birthday;
	/**
	 */

	@Column(name = "email", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "address", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */

	@Column(name = "postcode", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String postcode;
	/**
	 */

	@Column(name = "phone", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String phone;

	/**
	 */
	@OneToMany(mappedBy = "userinfo", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.CustomerComment> customerComments;
	/**
	 */
	@OneToMany(mappedBy = "userinfo", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.Order> orders;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 */
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	/**
	 */
	public String getSecondname() {
		return this.secondname;
	}

	/**
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 */
	public String getGender() {
		return this.gender;
	}

	/**
	 */
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	/**
	 */
	public Calendar getBirthday() {
		return this.birthday;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 */
	public String getPostcode() {
		return this.postcode;
	}

	/**
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 */
	public void setCustomerComments(Set<CustomerComment> customerComments) {
		this.customerComments = customerComments;
	}

	/**
	 */
	@JsonIgnore
	public Set<CustomerComment> getCustomerComments() {
		if (customerComments == null) {
			customerComments = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.CustomerComment>();
		}
		return customerComments;
	}

	/**
	 */
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	/**
	 */
	@JsonIgnore
	public Set<Order> getOrders() {
		if (orders == null) {
			orders = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.Order>();
		}
		return orders;
	}

	/**
	 */
	public Userinfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Userinfo that) {
		setId(that.getId());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setFirstname(that.getFirstname());
		setSecondname(that.getSecondname());
		setGender(that.getGender());
		setBirthday(that.getBirthday());
		setEmail(that.getEmail());
		setAddress(that.getAddress());
		setPostcode(that.getPostcode());
		setPhone(that.getPhone());
		setCustomerComments(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.CustomerComment>(that.getCustomerComments()));
		setOrders(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.Order>(that.getOrders()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("firstname=[").append(firstname).append("] ");
		buffer.append("secondname=[").append(secondname).append("] ");
		buffer.append("gender=[").append(gender).append("] ");
		buffer.append("birthday=[").append(birthday).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("postcode=[").append(postcode).append("] ");
		buffer.append("phone=[").append(phone).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Userinfo))
			return false;
		Userinfo equalCheck = (Userinfo) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
