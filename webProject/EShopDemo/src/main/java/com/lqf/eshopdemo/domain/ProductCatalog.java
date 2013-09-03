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
@IdClass(com.lqf.eshopdemo.domain.ProductCatalogPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllProductCatalogs", query = "select myProductCatalog from ProductCatalog myProductCatalog"),
		@NamedQuery(name = "findProductCatalogByCatalogId", query = "select myProductCatalog from ProductCatalog myProductCatalog where myProductCatalog.catalogId = ?1"),
		@NamedQuery(name = "findProductCatalogByPrimaryKey", query = "select myProductCatalog from ProductCatalog myProductCatalog where myProductCatalog.productId = ?1 and myProductCatalog.catalogId = ?2"),
		@NamedQuery(name = "findProductCatalogByProductId", query = "select myProductCatalog from ProductCatalog myProductCatalog where myProductCatalog.productId = ?1") })
@Table(catalog = "EShopDemo", name = "product_catalog")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EShopDemo/com/lqf/eshopdemo/domain", name = "ProductCatalog")
public class ProductCatalog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "product_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer productId;
	/**
	 */

	@Column(name = "catalog_id")
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer catalogId;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "catalog_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	Catalog catalog;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false) })
	@XmlTransient
	ProductDetail productDetail;

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
	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	/**
	 */
	@JsonIgnore
	public Catalog getCatalog() {
		return catalog;
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
	public ProductCatalog() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductCatalog that) {
		setProductId(that.getProductId());
		setCatalogId(that.getCatalogId());
		setCatalog(that.getCatalog());
		setProductDetail(that.getProductDetail());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("productId=[").append(productId).append("] ");
		buffer.append("catalogId=[").append(catalogId).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof ProductCatalog))
			return false;
		ProductCatalog equalCheck = (ProductCatalog) obj;
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
}
