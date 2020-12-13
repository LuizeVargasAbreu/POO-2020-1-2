package orc;

public class Demonio extends Orc{
    
    public Demonio() {
        super(80, 20, 60);
    }

    @Override
    public String imprimirNome() {
        return super.imprimirNome() + " Demônio";
    }
    
}
