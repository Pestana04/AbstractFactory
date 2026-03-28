package AbstractFactory;

public class PedidoLocal implements Pedido {

    public String emitir() {
        return "Pedido para retirada no local";
    }
}