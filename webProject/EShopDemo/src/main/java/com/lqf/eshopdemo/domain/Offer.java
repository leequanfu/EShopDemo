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
		@NamedQuery(name = "findAllOffers", query = "select myOffer from Offer myOffer"),
		@NamedQuery(name = "findOfferByDescription", query = "select myOffer from Offer myOffer where myOffer.description = ?1"),
		@NamedQuery(name = "findOfferByDescriptionContaining", query = "select myOffer from Offer myOffer where myOffer.description like ?1"),
		@NamedQuery(name = "findOfferById", query = "select myOffer from Offer myOffer where myOffer.id = ?1"),
		@NamedQuery(name = "findOfferByPrimaryKey", query = "select myOffer from Offer myOffer where myOffer.id = ?1") })
@Table(catalog = "EShopDemo", name = "offer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EShopDemo/com/lqf/eshopdemo/domain", name = "Offer")
@XmlRootElement(namespace = "EShopDemo/com/lqf/eshopdemo/domain")
public class Offer implements Serializable {
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

	@Column(name = "description", length = 1000, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;

	/**
	 */
	@OneToMany(mappedBy = "offer", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.ProductOffer> productOffers;

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
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setProductOffers(Set<ProductOffer> productOffers) {
		this.productOffers = productOffers;
	}

	/**
	 */
	@JsonIgnore
	public Set<ProductOffer> getProductOffers() {
		if (productOffers == null) {
			productOffers = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductOffer>();
		}
		return productOffers;
	}

	/**
	 */
	public Offer() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Offer that) {
		setId(that.getId());
		setDescription(that.getDescription());
		setProductOffers(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductOffer>(that.getProductOffers()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("description=[").append(description).append("] ");

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
		if (!(obj instanceof Offer))
			return false;
		Offer equalCheck = (Offer) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
