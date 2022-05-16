package com.github.fernandodmoraes.projetoProgParalela.aula;

public class ProgramaSemThread {

	public static void main (String args[]) throws InterruptedException {
		
		for (int i = 1; i <= 100000; i++) {			
			new Tabuada(i).calcular();
			System.out.println("-");
//			Thread.sleep(1);
		}
		
	}
}
