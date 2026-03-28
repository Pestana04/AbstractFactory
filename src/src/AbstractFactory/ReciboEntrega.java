package AbstractFactory;

public class ReciboEntrega implements Recibo {

    public String emitir() {
        return "Recibo de pedido para entrega";
    }
}