package br.com.cz.zoologico.Model;


import br.com.cz.zoologico.contract.IComportamentoAquatico;
import br.com.cz.zoologico.contract.IComportamentoPorOvos;

public class Ornitorrinco extends Mamifero implements IComportamentoPorOvos, IComportamentoAquatico {

    @Override
    public void porOvo() {
        System.out.println("Ornitorrinco pos ovo");
    }
    @Override
    public void porOvo(int quantidade) {
        if (quantidade > 1){
            System.out.printf("Ornitorrinco pos %d ovos\n", quantidade);
        } else if (quantidade == 0){
            System.out.println("Ornitorrinco nao pos ovo");
        } else {
            System.out.println("Ornitorrinco pos 1 ovo");
        }
    }
    @Override
    public void nadar() {
        System.out.println("Ornitorrinco nadando");
    }
}
