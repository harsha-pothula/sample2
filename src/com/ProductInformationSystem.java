package com;

public class ProductInformationSystem {
	ProductDB productDB;
	public PoductInformationSystem(ProductDB productDB) {
		this.productDB=productDB;
	}
	public Product getProductInfo(int productID) {
		return productDB.getProduct(productID);
	}

}
