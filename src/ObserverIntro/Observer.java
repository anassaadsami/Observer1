package ObserverIntro;

class Observer {
	String name;
	Channel ch ; // every Observer must know which channel he connect with
				// so he must have channel as a reference variable and in this ex we have just one channel 

	public Observer(String name) {  // we don't need actually but just for explanation
		this.name = name;

	}
//	public Observer(String name, Channel ch) {
//		this.name = name;
////		this.ch = ch;   // we dont need it
//	}

	/*
	 *  this is another way to make Observer have a connection with Channel
	 *  but in constructor is much better and shorter way , so we need one of them
	 */
	void subscribeChannel(Channel ch) {    // we don't need it 
		this.ch = ch;
	}
	void update() {
		System.out.printf("hi %s we upload the %s vedio.%n",this.name, ch.title);   // this.ch.title is error

		
	}
}
