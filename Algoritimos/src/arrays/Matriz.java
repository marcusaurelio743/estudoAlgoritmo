package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos:");
		int qtdAluno = sc.nextInt();
		System.out.println("Informe a quantidade de notas:");
		int qtdNotas = sc.nextInt();
		
		double[][]matriz = new double[qtdAluno][qtdNotas];
		double total=0;
		
		for(int a=0; a < matriz.length; a++) {
			for(int n=0; n<matriz[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d",(n+1),(a+1));
				matriz[a][n] = sc.nextDouble();
				total+=matriz[a][n];
			}
		}
		
		double media = (total/(qtdAluno*qtdNotas));
		
		System.out.println("Media da turma foi de: "+media);
		
		
		sc.close();
	}

}
