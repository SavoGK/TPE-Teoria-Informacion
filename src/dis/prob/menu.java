package dis.prob;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader input = new FileReader("signal2.txt");
			calDistr cd = new calDistr(input);
			List<proba> listaSeniales = cd.probabilidades();
			for (int i = 0; i < listaSeniales.size(); i++) {
				listaSeniales.get(i).leerProba();
			}
			List<rama> valores = huffman.calculoHuffman(listaSeniales);
			float longMedia = longitudMedia(valores);
			System.out.println(longMedia);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static float longitudMedia (List<rama> valores) {
		float longMedia = 0;
		for (int i = 0; i < valores.size(); i++) {
			longMedia = longMedia + valores.get(i).getProb() * valores.get(i).getBits().length();
		}
		return longMedia;
	}
	
	static double calculoEntropia(List<proba> seniales) {
		float entropia = 0;
		float p = 0;
		for (int i = 0; i < seniales.size(); i++ ) {
			p = seniales.get(i).getProb();
			entropia += p * (Math.log10(p) / Math.log10(2));
		}
		entropia *= -1;
		return entropia;
	}
	
}
