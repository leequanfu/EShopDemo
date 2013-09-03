package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

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
		@NamedQuery(name = "findAllProductDetails", query = "select myProductDetail from ProductDetail myProductDetail"),
		@NamedQuery(name = "findProductDetailByDescription", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.description = ?1"),
		@NamedQuery(name = "findProductDetailById", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.id = ?1"),
		@NamedQuery(name = "findProductDetailByPrice", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.price = ?1"),
		@NamedQuery(name = "findProductDetailByPrimaryKey", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.id = ?1"),
		@NamedQuery(name = "findProductDetailByQuantity", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.quantity = ?1"),
		@NamedQuery(name = "findProductDetailByTitle", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.title = ?1"),
		@NamedQuery(name = "findProductDetailByTitleContaining", query = "select myProductDetail from ProductDetail myProductDetail where myProductDetail.title like ?1") })
@Table(catalog = "EShopDemo", name = "product_detail")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EShopDemo/com/lqf/eshopdemo/domain", name = "ProductDetail")
@XmlRootElement(namespace = "EShopDemo/com/lqf/eshopdemo/domain")
public class ProductDetail implements Serializable {
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

	@Column(name = "title", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String title;
	/**
	 */

	@Column(name = "price", precision = 12, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal price;
	/**
	 */

	@Column(name = "quantity")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer quantity;
	/**
	 */

	@Column(name = "description", columnDefinition = "MEDIUMTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String description;

	/**
	 */
	@OneToMany(mappedBy = "productDetail", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.ProductCatalog> productCatalogs;
	/**
	 */
	@OneToMany(mappedBy = "productDetail", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.OrderItems> orderItemses;
	/**
	 */
	@OneToMany(mappedBy = "productDetail", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.ProductOffer> productOffers;
	/**
	 */
	@OneToMany(mappedBy = "productDetail", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.CustomerComment> customerComments;
	/**
	 */
	@OneToMany(mappedBy = "productDetail", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.ProductProperty> productProperties;

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
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 */
	public String getTitle() {
		return this.title;
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
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 */
	public Integer getQuantity() {
		return this.quantity;
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
	public void setProductCatalogs(Set<ProductCatalog> productCatalogs) {
		this.productCatalogs = productCatalogs;
	}

	/**
	 */
	@JsonIgnore
	public Set<ProductCatalog> getProductCatalogs() {
		if (productCatalogs == null) {
			productCatalogs = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductCatalog>();
		}
		return productCatalogs;
	}

	/**
	 */
	public void setOrderItemses(Set<OrderItems> orderItemses) {
		this.orderItemses = orderItemses;
	}

	/**
	 */
	@JsonIgnore
	public Set<OrderItems> getOrderItemses() {
		if (orderItemses == null) {
			orderItemses = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.OrderItems>();
		}
		return orderItemses;
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
	public void setCustomerComments(Set<CustomerComment> customerComments) {
		this.customerComments = customerComments;
	}

	/**
	 */
	@JsonIgnore
	public Set<CustomerComment> getCustomerComments() {
		if (customerComments == null) {
			customerComments = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.CustomerComment>();
		}
		return customerComments;
	}

	/**
	 */
	public void setProductProperties(Set<ProductProperty> productProperties) {
		this.productProperties = productProperties;
	}

	/**
	 */
	@JsonIgnore
	public Set<ProductProperty> getProductProperties() {
		if (productProperties == null) {
			productProperties = new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductProperty>();
		}
		return productProperties;
	}

	/**
	 */
	public ProductDetail() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProductDetail that) {
		setId(that.getId());
		setTitle(that.getTitle());
		setPrice(that.getPrice());
		setQuantity(that.getQuantity());
		setDescription(that.getDescription());
		setProductCatalogs(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductCatalog>(that.getProductCatalogs()));
		setOrderItemses(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.OrderItems>(that.getOrderItemses()));
		setProductOffers(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductOffer>(that.getProductOffers()));
		setCustomerComments(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.CustomerComment>(that.getCustomerComments()));
		setProductProperties(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductProperty>(that.getProductProperties()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("title=[").append(title).append("] ");
		buffer.append("price=[").append(price).append("] ");
		buffer.append("quantity=[").append(quantity).append("] ");
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
		if (!(obj instanceof ProductDetail))
			return false;
		ProductDetail equalCheck = (ProductDetail) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
