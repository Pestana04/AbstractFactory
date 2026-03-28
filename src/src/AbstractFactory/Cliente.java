package AbstractFactory;

public class Cliente {

    private Pedido pedido;
    private Recibo recibo;

    public Cliente(FabricaAbstrata fabrica) {
        this.pedido = fabrica.createPedido();
        this.recibo = fabrica.createRecibo();
    }

    public String emitirPedido() {
        return this.pedido.emitir();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }
}