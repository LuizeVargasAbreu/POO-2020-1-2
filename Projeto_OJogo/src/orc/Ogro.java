package orc;

public class Ogro extends Orc{

    public Ogro() {
       super(60, 60, 20);
    }
   
    @Override
    public String imprimirNome() {
        return super.imprimirNome() + " Ogro";
    }
    
    
}
