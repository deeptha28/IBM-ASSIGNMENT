public class Tester {
	public static void main(String[] args) {
		TestStack s = new TestStack(); //Stack
		Thread t1 = new Thread(s);
		t1.start();
		Thread t2 = new Thread(s);
		t2.start();
	}
}
