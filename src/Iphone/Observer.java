package Iphone;
/* 
 *  in this method we make it take product name so we can pass any product name
 *  in this shop 
 *  we can create another product and add Observers to product's Array and just when 
 *  product's available be true send notification to all Arrays members
 *   THIS IS THE BEST WAY 
 */
 interface Observer {
	 public void update(String productName);
}
