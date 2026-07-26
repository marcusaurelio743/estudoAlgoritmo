package estrutura_repeticao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListaPessoa {

	public static void main(String[] args) {
		Set<Pessoa> pessoas  = new HashSet<Pessoa>();
		pessoas.add(new Pessoa(1, "Maria"));
		pessoas.add(new Pessoa(2, "Pedro"));
		pessoas.add(new Pessoa(3, "Carlos"));
		boolean entrou = pessoas.add(new Pessoa(1, "Maria"));
		if(entrou) {
			System.out.println("Inseriu objeto repetido");
		}else {
			System.out.println("Não inseriu objeto repetido");
		}
		 
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
