package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAluno1 = new double[3];
		double total=0;
		int i=0;
		while(i<notasAluno1.length) {
			notasAluno1[i] = 9.0;
			total+=notasAluno1[i];
			i++;
		}
		
		
		System.out.println(Arrays.toString(notasAluno1));
		System.out.println("Meida das notas: "+total/notasAluno1.length);
		
	}

}
