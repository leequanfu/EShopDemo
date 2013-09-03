package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class CustomerCommentPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public CustomerCommentPK() {
	}

	/**
	 */

	@Column(name = "pro_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer proId;
	/**
	 */

	@Column(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer userId;

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
		if (!(obj instanceof CustomerCommentPK))
			return false;
		CustomerCommentPK equalCheck = (CustomerCommentPK) obj;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("CustomerCommentPK");
		sb.append(" proId: ").append(getProId());
		sb.append(" userId: ").append(getUserId());
		return sb.toString();
	}
}
