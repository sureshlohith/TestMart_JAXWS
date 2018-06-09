/**
 * 
 */
package org.suresh.jaxws.model;

/**
 * @author Administrator
 *
 */
public class Product {
	private String name;
	private double sku;
	private double price;

	/**
	 * @param name
	 * @param sku
	 * @param price
	 */
	public Product(String name, double sku, double price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sku
	 */
	public double getSku() {
		return sku;
	}

	/**
	 * @param sku
	 *            the sku to set
	 */
	public void setSku(double sku) {
		this.sku = sku;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
