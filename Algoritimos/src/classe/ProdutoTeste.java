package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		Produto.desconto = 0.50;
		p1.nome ="Caneta";
		p1.preco = 1.9;
		
		
		var p2 = new Produto();
		p2.nome = "Notebook";
		p2.preco = 2.000;
		
		
		System.out.println(p1.nome);
		System.out.println("Preco final "+p1.precoDesconto());
		System.out.println(p2.nome);
		System.out.println("Preco final "+p2.precoDesconto());
		sc.close();
	}

}
