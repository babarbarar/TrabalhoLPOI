package modelos;

/**
 *
 * @author babar
 */
public class Retangulo extends Forma {
    private double altura;
    private double lado;
   
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (lado*altura);
    }
    
}
