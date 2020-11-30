
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setNome("João Sousa");
		joao.setCpf("222.222.222.02");
		joao.setSalario(3600.00);
		
		System.out.println(joao.getNome());
		System.out.println("valor da bonificação é: " + joao.getbonificacao() + " reais.");
		
	}

}
