public class Tester {
	public static void main(String[] args) {
	    //Stack
		//TestStack s = new TestStack(); 
     	//Thread t1 = new Thread(s);
		//t1.start();
		//Thread t2 = new Thread(s);
		//t2.start();
		
		MyQueue myQueue = new MyQueue(); //Queue
        Thread t3 = new Thread(new TestQueue(myQueue));
        t3.start();
        Thread t4 = new Thread(new TestQueue(myQueue));
        t4.start();
	}
}