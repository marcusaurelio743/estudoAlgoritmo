package curse.application;

import java.util.Locale;
import java.util.Scanner;

import curse.application.entity.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("enter the measures of triangle X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("enter the measures of triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//calcular a area do triangulo
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("\n Triangle X Area: %.4f \n ",areaX);
		System.out.printf("\n Triangle Y Area: %.4f \n",areaY);
		
		
		sc.close();
	}

}
