public class Main
{
	public static void main(String[] args) {
		Thread even = new Thread(new Odd());
		Thread odd = new Thread(new Even());
		even.start();
		odd.start();
	}
}