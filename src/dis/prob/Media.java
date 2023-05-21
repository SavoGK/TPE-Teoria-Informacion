package dis.prob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Media {
	private BufferedReader br;
	private String seniales;
	private int cantidad;
	private double media;
	private double suma;
	private double senial;
	
	public Media(FileReader file) {
		super();
		this.br = new BufferedReader(file);
		this.seniales = "null";
		this.cantidad = 0;
		this.media = 0;
		this.suma = 0;
		this.senial = 0;
	}
	
	
	
	public double calcularMedia() {
		try {
			seniales = br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (seniales != null ) {
			senial = toDouble(seniales);
			suma+= senial;
			cantidad++;
			try {
				seniales = br.readLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		media = suma/cantidad;
		return media;	
	}
	public static Double toDouble(String s) {
	    return Double.parseDouble(s);
	}
	
}
