package shapePack;

public class Circle extends Shape {
	public void printCircle() {
		System.out.println("This is circle. Subclass of Shape.");
	}
	
	public double calculateArea(double radius) {
		return 3.14 * radius * radius;
	}
}
