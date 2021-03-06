/*
 * PayU Latam - Copyright (c) 2013 - 2020
 * http://www.payu.com.co
 */
package com.prototype.ecommerce.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Product definition.
 *
 * @author Nicolas Garcia (nicolas.garcia@payulatam.com)
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(schema="public",name="product")
public class Product implements Serializable {

	/**
	 * Product id.
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "product_id",
			unique = true)
	private int id;

	/**
	 *  Product name.
	 */
	@Column(name = "name")
	private String name;

	/**
	 * Product description.
	 */
	@Column(name = "description")
	private String description;

	/**
	 * Units of the product available for purchase.
	 */
	@Column(name = "available_units")
	private int availableUnits;

	/**
	 * Price per unit of the product.
	 */
	@Column(name = "price")
	private float price;

	/**
	 * Public non argument constructor. Required by JPA framework.
	 */
	public Product() {
		// Do nothing.
	}

	/**
	 * Constructor of a product.
	 *
	 * @param id Id of the product.
	 * @param name Name of the product.
	 * @param description Description of the product.
	 * @param availableUnits Units available for purchase of the product.
	 * @param price Price per unit of the product.
	 */
	public Product(int id, String name, String description, int availableUnits, float price) {

		this.id = id;
		this.name = name;
		this.description = description.trim();
		this.availableUnits = availableUnits;
		this.price = price;
	}

	/**
	 * Returns the id of the product.
	 *
	 * @return Id of the product.
	 */
	public int getId() {

		return id;
	}

	/**
	 * Sets the id of the product.
	 *
	 * @param id Product id.
	 */
	public void setId(int id) {

		this.id = id;
	}

	/**
	 * Returns the name of the product.
	 *
	 * @return Name of the product.
	 */
	public String getName() {

		return name.trim();
	}

	/**
	 * Sets the name of the product.
	 *
	 * @param name Name of the product.
	 */
	public void setName(String name) {

		this.name = name;
	}

	/**
	 * Returns the description of the product.
	 *
	 * @return Description of the product.
	 */
	public String getDescription() {

		return description.trim();
	}

	/**
	 * Sets the description of the product.
	 *
	 * @param description Description of the product.
	 */
	public void setDescription(String description) {

		this.description = description;
	}

	/**
	 * Returns the units available for purchase of the product.
	 *
	 * @return Units available for purchase of the product,
	 */
	public int getAvailableUnits() {

		return availableUnits;
	}

	/**
	 * Set the units available for purchase of the product.
	 *
	 * @param units Units available for purchase of the product.
	 */
	public void setAvailableUnits(int units) {

		this.availableUnits = units;
	}

	/**
	 * Returns the price per unit of the product.
	 *
	 * @return Price per unit of the product.
	 */
	public float getPrice() {

		return price;
	}

	/**
	 * Sets the price per unit of the product.
	 *
	 * @param price Price per unit of the product.
	 */
	public void setPrice(float price) {

		this.price = price;
	}

	@Override public String toString() {

		return "Product{" +
				"id=" + id +
				", name='" + name.trim() + '\'' +
				", description='" + description.trim() + '\'' +
				", availableUnits=" + availableUnits +
				", price=" + price +
				'}';
	}

	@Override public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Product))
			return false;
		Product product = (Product) o;
		return id == product.id &&
				availableUnits == product.availableUnits &&
				Float.compare(product.price, price) == 0 &&
				Objects.equals(name, product.name) &&
				Objects.equals(description, product.description);
	}

	@Override public int hashCode() {

		return Objects.hash(id, name, description, availableUnits, price);
	}
}
