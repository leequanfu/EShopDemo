package com.lqf.eshopdemo.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllPaywayss", query = "select myPayways from Payways myPayways"),
		@NamedQuery(name = "findPaywaysByPrimaryKey", query = "select myPayways from Payways myPayways where myPayways.way = ?1"),
		@NamedQuery(name = "findPaywaysByWay", query = "select myPayways from Payways myPayways where myPayways.way = ?1"),
		@NamedQuery(name = "findPaywaysByWayContaining", query = "select myPayways from Payways myPayways where myPayways.way like ?1") })
@Table(catalog = "eshopdemo", name = "payways")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "t11/com/lqf/eshopdemo/domain", name = "Payways")
public class Payways implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "way", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	String way;

	/**
	 */
	public void setWay(String way) {
		this.way = way;
	}

	/**
	 */
	public String getWay() {
		return this.way;
	}

	/**
	 */
	public Payways() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Payways that) {
		setWay(that.getWay());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("way=[").append(way).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((way == null) ? 0 : way.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Payways))
			return false;
		Payways equalCheck = (Payways) obj;
		if ((way == null && equalCheck.way != null) || (way != null && equalCheck.way == null))
			return false;
		if (way != null && !way.equals(equalCheck.way))
			return false;
		return true;
	}
}
