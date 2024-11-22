package shapeProcess;
import java.util.Scanner;

import shapePack.*;

public class ShapeExecute {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Square square = new Square();
		Rectangle rt = new Rectangle();
		SemiCircle sc = new SemiCircle();
		
		square.printShape();
		square.printRectangle();
		square.printSquare();
		
		System.out.println("\nArea of Square");
		System.out.print("Enter the measure of a side: ");
		double squareInput = scanner.nextDouble();
		System.out.println("RESULT: Area of Square= " + square.calculateArea(squareInput, 0));
		
		System.out.println("\nArea of Rectangle");
		System.out.print("Enter the length: ");
		double rectangleInput1 = scanner.nextDouble();
		System.out.print("Enter the width: ");
		double rectangleInput2 = scanner.nextDouble();
		System.out.println("RESULT: Area of Rectangle= " + rt.calculateArea(rectangleInput1, rectangleInput2));
		
		
		
		System.out.print("------------\n");
		
		sc.printShape();
		sc.printCircle();
		sc.printSemiCircle();

	}

}
