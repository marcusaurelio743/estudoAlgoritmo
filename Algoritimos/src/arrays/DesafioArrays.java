package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas:");
		int qtd = sc.nextInt();
		double soma = 0.0;
		double[] notas = new double[qtd];
		sc.nextLine();
		
		for(int i=0; i < notas.length; i++) {
			System.out.println("Informe a nota "+(i+1));
			notas[i] = sc.nextDouble();
		}
		
		for(double nota: notas) {
			soma+= nota;
		}
		System.out.println();
		System.out.printf(" A media das nota: %.2f",soma/notas.length);
		
		sc.close();

	}

}
