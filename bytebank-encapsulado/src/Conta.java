
public class Conta {

	private double saldo;
	private int conta;
	private int agencia;
	private Cliente titular;
	// static configura o atributo como sendo da classe e não do objeto
	private static int total;

	public Conta(int conta, int agencia) {
		Conta.total++;
		this.conta = conta;
		this.agencia = agencia;
		
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;

		} else {
			return false;

		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			destino.deposita(valor);
			return true;

		}
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
