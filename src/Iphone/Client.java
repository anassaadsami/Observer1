package Iphone;

 class Client {

	public static void main(String[] args) {
		Product iphone6 = new Product("Iphone-6");
		Product book = new Product("book java");
		
		Customer c1 = new Customer("anas");
		Customer c2 = new Customer("ali");
		Customer c3 = new Customer("hiba");
		
		// in this point the customers want to get notification when iphone6 is available
		// and that's why the product iphone6 add them to it's ArrayList
		iphone6.addObserver(c1);
		iphone6.addObserver(c2);
		iphone6.addObserver(c3);
		
		book.addObserver(c1);
		book.addObserver(c2);
//		book.addObserver(c3);
//		
		// after a few days the iphone6 field available changed to true 
		// so automatically send notification to all Arrays members
		iphone6.setAvailable(true);
		book.setAvailable(true);
		

	}

}
