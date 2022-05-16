package com.github.fernandodmoraes.projetoProgParalela.aula;

public class ProgramaThreadImplado {
	
		public static void main (String args[]) throws InterruptedException {
				
		for (int i = 1; i <= 10000; i++) {			
			new Thread(new Tabuada(i)).start();
		}
		
	}
	
}
