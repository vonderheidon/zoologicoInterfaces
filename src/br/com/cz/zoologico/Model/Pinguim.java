package br.com.cz.zoologico.Model;

import br.com.cz.zoologico.contract.IComportamentoAquatico;
import br.com.cz.zoologico.contract.IComportamentoPorOvos;

public class Pinguim extends Ave implements IComportamentoAquatico {

    public Pinguim() {

    }
    @Override
    public void nadar() {
        System.out.println("Pinguim nadando");
    }


}
