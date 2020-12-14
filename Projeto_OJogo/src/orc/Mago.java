package orc;

public class Mago extends Orc {

    public Mago() {
        super(20, 80, 40);
    }

    @Override
    public String imprimirNome() {
        return super.imprimirNome() + " Mago";
    }
    
}
