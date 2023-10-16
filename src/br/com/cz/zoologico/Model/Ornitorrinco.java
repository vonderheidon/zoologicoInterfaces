package br.com.cz.zoologico.Model;


import br.com.cz.zoologico.contract.IComportamentoAquatico;
import br.com.cz.zoologico.contract.IComportamentoPorOvos;
import br.com.cz.zoologico.contract.IComportamentoTerrestre;

public class Ornitorrinco extends Mamifero implements IComportamentoPorOvos, IComportamentoAquatico {

    @Override
    public void porOvo() {
        System.out.println("Pos ovo");
    }

    @Override
    public void porOvo(int quantidade) {
        if (quantidade > 1){
            System.out.printf("Pos %d ovos", quantidade);
        } else if (quantidade == 0){
            System.out.println("Nao pos ovo");
        } else {
            System.out.println("Pos 1 ovo");
        }
    }
    @Override
    public void nadar() {
        System.out.println("Ornitorrinco nadando");
    }
}
