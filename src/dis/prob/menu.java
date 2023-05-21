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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	List<hoja> calculoHuffman (List<proba> listaSeniales){
		
		return null;
		
	}
	
	List<hoja> pasarDeListaProbaAHoja (List<proba> listaSeniales){ // convierte la lista proba a una de hojas
		for (int i =0; i < listaSeniales.size(); i++) {
			
		}
	}
}
