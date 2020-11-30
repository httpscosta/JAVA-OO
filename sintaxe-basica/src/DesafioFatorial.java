
public class DesafioFatorial {

	public static void main(String[] args) {
		// fatorial usando laço for 
		
		int fatorial = 1;
		for (int numeroatual = 1; numeroatual < 11; numeroatual++) {
			fatorial *= numeroatual;
			System.out.println("Fatorial de " + numeroatual + " = " + fatorial);
			
		}
	}

}
