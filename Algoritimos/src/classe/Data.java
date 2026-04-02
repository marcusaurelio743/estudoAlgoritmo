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
	
	public Data() {
		dia = 1;
		mes = 1;
		ano = 1971;
	}
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	

}
