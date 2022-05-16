package com.github.fernandodmoraes.projetoProgParalela.aula;

import java.util.Stack;

public class ExemploAtividade {

	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<>();
		// empilhar 100.000 numeros
		pilha.add(1);
		pilha.add(2);
		
		// desempilhar 100.000 numeros 
		pilha.remove(0);

	}

}
