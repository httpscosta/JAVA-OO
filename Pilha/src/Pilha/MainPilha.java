package Pilha;

public class MainPilha {

	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		
		p.push(5);
		p.push(10);
		p.push(15);
		p.push(20);
		
		while(!p.isEmpty()){
			int elemento = p.pop();
			System.out.println("Desempilhei " + elemento);
			}
		 // int e = p.pop();
	}

}
