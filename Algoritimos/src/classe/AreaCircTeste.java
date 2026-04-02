package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
		//a.PI = 500000;
		
		AreaCirc a2 = new AreaCirc(5);
		
		//a2.PI = 0;
		/*desse jeito o valor de PI informado sera acessado entre as 
			instancias de forma global*/
		//AreaCirc.PI = 3.1415;
		System.out.println(a2.area());
			//AreaCirc.PI = 3;
		System.out.println(a.area());
		
	}
}
