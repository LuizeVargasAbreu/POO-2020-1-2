package orc;

import projeto_ojogo.Personagem;

public abstract class Orc extends Personagem {

    private int forca;            //todos os atributos estavam como protected, mas pra ser um bom encapsulamento deveriam ser private
    private int habilidade;
    private int agilidade;

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
