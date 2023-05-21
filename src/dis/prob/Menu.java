package dis.prob;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader input = new FileReader("signal2.txt");
			CalDistr cd = new CalDistr(input);
			List<Proba> listaSeniales = cd.probabilidades();
			for (int i = 0; i < listaSeniales.size(); i++) {
				listaSeniales.get(i).leerProba();

			}
			Media m = new Media(input);
			//double media = m.calcularMedia();
			double media = m.calcularDesvio(input);
			
				
			System.out.println("desvio: " + media);
		
			List<Rama> valores = Huffman.calculoHuffman(listaSeniales);
			float longMedia = longitudMedia(valores);
			System.out.println(longMedia);
			double totalBits = totalBits(valores);
			System.out.println("Total en bits "+totalBits);
			System.out.println("Total en byts "+totalBits/8); // me parece que esta mal planteado preguntar que pide
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static float longitudMedia (List<Rama> valores) {
		float longMedia = 0;
		for (int i = 0; i < valores.size(); i++) {
			longMedia = longMedia + valores.get(i).getProb() * valores.get(i).getBits().length();
		}
		return longMedia;
	}
	
	static double calculoEntropia(List<Proba> seniales) {
		float entropia = 0;
		float p = 0;
		for (int i = 0; i < seniales.size(); i++ ) {
			p = seniales.get(i).getProb();
			entropia += p * (Math.log10(p) / Math.log10(2));
		}
		entropia *= -1;
		return entropia;
	}
	
	static Double toDouble(String s) {
	    return Double.parseDouble(s);
	}
	
	static double totalBits (List<Rama> valores) {
		double total = 0;
		for (int i = 0; i < valores.size(); i++) {
			total = total + valores.get(i).getBits().length();
		}
		return total;
	}
	
}
