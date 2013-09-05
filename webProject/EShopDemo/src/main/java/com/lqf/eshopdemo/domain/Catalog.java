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
		@NamedQuery(name = "findAllCatalogs", query = "select myCatalog from Catalog myCatalog"),
		@NamedQuery(name = "findCatalogById", query = "select myCatalog from Catalog myCatalog where myCatalog.id = ?1"),
		@NamedQuery(name = "findCatalogByName", query = "select myCatalog from Catalog myCatalog where myCatalog.name = ?1"),
		@NamedQuery(name = "findCatalogByNameContaining", query = "select myCatalog from Catalog myCatalog where myCatalog.name like ?1"),
		@NamedQuery(name = "findCatalogByPrimaryKey", query = "select myCatalog from Catalog myCatalog where myCatalog.id = ?1") })
@Table(catalog = "eshopdemo", name = "catalog")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "t11/com/lqf/eshopdemo/domain", name = "Catalog")
@XmlRootElement(namespace = "t11/com/lqf/eshopdemo/domain")
public class Catalog implements Serializable {
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

	@Column(name = "name", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;

	/**
	 */
	@OneToMany(mappedBy = "catalog", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.lqf.eshopdemo.domain.ProductCatalog> productCatalogs;

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
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
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
	public Catalog() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Catalog that) {
		setId(that.getId());
		setName(that.getName());
		setProductCatalogs(new java.util.LinkedHashSet<com.lqf.eshopdemo.domain.ProductCatalog>(that.getProductCatalogs()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");

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
		if (!(obj instanceof Catalog))
			return false;
		Catalog equalCheck = (Catalog) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
