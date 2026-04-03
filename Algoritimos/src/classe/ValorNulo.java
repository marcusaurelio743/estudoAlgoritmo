package classe;

public class ValorNulo {

	public static void main(String[] args) {
		String a = "";
		System.out.println(a.concat("!!!!!!"));
		Data d1 = Math.random() > 0.5 ? new Data(): null;
		
		if(d1 !=null) {
			d1.mes = 4;
			System.out.println(d1.dataFormataBR());
		}
		String s2 = null;
		if(s2 != null) {
			System.out.println(s2.concat("!!"));
		}
	}

}
