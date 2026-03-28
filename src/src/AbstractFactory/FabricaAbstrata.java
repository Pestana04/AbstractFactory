package AbstractFactory;

public interface FabricaAbstrata {
    Pedido createPedido();
    Recibo createRecibo();
}