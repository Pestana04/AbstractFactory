package Test;

import AbstractFactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    void deveEmitirPedidoLocal() {
        FabricaAbstrata fabrica = new FabricaPedidoLocal();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pedido para retirada no local", cliente.emitirPedido());
    }

    @Test
    void deveEmitirPedidoEntrega() {
        FabricaAbstrata fabrica = new FabricaPedidoEntrega();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pedido para entrega", cliente.emitirPedido());
    }

    @Test
    void deveEmitirReciboLocal() {
        FabricaAbstrata fabrica = new FabricaPedidoLocal();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Recibo de pedido retirado no local", cliente.emitirRecibo());
    }

    @Test
    void deveEmitirReciboEntrega() {
        FabricaAbstrata fabrica = new FabricaPedidoEntrega();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Recibo de pedido para entrega", cliente.emitirRecibo());
    }
}