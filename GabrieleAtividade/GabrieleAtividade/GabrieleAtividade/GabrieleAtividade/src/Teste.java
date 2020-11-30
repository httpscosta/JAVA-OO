import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner nc = new Scanner(System.in);
		// Criação do objeto baralho
		Baralho b = new Baralho();
		// Visualização das cartas do baralho
		System.out.println(b.toString());
		b.embaralhar();

		System.out.println("Baralho embaralhado!");
		System.out.println(b.toString());

		b.embaralhar();

		System.out.println("Baralho embaralhado de novo!");
		System.out.println(b.toString());

		System.out.println("Digite quantidade de cartas que deseja virar do 1 ao 11: ");
		int carta = nc.nextInt();
		while (carta < 1 || carta > 11) {
			System.out.println("Digite quantidade de cartas que deseja virar: ");
			carta = nc.nextInt();
		}

		System.out.println();

		System.out.println("Digite quantas cartas você acredita ser do naipe vermelho:  ");
		int np = nc.nextInt();
		while (np < 0 || np == carta) {
			System.out.println("Digite quantas cartas você acredita ser do naipe vermelho(copas ou ouros):  ");
			np = nc.nextInt();
		}
		for (int i = 0; i < carta; i++) {
			b.virarCarta();
			System.out.println(b.virarCarta());
		}

	}
}
