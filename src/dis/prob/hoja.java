package dis.prob;

public class hoja extends rama {
	private String bits;
	private String senial;
	
	public hoja(rama izq, rama der, float prob, String senial) {
		super(izq, der);
		this.setProb(prob);
		this.senial = senial;
		// TODO Auto-generated constructor stub
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
	@Override
	public void calculoBits(String bits) {
		this.setBits(bits);
	}

}
