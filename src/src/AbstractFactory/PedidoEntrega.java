package AbstractFactory;

public class PedidoEntrega implements Pedido {

    public String emitir() {
        return "Pedido para entrega";
    }
}