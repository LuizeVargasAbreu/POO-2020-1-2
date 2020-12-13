package humano;

public class Robo extends Humano {
    
    public Robo() {
        super(80, 20, 60);
    }
    
    @Override
    public String imprimirNome() {
        return super.imprimirNome() + " Robô";
    }
    
    
}
