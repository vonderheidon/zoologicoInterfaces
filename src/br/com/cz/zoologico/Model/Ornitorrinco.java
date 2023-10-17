package br.com.cz.zoologico.Model;


import br.com.cz.zoologico.contract.IComportamentoAquatico;
import br.com.cz.zoologico.contract.IComportamentoPorOvos;
import br.com.cz.zoologico.contract.IComportamentoTerrestre;

public class Ornitorrinco extends Mamifero implements IComportamentoPorOvos, IComportamentoAquatico, IComportamentoTerrestre {

    public Ornitorrinco() {

    }
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
    @Override
    public void escalar() {
        System.out.println("Ornitorrinco escalando");
    }
    @Override
    public void correr() {
        System.out.println("Ornitorrinco correndo");
    }
    @Override
    public void rastejar() {
        System.out.println("Ornitorrinco rastejando");
    }
    @Override
    public void pular() {
        System.out.println("Ornitorrinco pulando");
    }

    @Override
    public void amamentar() {
        System.out.println("Ornitorrinco amamentando por suas glandulas mamarias.");
    }
}
