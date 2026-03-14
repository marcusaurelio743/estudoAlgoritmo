package pesquisa;

public class PesquisaBinariaLetra {
	
	 public static Integer pesquisaBinaria(String[] lista, String item) {
	        int baixo = 0;
	        int alto = lista.length - 1;

	        while (baixo <= alto) {
	            int meio = baixo + (alto - baixo) / 2;
	            String chute = lista[meio];

	            int comparacao = chute.compareTo(item);

	            if (comparacao == 0) {
	            	System.out.println("igual");
	                return meio;
	            }

	            if (comparacao > 0) {
	            	System.out.println("mais alto");
	                alto = meio - 1;
	            } else {
	            	System.out.println("mais baixo");
	                baixo = meio + 1;
	            }
	        }

	        return -1;
	    }

	public static void main(String[] args) {
		String[] letras = {
			    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
			};
		
		System.out.println("posição da lista "+pesquisaBinaria(letras, "X"));

	}

}
