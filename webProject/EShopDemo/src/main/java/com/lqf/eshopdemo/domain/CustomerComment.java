package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */
@IdClass(com.lqf.eshopdemo.domain.CustomerCommentPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllCustomerComments", query = "select myCustomerComment from CustomerComment myCustomerComment"),
		@NamedQuery(name = "findCustomerCommentByComment", query = "select myCustomerComment from CustomerComment myCustomerComment where myCustomerComment.comment = ?1"),
		@NamedQuery(name = "findCustomerCommentByCommentContaining", query = "select myCustomerComment from CustomerComment myCustomerComment where myCustomerComment.comment like ?1"),
		@NamedQuery(name = "findCustomerCommentByPrimaryKey", query = "select myCustomerComment from CustomerComment myCustomerComment where myCustomerComment.proId = ?1 and myCustomerComment.userId = ?2"),
		@NamedQuery(name = "findCustomerCommentByProId", query = "select myCustomerComment from CustomerComment myCustomerComment where myCustomerComment.proId = ?1"),
		@NamedQuery(name = "findCustomerCommentByRate", query = "select myCustomerComment from CustomerComment myCustomerComment where myCustomerComment.rate = ?1"),
		@NamedQuery(name = "findCustomerCommentByUserId", query = "select myCustomerComment from CustomerComment myCustomerComment where myCustomerComment.userId = ?1") })
@Table(catalog = "eshopdemo", name = "customer_comment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "t11/com/lqf/eshopdemo/domain", name = "CustomerComment")
public class CustomerComment implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "pro_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer proId;
	/**
	 */

	@Column(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer userId;
	/**
	 */

	@Column(name = "rate")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer rate;
	/**
	 */

	@Column(name = "comment", length = 9999)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String comment;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	Userinfo userinfo;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "pro_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	ProductDetail productDetail;

	/**
	 */
	public void setProId(Integer proId) {
		this.proId = proId;
	}

	/**
	 */
	public Integer getProId() {
		return this.proId;
	}

	/**
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	/**
	 */
	public Integer getRate() {
		return this.rate;
	}

	/**
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 */
	public String getComment() {
		return this.comment;
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
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	/**
	 */
	@JsonIgnore
	public ProductDetail getProductDetail() {
		return productDetail;
	}

	/**
	 */
	public CustomerComment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(CustomerComment that) {
		setProId(that.getProId());
		setUserId(that.getUserId());
		setRate(that.getRate());
		setComment(that.getComment());
		setUserinfo(that.getUserinfo());
		setProductDetail(that.getProductDetail());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("proId=[").append(proId).append("] ");
		buffer.append("userId=[").append(userId).append("] ");
		buffer.append("rate=[").append(rate).append("] ");
		buffer.append("comment=[").append(comment).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((proId == null) ? 0 : proId.hashCode()));
		result = (int) (prime * result + ((userId == null) ? 0 : userId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof CustomerComment))
			return false;
		CustomerComment equalCheck = (CustomerComment) obj;
		if ((proId == null && equalCheck.proId != null) || (proId != null && equalCheck.proId == null))
			return false;
		if (proId != null && !proId.equals(equalCheck.proId))
			return false;
		if ((userId == null && equalCheck.userId != null) || (userId != null && equalCheck.userId == null))
			return false;
		if (userId != null && !userId.equals(equalCheck.userId))
			return false;
		return true;
	}
}
