package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class ProductCatalogPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public ProductCatalogPK() {
	}

	/**
	 */

	@Column(name = "product_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer productId;
	/**
	 */

	@Column(name = "catalog_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer catalogId;

	/**
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 */
	public Integer getProductId() {
		return this.productId;
	}

	/**
	 */
	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	/**
	 */
	public Integer getCatalogId() {
		return this.catalogId;
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((productId == null) ? 0 : productId.hashCode()));
		result = (int) (prime * result + ((catalogId == null) ? 0 : catalogId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductCatalogPK))
			return false;
		ProductCatalogPK equalCheck = (ProductCatalogPK) obj;
		if ((productId == null && equalCheck.productId != null) || (productId != null && equalCheck.productId == null))
			return false;
		if (productId != null && !productId.equals(equalCheck.productId))
			return false;
		if ((catalogId == null && equalCheck.catalogId != null) || (catalogId != null && equalCheck.catalogId == null))
			return false;
		if (catalogId != null && !catalogId.equals(equalCheck.catalogId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ProductCatalogPK");
		sb.append(" productId: ").append(getProductId());
		sb.append(" catalogId: ").append(getCatalogId());
		return sb.toString();
	}
}
