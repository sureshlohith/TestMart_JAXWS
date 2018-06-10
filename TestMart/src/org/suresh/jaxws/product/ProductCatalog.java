/**
 * 
 */
package org.suresh.jaxws.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.suresh.jaxws.model.Product;
import org.suresh.jaxws.product.business.ProductServiceImpl;

/**
 * @author Administrator
 *
 */
@WebService(endpointInterface="org.suresh.jaxws.product.ProductCatalogPort",portName = "testmartcatalogport",serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogPort {

	ProductServiceImpl pimpl = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.suresh.jaxws.product.ProductCatalogPort#getProductCategories()
	 */
	@Override

	public List<String> getProductCategories() {
		return pimpl.getProdcutCategories();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.suresh.jaxws.product.ProductCatalogPort#getProducts(java.lang.String)
	 */
	@Override

	public List<String> getProducts(String categorie) {
		return pimpl.getProducts(categorie);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.suresh.jaxws.product.ProductCatalogPort#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override

	public String addProduct(String categorie, String item) {
		return pimpl.addproduct(categorie, item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.suresh.jaxws.product.ProductCatalogPort#getProductsv2(java.lang.String)
	 */
	@Override

	public List<Product> getProductsv2(String categorie) {
		return pimpl.getProductsv2(categorie);
	}
}
