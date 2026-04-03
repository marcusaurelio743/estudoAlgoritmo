package classe;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	

	public String dataFormataBR() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	public String dataFormatadaInternacional() {
		return String.format("%d-%d-%d", ano,mes,dia);
	}
	public void imprimirDataBR() {
		System.out.println(this.dataFormataBR());
	}
	public void imprimirDataInternacional() {
		System.out.println(this.dataFormatadaInternacional());
	}
	public Data() {

		this(1,1,1970);
	}
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	

}
