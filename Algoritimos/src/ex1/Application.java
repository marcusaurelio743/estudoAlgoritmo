package ex1;

import java.util.Locale;
import java.util.Scanner;

import ex1.entity.Retangle;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.println("Enter rectangle width and height:");
		retangle.setWidth(sc.nextDouble());
		retangle.setHeight(sc.nextDouble());
		
		System.out.printf("AREA = %.2f%n", retangle.area());
		System.out.printf("PERIMETER = %.2f%n", retangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());
		sc.close();
	}

}
