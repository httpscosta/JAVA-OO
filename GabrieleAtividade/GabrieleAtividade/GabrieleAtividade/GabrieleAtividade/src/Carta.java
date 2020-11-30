
public class Carta {
	String face;
	int valor;
	String naipe;

	public Carta(String face, int valor, String naipe) {
		this.face = face;
		this.valor = valor;
		this.naipe = naipe;
	}
	

	public String getNaipe() {
		return naipe;
	}


	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}


	@Override
	public String toString() {
		return " Face" + face + " de " + naipe;
	}

}
