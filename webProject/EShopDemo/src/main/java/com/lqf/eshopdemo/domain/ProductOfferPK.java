package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class ProductOfferPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public ProductOfferPK() {
	}

	/**
	 */

	@Column(name = "pro_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer proId;
	/**
	 */

	@Column(name = "offer_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer offerId;

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
	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	/**
	 */
	public Integer getOfferId() {
		return this.offerId;
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((proId == null) ? 0 : proId.hashCode()));
		result = (int) (prime * result + ((offerId == null) ? 0 : offerId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductOfferPK))
			return false;
		ProductOfferPK equalCheck = (ProductOfferPK) obj;
		if ((proId == null && equalCheck.proId != null) || (proId != null && equalCheck.proId == null))
			return false;
		if (proId != null && !proId.equals(equalCheck.proId))
			return false;
		if ((offerId == null && equalCheck.offerId != null) || (offerId != null && equalCheck.offerId == null))
			return false;
		if (offerId != null && !offerId.equals(equalCheck.offerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ProductOfferPK");
		sb.append(" proId: ").append(getProId());
		sb.append(" offerId: ").append(getOfferId());
		return sb.toString();
	}
}
