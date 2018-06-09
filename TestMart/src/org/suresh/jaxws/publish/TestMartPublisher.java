package org.suresh.jaxws.publish;
import javax.xml.ws.Endpoint;

import org.suresh.jaxws.product.ProductCatalog;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class TestMartPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:12345/TestMartCatalogService", new ProductCatalog());
	}

}
