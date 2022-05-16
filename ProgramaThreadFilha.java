package com.github.fernandodmoraes.projetoProgParalela.aula;

public class ProgramaThreadFilha {

	public static void main (String args[]) throws InterruptedException {
		
		for (int i = 1; i <= 10000; i++) {			
			new Tabuada(i).start();
		}
		
	}
}
