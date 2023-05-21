package dis.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Media {
	private BufferedReader br;
	private String seniales = "null";
	private int cantidad;
	private float media;
	private float suma;
	private float senial;
	
	public Media(FileReader file) {
		super();
		this.br = new BufferedReader(file);
	}
	
	
	
	public List<proba> probabilidades() {
		String seniales = "null";
		int cantidad = 0;
		float media = 0;
		float suma = 0;
		float senial = 0;
		try {
			seniales = br.readLine();
			senial = toFloat(seniales);
			cantidad++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proba p = new proba(seniales);
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
			p = new proba(seniales);
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
	public static float toFloat(String s) {
	    return Float.parseFloat(s);
	}
	
}
