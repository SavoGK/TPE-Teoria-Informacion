package dis.prob;

public class hoja extends rama {
	private String bits;
	
	public hoja(rama izq, rama der, float prob) {
		super(izq, der);
		this.setProb(prob);
		// TODO Auto-generated constructor stub
	}
	public String getBits() {
		return bits;
	}
	public void setBits(String bits) {
		this.bits = bits;
	}

	@Override
	public void calculoBits(String bits) {
		this.setBits(bits);
	}

}
