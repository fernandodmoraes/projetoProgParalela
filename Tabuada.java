package com.github.fernandodmoraes.projetoProgParalela.aula;

public class Tabuada extends Thread {

	private Integer numero;

	public Tabuada(Integer numero) {
		this.numero = numero;
	}
	
	public synchronized void calcular() throws InterruptedException {
		wait();
		for (int i = 1; i <= 10; i++) {			
			Integer resultado = i * numero;
			System.out.println(i + " X " + numero 
					+ " = "  + resultado);
		}		
	}
	
	@Override
	public void run() {
		System.out.println(this.getName());
		try {
			calcular();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}