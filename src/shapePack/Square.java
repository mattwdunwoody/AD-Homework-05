package shapePack;

public class Square extends Rectangle {
	public void printSquare() {
		System.out.println("This is square. subclass of rectangle");
	}
	
	@Override 
	public double calculateArea(double side1, double side2) {
		return side1 * side1;
	}
}
