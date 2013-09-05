package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllOrders", query = "select myOrder from Order myOrder"),
		@NamedQuery(name = "findOrderByAddress", query = "select myOrder from Order myOrder where myOrder.address = ?1"),
		@NamedQuery(name = "findOrderByAddressContaining", query = "select myOrder from Order myOrder where myOrder.address like ?1"),
		@NamedQuery(name = "findOrderById", query = "select myOrder from Order myOrder where myOrder.id = ?1"),
		@NamedQuery(name = "findOrderByPayway", query = "select myOrder from Order myOrder where myOrder.payway = ?1"),
		@NamedQuery(name = "findOrderByPaywayContaining", query = "select myOrder from Order myOrder where myOrder.payway like ?1"),
		@NamedQuery(name = "findOrderByPhone", query = "select myOrder from Order myOrder where myOrder.phone = ?1"),
		@NamedQuery(name = "findOrderByPhoneContaining", query = "select myOrder from Order myOrder where myOrder.phone like ?1"),
		@NamedQuery(name = "findOrderByPrimaryKey", query = "select myOrder from Order myOrder where myOrder.id = ?1") })
@Table(catalog = "eshopdemo", name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "t11/com/lqf/eshopdemo/domain", name = "Order")
@XmlRootElement(namespace = "t11/com/lqf/eshopdemo/domain")
public class Order implements Serializable {
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

	@Column(name = "address", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */

	@Column(name = "phone", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String phone;
	/**
	 */

	@Column(name = "payway", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String payway;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Userinfo userinfo;
	/**
	 */
	@OneToMany(mappedBy = "order", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.OrderItems> orderItemses;

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
	public void setPayway(String payway) {
		this.payway = payway;
	}

	/**
	 */
	public String getPayway() {
		return this.payway;
	}

	/**
	 */
	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	/**
	 */
	@JsonIgnore
	public Userinfo getUserinfo() {
		return userinfo;
	}

	/**
	 */
	public void setOrderItemses(Set<OrderItems> orderItemses) {
		this.orderItemses = orderItemses;
	}

	/**
	 */
	@JsonIgnore
	public Set<OrderItems> getOrderItemses() {
		if (orderItemses == null) {
			orderItemses = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.OrderItems>();
		}
		return orderItemses;
	}

	/**
	 */
	public Order() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Order that) {
		setId(that.getId());
		setAddress(that.getAddress());
		setPhone(that.getPhone());
		setPayway(that.getPayway());
		setUserinfo(that.getUserinfo());
		setOrderItemses(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.OrderItems>(that.getOrderItemses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("phone=[").append(phone).append("] ");
		buffer.append("payway=[").append(payway).append("] ");

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
		if (!(obj instanceof Order))
			return false;
		Order equalCheck = (Order) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
