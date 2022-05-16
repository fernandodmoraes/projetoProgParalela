package com.github.fernandodmoraes.projetoProgParalela.teste;

import com.github.fernandodmoraes.projetoProgParalela.classes.Pilha;

public class pilhaTeste {
	
    public static void main(String args[]) {
        Pilha pilha = new Pilha();
        pilha.empilhar("Iten 1 ");
        pilha.empilhar("Iten 2 ");
        pilha.empilhar("Iten 3 ");
        pilha.empilhar("Iten 4 ");
        pilha.empilhar(10000);
                while (pilha.pilhaVazia() == false) {
            System.out.println(pilha.desempilhar());
        }
    }
    

}