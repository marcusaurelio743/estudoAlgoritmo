package classe;

public class Produto {
	String nome;
	Double preco;
	static Double desconto= 0.25;
	
	Produto(){
	}
	
	double precoDesconto() {
		return(preco*(1-desconto));
	}
	
	double precoDesconto(double descontoGerente) {
		return(preco*(1 - desconto + descontoGerente));
	}
	
}
