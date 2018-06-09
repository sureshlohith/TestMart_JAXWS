/**
 * 
 */
package org.suresh.jaxws.product.business;

import java.util.ArrayList;
import java.util.List;

import org.suresh.jaxws.model.Product;

/**
 * @author Administrator
 *
 */
public class ProductServiceImpl {
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();

	public ProductServiceImpl() {
		bookList.add("SPRING");
		bookList.add("HIBERNATE");
		bookList.add("WEB SERVICE");

		musicList.add("AR REHAMAN");
		musicList.add("MANI SHARMA");
		musicList.add("MM KEERAVANI");

		movieList.add("BAHUBALI");
		movieList.add("KICK");
		movieList.add("ROBO");
	}

	public List<String> getProdcutCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");

		return categories;
	}

	public List<String> getProducts(String categorie) {
		switch (categorie.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}

	public String addproduct(String categorie, String product) {
		String returnValue = null;
		switch (categorie.toLowerCase()) {
		case "books":
			bookList.add(product.toUpperCase());
			returnValue = "Your Products Added into book list";
			break;
		case "music":
			musicList.add(product.toUpperCase());
			returnValue = "Your Products Added into music list";
			break;
		case "movies":
			movieList.add(product.toUpperCase());
			returnValue = "Your Products Added into movies list";
			break;
		default:
			return "Please Pass the valid categorie to add your products";

		}
		return returnValue;
	}

	public List<Product> getProductsv2(String categorie) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Java Soap Web Services", 12345, 3000));
		productList.add(new Product("Java Rest Web Services", 123456, 5000));
		return productList;

	}
}
