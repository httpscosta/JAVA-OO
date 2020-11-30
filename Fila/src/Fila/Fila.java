package Fila;

public class Fila {
	private int[] valores;
	private int inicio;
	private int fim;
	private int total;

	public Fila() {

		valores = new int[10];
		inicio = 0;
		fim = 0;
		total = 0;

	}

	public void insert(int elemento) {
		valores[fim] = elemento;
		// Resto sempre vai variar de 0 a 9 total de posições do vetor
		fim = (fim + 1) % 10;
		total++;
	}

	public int retirar() {
		int elemento = valores[inicio];
		inicio = (inicio + 1) % 10;
		total--;
		return elemento;
	}

	public boolean isEmpty() {
		return (total == 0);
	}

	public boolean isFull() {
		return (total == 10);
	}
}
