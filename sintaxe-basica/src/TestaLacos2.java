
public class TestaLacos2 {

	public static void main(String[] args) {

		// aplicação do comando break para interromper o laço de repetição mais interno do bloco
		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna <= linha; coluna++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
