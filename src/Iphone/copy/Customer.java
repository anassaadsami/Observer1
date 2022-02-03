package Iphone.copy;

public class Customer implements Observer{
	private String name ;
	private Product product  ;   // reference variable

	public Customer(String name) {
		this.name = name;

	}
	// we can say this is the process that customer have knowledge about this product which he cares about
	public void subscribeProduct(Product product) {  
		this.product = product;
	}
	
	@Override
	public void update() {  
		System.out.printf("hi %s the %s is available in store.%n",this.name,product.productName);   
		
	}


}
