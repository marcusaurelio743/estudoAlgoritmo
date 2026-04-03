package classe;

public class DataTest {

	public static void main(String[] args) {
		Data data1 = new Data();
		data1.dia = 29;
		data1.mes = 4;
		data1.ano = 1950;
		
		Data data2 = new Data();
		data2.dia = 4;
		data2.mes = 5;
		data2.ano = 1993;
		
		System.out.println(data1.dataFormataBR());
		System.out.println(data1.dataFormatadaInternacional());
		System.out.println(data2.dataFormataBR());
		System.out.println(data2.dataFormatadaInternacional());
		
		Data data3 = new Data();
		System.out.println(data3.dataFormataBR());
		data3.imprimirDataInternacional();
		
	}

}
