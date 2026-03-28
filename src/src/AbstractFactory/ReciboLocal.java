package AbstractFactory;

public class ReciboLocal implements Recibo {

    public String emitir() {
        return "Recibo de pedido retirado no local";
    }
}