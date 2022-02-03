package ObserverIntro.copy;

class Observer implements ObserverInterface {
	String name;
	Channel ch = new Channel(); // every Observer must know which channel he connect with
	PostOffice po = new PostOffice();
				// so he must have channel as a reference variable and in this ex we have just one channel 

	public Observer(String name) {  // we don't need actually but just for explanation
		this.name = name;

	}
	public Observer(String name, Channel ch) {
		this.name = name;
		this.ch = ch;
	}

	/*
	 *  this is another way to make Observer have a connection with Channel
	 *  but in constructor is much better and shorter way , so we need one of them
	 */
	// if we have many Subjects so this is a better way cause we just create a Observer and then can ha add what he want
	void subscribeChannel(PostOffice po) {    // we don't need it 
		this.po = po;
	}
	void subscribePost(PostOffice po) {    // we don't need it 
		this.po = po;
	}
	@Override
	public void update() {
		System.out.printf("hi %s we upload the %s vedio.%n",this.name, this.ch.title);

		
	}
	@Override
	public void postOfficeUpdate() {
		System.out.printf("hi %s your post is here.%n",this.name);
		
	}
}
