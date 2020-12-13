package humano;

import java.util.ArrayList;
import java.util.Random;
import projeto_ojogo.Personagem;

public abstract class Humano extends Personagem {

    protected int inteligencia;
    protected int velocidade;
    protected int equipamentos;

    public Humano(int inteligencia, int velocidade, int equipamentos) {
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.equipamentos = equipamentos;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getEquipamentos() {
        return equipamentos;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tInteligência: " + inteligencia
                                + "\n\tVelocidade: " + velocidade
                                + "\n\tEquipamentos: " + equipamentos;
    }
    
    @Override
    public String imprimirNome(){
        return "\tHumano -";
    }
    
    public void informacoes(){
        System.out.println(toString());
    }
    
 
}
