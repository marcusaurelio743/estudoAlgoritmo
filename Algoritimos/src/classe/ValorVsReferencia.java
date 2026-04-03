package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 3;
		double b = a;//atribuição por valor
		a++;
		b--;
		System.out.println(a+"|"+b);
		Data d1 = new Data(02, 04, 2026);
		Data d2 = d1;//atribuição por referencia
		
		d1.dia = 31;
		d2.mes = 2;
		
		System.out.println(d1.dataFormataBR());
		System.out.println(d2.dataFormataBR());
		
		voltarDataPadrao(d2);
		System.out.println(d1.dataFormataBR());
		System.out.println(d2.dataFormataBR());
		int c = 5;
		aterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1971;
	}
	static void aterarPrimitivo(int a) {
		a++;
	}
}
