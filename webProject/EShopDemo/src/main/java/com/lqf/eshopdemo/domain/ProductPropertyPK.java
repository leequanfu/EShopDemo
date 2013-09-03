package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class ProductPropertyPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public ProductPropertyPK() {
	}

	/**
	 */

	@Column(name = "pro_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer proId;
	/**
	 */

	@Column(name = "key", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public String key;

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
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((proId == null) ? 0 : proId.hashCode()));
		result = (int) (prime * result + ((key == null) ? 0 : key.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductPropertyPK))
			return false;
		ProductPropertyPK equalCheck = (ProductPropertyPK) obj;
		if ((proId == null && equalCheck.proId != null) || (proId != null && equalCheck.proId == null))
			return false;
		if (proId != null && !proId.equals(equalCheck.proId))
			return false;
		if ((key == null && equalCheck.key != null) || (key != null && equalCheck.key == null))
			return false;
		if (key != null && !key.equals(equalCheck.key))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ProductPropertyPK");
		sb.append(" proId: ").append(getProId());
		sb.append(" key: ").append(getKey());
		return sb.toString();
	}
}
