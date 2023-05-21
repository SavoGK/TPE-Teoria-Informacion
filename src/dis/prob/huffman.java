package dis.prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class huffman {
	
	static List<rama> calculoHuffman (List<proba> listaSeniales){
	List<rama> hojas = pasarDeListaProbaAHoja(listaSeniales);
	List<rama> arbol = new ArrayList<>(hojas);
	while (arbol.size() > 1) {
		rama r1 = arbol.get(0);
		rama r2 = arbol.get(1);
		rama r = new rama(r1, r2);
		arbol.remove(r1);
		arbol.remove(r2);
		arbol.add( r);
	}
	arbol.get(0).calculoBits("");
	System.out.println(hojas.get(0).getBits());
	return hojas;
	
}

	private static List<rama> pasarDeListaProbaAHoja (List<proba> listaSeniales){ // convierte la lista proba a una de hojas
		List<rama> hojas = new ArrayList<>();
		for (int i =0; i < listaSeniales.size(); i++) { // crea hojas y las pone en la lista
			rama h = new rama(null, null);
			h.setProb(listaSeniales.get(i).getProb());
			h.setSenial(listaSeniales.get(i).getSenial());
			hojas.add(h);
		}
		Collections.sort(hojas);
		return hojas;
	}
	
}

