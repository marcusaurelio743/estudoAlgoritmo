package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {

	public static void main(String[] args) {
	//	Set<String> conjunto = new HashSet<>();//sem ordernar a lista
		Set<String> conjunto = new TreeSet<>();//ordenar
		conjunto.add("Maria");
		conjunto.add("Carla");
		conjunto.add("Amanda");
		conjunto.add("Joana");
		
		for(String candidato : conjunto) {
			System.out.println(candidato);
		}
	}

}
