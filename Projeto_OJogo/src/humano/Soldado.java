package humano;

public class Soldado extends Humano{
    
    public Soldado() {
        super(20, 80, 40);
    }
    
    @Override
    public String imprimirNome() {
        return super.imprimirNome() + " Soldado";
    }
}
