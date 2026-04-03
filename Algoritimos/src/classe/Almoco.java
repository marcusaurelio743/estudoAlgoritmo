package classe;

public class Almoco {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Maria", 70);
		Pessoa p2 = new Pessoa("Jose", 80);
		
		Comida c1 = new Comida("Arroz", 0.50);
		Comida c2 = new Comida("Carne", 0.3);
		Comida c3 = new Comida("Batata Frita", 0.6);
		
		System.out.println(p1);
		System.out.println(p2);
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		p1.comer(c3);
		p1.comer(c3);
		p2.comer(c3);
		p2.comer(c1);
		p2.comer(c2);
		p2.comer(c3);
		p2.comer(c3);
		p2.comer(c3);
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
