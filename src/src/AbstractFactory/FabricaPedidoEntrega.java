package AbstractFactory;

public class FabricaPedidoEntrega implements FabricaAbstrata {

    @Override
    public Pedido createPedido() {
        return new PedidoEntrega();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboEntrega();
    }
}