package shapePack;

public class Rectangle extends Shape {
	public void printRectangle() {
		System.out.println("This is rectangle. subclass of Shape.");
	}
	
	public double calculateArea(double side1, double side2) {
		return side1 * side2;
	}
}
