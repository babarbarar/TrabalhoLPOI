
package modelos;

/**
 *
 * @author babar
 */
public abstract class Forma {
    protected double area;
    
    public abstract double calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
