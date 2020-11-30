
public class TestaBanco {

	public static void main(String[] args) {
		Cliente gabi = new Cliente();

		gabi.nome = "Gabriele Costa";
		gabi.cpf = "222.222.222-22";
		gabi.profissao = "desenvolvedora";

		Conta contaDaGabi = new Conta();
		contaDaGabi.deposita(100);

		// associa o cliente a uma conta 
		contaDaGabi.titular = gabi;
		System.out.println(contaDaGabi.titular.nome);
		System.out.println(contaDaGabi.titular);
		
		Conta contaDaRaquel = new Conta();
		contaDaRaquel.titular = new Cliente();
		contaDaRaquel.titular.nome = "Raquel Viana";
		System.out.println(contaDaRaquel.titular.nome);
		

	}

}
