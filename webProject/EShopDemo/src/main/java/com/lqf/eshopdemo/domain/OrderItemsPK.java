package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class OrderItemsPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public OrderItemsPK() {
	}

	/**
	 */

	@Column(name = "order_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer orderId;
	/**
	 */

	@Column(name = "product_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer productId;

	/**
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 */
	public Integer getOrderId() {
		return this.orderId;
	}

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((orderId == null) ? 0 : orderId.hashCode()));
		result = (int) (prime * result + ((productId == null) ? 0 : productId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof OrderItemsPK))
			return false;
		OrderItemsPK equalCheck = (OrderItemsPK) obj;
		if ((orderId == null && equalCheck.orderId != null) || (orderId != null && equalCheck.orderId == null))
			return false;
		if (orderId != null && !orderId.equals(equalCheck.orderId))
			return false;
		if ((productId == null && equalCheck.productId != null) || (productId != null && equalCheck.productId == null))
			return false;
		if (productId != null && !productId.equals(equalCheck.productId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("OrderItemsPK");
		sb.append(" orderId: ").append(getOrderId());
		sb.append(" productId: ").append(getProductId());
		return sb.toString();
	}
}
