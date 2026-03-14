package pesquisa;
//pag 29 do livro
public class PesquisaBinaria {
	public static Integer pesquisaBinaria(int[] lista, int item) {
		int baixo = 0;
		Integer alto = lista.length -1;
		
		while(baixo <= alto) {
			Integer meio = (baixo + alto) /2;
			int chute = lista[meio];
			
			if(chute == item) {
				System.out.println("igual");
				return meio;
			}
			if(chute > item) {
				System.out.println("mais alto");
				alto = meio - 1;
			}else {
				System.out.println("mais baixo");
				baixo = meio +1;
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] minhaLista = new int[1000];
		
		for(int i=0; i< 1000; i++) {
			minhaLista[i] = i;
		}
				
		System.out.println("indice : "+ pesquisaBinaria(minhaLista, 500));
	}

}
