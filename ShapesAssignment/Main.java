public class Main
{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(12, 10);
		Circle ci = new Circle(3);
		Triangle tri = new Triangle(3, 4);
		System.out.println("Area of Rectangle: "+rect.getArea());
		System.out.println("Area of Circle: "+ci.getArea());
		System.out.println("Area of Triangle: "+tri.getArea());
		
	}
}
