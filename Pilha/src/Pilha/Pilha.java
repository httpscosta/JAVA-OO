package Pilha;

import javax.management.RuntimeErrorException;

public class Pilha {

	int elementos[];
	int topo;

	public Pilha() {
		elementos = new int[10];
		topo = -1; // posição inválida do vetor
	}

	public void push(int e) {
		// thow new RuntimeErrorException(null, " Stack Overflow!");
		if (isFull()) { // Se a pilha estiver cheia
			System.out.println("Pihla cheia!");
		}

		topo++;
		elementos[topo] = e;
	}

	public int pop() {
		// thow new RuntimeExeption(" Empty! stack ");
		if (isEmpty()) {

			System.out.println("Pilha vazia!");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}

	public boolean isEmpty() {
		return (topo == -1);
	}

	public boolean isFull() {
		return (topo == 9);
	}

	public int top() {
		// thow new RuntimeExeption(" Empty Stack");
		if (isEmpty()) {
			System.out.println("Pilha vazia!");

		}
		return elementos[topo];
	}

}
