package orc;

import java.util.ArrayList;
import java.util.Random;
import projeto_ojogo.Personagem;

public abstract class Orc extends Personagem {

    protected int forca;
    protected int habilidade;
    protected int agilidade;

    public Orc(int forca, int habilidade, int agilidade) {
        this.forca = forca;
        this.habilidade = habilidade;
        this.agilidade = agilidade;
    }

    public int getForca() {
        return forca;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getAgilidade() {
        return agilidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tForça: " + forca
                + "\n\tHabilidade: " + habilidade
                + "\n\tAgilidade: " + agilidade;
    }

    @Override
    public String imprimirNome() {
        return "\tOrc -";
    }

    ;
    
    public void informacoes() {
        System.out.println(toString());
    }

}
