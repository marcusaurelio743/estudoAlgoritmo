package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapaEx {

	public static void main(String[] args) {
		List<Pessoa> empresa = new ArrayList<>();
		empresa.add(new Pessoa("Maria", "RH"));
		empresa.add(new Pessoa("Paula", "RH"));
		empresa.add(new Pessoa("Amanda", "RH"));
		empresa.add(new Pessoa("Roberto", "DP"));
		empresa.add(new Pessoa("Carolos", "DP"));
		empresa.add(new Pessoa("Jose", "DIRETORIA"));
		empresa.add(new Pessoa("Josepe", "DIRETORIA"));
		empresa.add(new Pessoa("Katia", "ASSISTENTE"));
		empresa.add(new Pessoa("Pereira", "ASSISTENTE"));
		empresa.add(new Pessoa("Maria", "ASSISTENTE"));
		empresa.add(new Pessoa("Maria", "DP"));
		empresa.add(new Pessoa("Marcus", "CHEFE"));
		empresa.add(new Pessoa("Marcus", "CHEFE"));
		empresa.add(new Pessoa("Marcus", "CHEFE"));
		Map<String, Pessoa> EmpresaMapeado = new HashMap<String, Pessoa>();
		
		
		for(Pessoa colaborador : empresa) {
			if(colaborador.getSetor().equals("RH")) {
				EmpresaMapeado.put(colaborador.getSetor(), colaborador);
			}else if(colaborador.getSetor().equals("CHEFE")) {
				EmpresaMapeado.put(colaborador.getSetor(), colaborador);
			}else if(colaborador.getSetor().equals("ASSISTENTE")) {
				EmpresaMapeado.put(colaborador.getSetor(), colaborador);
			}else if(colaborador.getSetor().equals("DP")) {
				EmpresaMapeado.put(colaborador.getSetor(), colaborador);
			}else if(colaborador.getSetor().equals("DIRETORIA")) {
					EmpresaMapeado.put(colaborador.getSetor(), colaborador);
				}
		
		}
		
		for(int i=0; i<EmpresaMapeado.size(); i++) {	
					System.out.println(EmpresaMapeado.get("RH"));	
		}
		for(int i=0; i<EmpresaMapeado.size(); i++) {	
			System.out.println(EmpresaMapeado.get("CHEFE"));	
		}
		for(int i=0; i<EmpresaMapeado.size(); i++) {	
			System.out.println(EmpresaMapeado.get("ASSISTENTE"));	
		}
		for(int i=0; i<EmpresaMapeado.size(); i++) {	
			System.out.println(EmpresaMapeado.get("DP"));	
		}
		for(int i=0; i<EmpresaMapeado.size(); i++) {	
			System.out.println(EmpresaMapeado.get("DIRETORIA"));	
		}

	}

}
