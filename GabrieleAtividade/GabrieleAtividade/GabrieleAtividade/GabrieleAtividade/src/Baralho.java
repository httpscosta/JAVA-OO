
import java.util.Random;
import java.util.Stack;

public class Baralho {

	private Stack<Carta> baralho;

	public Baralho() {
		String[] faces = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
		String[] naipes = { "Copas", "Paus", "Ouros", "Espadas" };

		baralho = new Stack<Carta>();
		int i = 0;
		while (i < 52) {
			baralho.push(new Carta(faces[i % 13], i % 13 + 1, naipes[i / 13]));
			i++;
		}
	}

	// 1 Método de remover a carta
	public Carta removeCarta(int ind) {

		Stack<Carta> aux = new Stack<Carta>();

		for (int i = 0; i < ind; i++) {
			aux.push(baralho.pop());
		}
		Carta alvo = baralho.pop();

		while (!aux.isEmpty()) {

			baralho.push(aux.pop());
		}

		return alvo;

	}

	// 2 Método embaralhar as cartas
	public void embaralhar() {
		Random nroAleatorio = new Random();

		for (int i = 0; i < 52; i++) {
			int indice = nroAleatorio.nextInt(52);

			if (indice != 0) {
				baralho.push(removeCarta(indice));

			}
		}

	}

	// 3 Método virar as cartas
	public Carta virarCarta() {
		baralho.pop();
		return baralho.peek();
	}

	public Stack<Carta> getBaralho() {
		return baralho;
	}

	public void setBaralho(Stack<Carta> baralho) {
		this.baralho = baralho;
	}

	@Override
	public String toString() {
		return "Baralho: " + "\n" + baralho.toString() + "\n";

	}

}
