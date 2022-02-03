package ObserverIntro;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		Channel ch1 = new Channel();
//		Channel ch2 = new Channel();
		/*
		 *  this first way to make Observer have knowledge which ch he connect with
		 */
		Observer obs1 = new Observer("anas");   
		Observer obs2 = new Observer("ali");
		Observer obs3 = new Observer("hiba");
		Observer obs4 = new Observer("teim");
//		
		obs1.subscribeChannel(ch1);
		obs2.subscribeChannel(ch1);
		obs3.subscribeChannel(ch1);
		obs4.subscribeChannel(ch1);
		
//		obs1.subscribeChannel(ch2);
//		obs2.subscribeChannel(ch2);
//		obs3.subscribeChannel(ch2);
//		obs4.subscribeChannel(ch2);
		
		// or directly in constructor and obviously its a better way
//		Observer obs1 = new Observer("anas" );   
//		Observer obs2 = new Observer("ali" );
//		Observer obs3 = new Observer("hiba");
//		Observer obs4 = new Observer("teim");
		
//		Observer obs1 = new Observer("anas" , ch2);   
//		Observer obs2 = new Observer("ali" , ch2);
//		Observer obs3 = new Observer("hiba", ch2);
//		Observer obs4 = new Observer("teim", ch2);
		
		ch1.add(obs1);
		ch1.add(obs2);
		ch1.add(obs3);
		ch1.add(obs4);
		
//		ch2.add(obs1);
//		ch2.add(obs2);
//		ch2.add(obs3);
//		ch2.add(obs4);
		
		// or directly 
//		ch1.observers = new ArrayList<>(Arrays.asList(obs1,obs2,obs3,obs4));
		
		ch1.upload("java");
//		ch2.upload("matt");
		

	}

}
