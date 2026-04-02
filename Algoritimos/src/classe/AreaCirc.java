package classe;

public class AreaCirc {
	public double area;
	public final static double PI = 3.1415;/*com o static eu informo que esse atributo pertence a classe e 
									Não a Instância criada*/
	
	public AreaCirc( double area) {
		
		this.area = area;
	}
	
	public double area() {
		return(PI* Math.pow(area, 2));
	}

}
