package com.cg.customer.product.projections;

public interface CustomerProjection {

	
	public String getName();
	
	public String getEmail();
	
	ProductRs getProduct();
	
	interface ProductRs {
		public String getProductName();
		
		public int getQty();
		
		public int getPrice();
	}
}
