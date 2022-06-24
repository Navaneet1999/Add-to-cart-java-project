package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Products {
	private final List<Product> products = new ArrayList<Product>();
	
	public Products() {
		this.initStoreItems();
	}
	
	public List<Product> getProducts(){
		return products;
	}

	
	private void initStoreItems() {
		// TODO Auto-generated method stub
		String [] productNames = {"Santoor soap","Garnier","Teju"};
		Double [] productPrice = {40.00d, 30.00d, 20.00d};
		Integer [] stock = {10, 6, 10};
		
		for(int i=0; i < productNames.length; i++) {
			this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
		}
		
	}

	
}
