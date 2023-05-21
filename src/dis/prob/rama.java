package dis.prob;

public class rama implements Comparable<rama> {
	private float prob = 0;
	private rama izq;
	private rama der;
	public rama(rama izq, rama der) {
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
	
	public void calculoBits(String bits) {
		izq.calculoBits(bits+"1");
		der.calculoBits(bits+"0");
	}
	
	@Override
	public int compareTo(rama o) {
		if (this.prob < o.getProb())
			return -1;
		else  if (o.getProb() < this.prob)
			return 1;
		else
			return 0;
	}
	
	
}
