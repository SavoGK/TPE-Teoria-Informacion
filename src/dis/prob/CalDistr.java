package dis.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalDistr {
	private List<Proba> listaSeniales = new ArrayList<>();
	private int pruebas = 0;
	private BufferedReader br;
	public CalDistr(FileReader file) {
		super();
		this.br = new BufferedReader(file);
	}
	
	public List<Proba> probabilidades() {
		String seniales = "null";
		try {
			seniales = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Proba p = new Proba(seniales);
		p.sumarExitos();
		pruebas++;
		p.setProb(pruebas);
		listaSeniales.add(p);
		try {
			seniales = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (seniales != null) {
			pruebas++;
			p = new Proba(seniales);
			if (!listaSeniales.contains(p)) {
				listaSeniales.add(p);
			}
			int indice = listaSeniales.indexOf(p);
			listaSeniales.get(indice).sumarExitos();
			for (int i = 0; i < listaSeniales.size(); i++) {
				listaSeniales.get(i).setProb(pruebas);
			}
			try {
				seniales = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listaSeniales;
		
	}
	
}
