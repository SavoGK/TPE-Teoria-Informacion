package dis.prob;

import java.util.Objects;

public class Proba {
	private String senial;
	private int exitos = 0;
	private float prob = 0;
	public Proba(String senial) {
		super();
		this.senial = senial;
	}
	public String getSenial() {
		return senial;
	}
	public void setSenial(String senial) {
		this.senial = senial;
	}
	public int getExitos() {
		return exitos;
	}
	public void sumarExitos() {
		this.exitos++;
	}
	public float getProb() {
		return prob;
	}
	public void setProb(int pruebas) {
		this.prob = (float) this.exitos/pruebas;
	}
	
	public void leerProba() {
		System.out.println("senial "+senial+" exitos "+exitos+" probabilidad "+prob);
	}
	
	@Override
	public boolean equals(Object o) {
		Proba p = (Proba) o;
		if (Objects.equals(this.senial, p.getSenial()))
			return true;
		return false;
	}
}
