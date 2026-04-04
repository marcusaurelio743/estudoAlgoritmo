package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Amanda");
		usuarios.put(2, "Roberto");
		usuarios.put(2, "Carlos");
		usuarios.put(3, "akira");
		
		System.out.println(usuarios);
		
	}

}
