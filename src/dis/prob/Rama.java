package dis.prob;

public class Rama implements Comparable<Rama> {
	private float prob = 0;
	private String bits;
	private String senial;
	private int ocurrencias;
	private Rama izq;
	private Rama der;
	public Rama(Rama izq, Rama der) {
		super();
		this.izq = izq;
		this.der = der;
		if (izq != null && der != null)
			prob = izq.getProb() + der.getProb();
	}
	public float getProb() {
		return prob;
	}
	public void setProb(float prob) {
		this.prob = prob;
	}
	
	public String getBits() {
		return bits;
	}
	public void setBits(String bits) {
		this.bits = bits;
	}
	public String getSenial() {
		return senial;
	}
	public void setSenial(String senial) {
		this.senial = senial;
	}
	public int getOcurrencias() {
		return ocurrencias;
	}
	public void setOcurrencias(int ocurrencias) {
		this.ocurrencias = ocurrencias;
	}


	public void calculoBits(String bits) {
		this.bits = bits;
		if (this.izq != null && this.der != null) {
			izq.calculoBits(bits+"1");
			der.calculoBits(bits+"0");
		}
	}
	
	
	
	public Rama getIzq() {
		return izq;
	}
	
	public Rama getDer() {
		return der;
	}
	
	@Override
	public int compareTo(Rama o) {
		if (this.prob < o.getProb())
			return -1;
		else  if (o.getProb() < this.prob)
			return 1;
		else
			return 0;
	}
	
	
}
