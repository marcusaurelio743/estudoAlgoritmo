package colecoes;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
	
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add("Nome da Pessoa");
		conjunto.add(30);
		conjunto.add(true);
		conjunto.add(67.854);
		conjunto.add("m");
		conjunto.add(1);
		System.out.println(conjunto.size());
		conjunto.add("nome da Pessoa");
		System.out.println(conjunto.remove("m"));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains("m"));
		
		Set num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		System.out.println(num);
		System.out.println(conjunto);
		
		//conjunto.addAll(num);//união dos conjuntos
		conjunto.retainAll(num);//intercessao
		System.out.println(conjunto);
	}

}
