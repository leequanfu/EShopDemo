package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */
@IdClass(com.lqf.eshopdemo.domain.OrderItemsPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllOrderItemss", query = "select myOrderItems from OrderItems myOrderItems"),
		@NamedQuery(name = "findOrderItemsByOrderId", query = "select myOrderItems from OrderItems myOrderItems where myOrderItems.orderId = ?1"),
		@NamedQuery(name = "findOrderItemsByPrice", query = "select myOrderItems from OrderItems myOrderItems where myOrderItems.price = ?1"),
		@NamedQuery(name = "findOrderItemsByPrimaryKey", query = "select myOrderItems from OrderItems myOrderItems where myOrderItems.orderId = ?1 and myOrderItems.productId = ?2"),
		@NamedQuery(name = "findOrderItemsByProductId", query = "select myOrderItems from OrderItems myOrderItems where myOrderItems.productId = ?1"),
		@NamedQuery(name = "findOrderItemsByQuality", query = "select myOrderItems from OrderItems myOrderItems where myOrderItems.quality = ?1") })
@Table(catalog = "EShopDemo", name = "order_items")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EShopDemo/com/lqf/eshopdemo/domain", name = "OrderItems")
public class OrderItems implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "order_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer orderId;
	/**
	 */

	@Column(name = "product_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer productId;
	/**
	 */

	@Column(name = "price", precision = 12)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal price;
	/**
	 */

	@Column(name = "quality")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer quality;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	Order order;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	ProductDetail productDetail;

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
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 */
	public BigDecimal getPrice() {
		return this.price;
	}

	/**
	 */
	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	/**
	 */
	public Integer getQuality() {
		return this.quality;
	}

	/**
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 */
	@JsonIgnore
	public Order getOrder() {
		return order;
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
	public OrderItems() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(OrderItems that) {
		setOrderId(that.getOrderId());
		setProductId(that.getProductId());
		setPrice(that.getPrice());
		setQuality(that.getQuality());
		setOrder(that.getOrder());
		setProductDetail(that.getProductDetail());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("orderId=[").append(orderId).append("] ");
		buffer.append("productId=[").append(productId).append("] ");
		buffer.append("price=[").append(price).append("] ");
		buffer.append("quality=[").append(quality).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof OrderItems))
			return false;
		OrderItems equalCheck = (OrderItems) obj;
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
}
