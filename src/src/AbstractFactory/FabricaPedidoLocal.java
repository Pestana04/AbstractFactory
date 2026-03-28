package AbstractFactory;

public class FabricaPedidoLocal implements FabricaAbstrata {

    @Override
    public Pedido createPedido() {
        return new PedidoLocal();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboLocal();
    }
}