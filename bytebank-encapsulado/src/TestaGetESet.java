
public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta(86647, 1003);
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Gabriele S");
		conta.setTitular(cliente);
		
		conta.getTitular().setNome("Gabriele Costa");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Analista de Testes");
		
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(Conta.getTotal());

	}

}
