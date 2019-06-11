package modelos;

/**
 *
 * @author babar
 */
public class Pedido {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tapete getTapete() {
        return tapete;
    }

    public void setTapete(Tapete tapete) {
        this.tapete = tapete;
    }
    private Tapete tapete;
}
