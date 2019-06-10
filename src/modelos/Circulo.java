package modelos;

/**
 *
 * @author babar
 */
import java.math.*;
public class Circulo extends Forma {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(raio, 2) * Math.PI);
    }
    
    
}
