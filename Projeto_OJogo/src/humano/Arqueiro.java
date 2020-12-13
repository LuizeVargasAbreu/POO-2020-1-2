package humano;

public class Arqueiro extends Humano{

    public Arqueiro() {
        super(60, 60, 20);
    }
    
    @Override
    public String imprimirNome() {
        return super.imprimirNome() + " Arqueiro";
    }   
    
}
