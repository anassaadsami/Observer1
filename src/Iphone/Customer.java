package Iphone;

 class Customer implements Observer{
	private String name ;
//	private Product product ;   // why i need this

	public Customer(String name) {
		this.name = name;
//		this.product = new Product("Iphone-6");   // we don't need it
	}
	/*
	 *  in this case the Customer have not connect with product but when Product call this update() method we access the product name in it
	 */
	@Override
	public void update(String productName) {  
		System.out.printf("hi %s the %s is available in store.%n",this.name, productName);   // not this.product.name    error
		
	}


}
