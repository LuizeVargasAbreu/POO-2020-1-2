package projeto_ojogo;

public abstract class Personagem {
    
    private int vida = 100;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int perderVida(int diferenca){
        return vida -= diferenca;
    }
    
    public int ganharVida(int diferenca){
        return vida += diferenca;
    }   
   
    @Override
    public String toString() {
        return "\n\tVida: " + vida;
    }
    
    public abstract String imprimirNome();
   
}
