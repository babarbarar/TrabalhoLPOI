package modelos;

/**
 *
 * @author babar
 */
public class Tapete {
    private Forma forma;
    private Material material;
    private double preco;

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calcularPreco(){
      return ((forma.calcularArea())*(material.getValor()));
    }
 }
