package Fila;

public class MainFila {

	public static void main(String[] args) {
		Fila f;
		int e;
		f = new Fila();
		
		f.insert(2507);
		f.insert(7687);
		f.insert(914);
		f.insert(1817);
		f.insert(100);

		System.out.println("Teste");
		while(!f.isEmpty()) {
			e = f.retirar();
			System.out.println("Senha a ser atendida no guiche: " +e);
		}
	}

}
