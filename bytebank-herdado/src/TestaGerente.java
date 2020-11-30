
public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Anderson");
		g1.setCpf("222.222.234.89");
		g1.setSalario(4000.0);
		
		g1.autentica(222);
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		
		g1.setSenha(222);
		
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);

	}

}
