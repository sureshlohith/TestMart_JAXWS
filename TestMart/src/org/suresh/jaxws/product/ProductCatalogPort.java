package org.suresh.jaxws.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.suresh.jaxws.model.Product;

@WebService(name = "testmartcatalog", targetNamespace = "http://www.suresh.java.io")
@SOAPBinding(style = Style.DOCUMENT)

public interface ProductCatalogPort {
	@WebMethod(action = "fetch_catalog", operationName = "fetchcategories", exclude = false)
	@WebResult(partName = "product categories")
	List<String> getProductCategories();

	@WebMethod(action = "fetch_products", operationName = "fetchProducts", exclude = false)
	@WebResult(partName = "categorieOutput")
	List<String> getProducts(@WebParam(partName = "categorieInput") String categorie);

	@WebMethod(action = "add_products", operationName = "addProducts", exclude = false)
	@WebResult(partName = "messageOutput")
	String addProduct(@WebParam(partName = "CategorieInput") String categorie,
			@WebParam(partName = "itemInput") String item);

	@WebMethod(action = "fetch_productsv2", operationName = "fetchProductsv2", exclude = false)
	@WebResult(partName = "categorieOutput",name="Product")
	List<Product> getProductsv2(@WebParam(partName = "categorieInput") String categorie);

}