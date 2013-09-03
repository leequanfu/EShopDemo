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
@IdClass(com.lqf.eshopdemo.domain.ProductPropertyPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllProductPropertys", query = "select myProductProperty from ProductProperty myProductProperty"),
		@NamedQuery(name = "findProductPropertyByKey", query = "select myProductProperty from ProductProperty myProductProperty where myProductProperty.key = ?1"),
		@NamedQuery(name = "findProductPropertyByKeyContaining", query = "select myProductProperty from ProductProperty myProductProperty where myProductProperty.key like ?1"),
		@NamedQuery(name = "findProductPropertyByPrimaryKey", query = "select myProductProperty from ProductProperty myProductProperty where myProductProperty.proId = ?1 and myProductProperty.key = ?2"),
		@NamedQuery(name = "findProductPropertyByProId", query = "select myProductProperty from ProductProperty myProductProperty where myProductProperty.proId = ?1"),
		@NamedQuery(name = "findProductPropertyByValue", query = "select myProductProperty from ProductProperty myProductProperty where myProductProperty.value = ?1"),
		@NamedQuery(name = "findProductPropertyByValueContaining", query = "select myProductProperty from ProductProperty myProductProperty where myProductProperty.value like ?1") })
@Table(catalog = "EShopDemo", name = "product_property")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EShopDemo/com/lqf/eshopdemo/domain", name = "ProductProperty")
public class ProductProperty implements Serializable {
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

	@Column(name = "key", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	String key;
	/**
	 */

	@Column(name = "value", length = 500)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String value;

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
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 */
	public String getValue() {
		return this.value;
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
	public ProductProperty() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductProperty that) {
		setProId(that.getProId());
		setKey(that.getKey());
		setValue(that.getValue());
		setProductDetail(that.getProductDetail());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("proId=[").append(proId).append("] ");
		buffer.append("key=[").append(key).append("] ");
		buffer.append("value=[").append(value).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof ProductProperty))
			return false;
		ProductProperty equalCheck = (ProductProperty) obj;
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
}
