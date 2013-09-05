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
@IdClass(com.lqf.eshopdemo.domain.ProductOfferPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllProductOffers", query = "select myProductOffer from ProductOffer myProductOffer"),
		@NamedQuery(name = "findProductOfferByOfferId", query = "select myProductOffer from ProductOffer myProductOffer where myProductOffer.offerId = ?1"),
		@NamedQuery(name = "findProductOfferByPrimaryKey", query = "select myProductOffer from ProductOffer myProductOffer where myProductOffer.proId = ?1 and myProductOffer.offerId = ?2"),
		@NamedQuery(name = "findProductOfferByProId", query = "select myProductOffer from ProductOffer myProductOffer where myProductOffer.proId = ?1") })
@Table(catalog = "eshopdemo", name = "product_offer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "t11/com/lqf/eshopdemo/domain", name = "ProductOffer")
public class ProductOffer implements Serializable {
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

	@Column(name = "offer_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer offerId;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "offer_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	Offer offer;
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
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	/**
	 */
	@JsonIgnore
	public Offer getOffer() {
		return offer;
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
	public ProductOffer() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductOffer that) {
		setProId(that.getProId());
		setOfferId(that.getOfferId());
		setOffer(that.getOffer());
		setProductDetail(that.getProductDetail());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("proId=[").append(proId).append("] ");
		buffer.append("offerId=[").append(offerId).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof ProductOffer))
			return false;
		ProductOffer equalCheck = (ProductOffer) obj;
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
}
