package pesquisa;

public class PesquisaBinariaLetra {
	
	 public static Integer pesquisaBinaria(String[] lista, String item) {
	        int baixo = 0;
	        int alto = lista.length - 1;
	        
	        //criar um laço de repetição para percorrer toda estrutura
	        while (baixo <= alto) {
	        	
	            int meio = baixo + (alto - baixo) / 2;//o meio da lista
	            String chute = lista[meio];//pegar o valor da lista para um chute

	            int comparacao = chute.compareTo(item);//comparar as duas strings

	            if (comparacao == 0) {// se for igual a zero significa que achou o item
	            	System.out.println("igual");
	                return meio; //retorna a posição do array
	            }

	            if (comparacao > 0) {
	            	System.out.println("mais alto");
	                alto = meio - 1;// se for mais alto diminui uma posição
	            } else {
	            	System.out.println("mais baixo");
	                baixo = meio + 1;// se for mais baixo aumenta uma posição
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
