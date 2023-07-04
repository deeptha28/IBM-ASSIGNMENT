public class Tester {
	public static void main(String[] args) {
	MyQueue myQueue = new MyQueue(); //Queue
        Thread t3 = new Thread(new TestQueue(myQueue));
        t3.start();
        Thread t4 = new Thread(new TestQueue(myQueue));
        t4.start();
	}
}
