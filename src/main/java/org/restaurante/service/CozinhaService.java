package org.restaurante.service;

import org.restaurante.model.Item;
import org.restaurante.model.Pedido;
import java.util.HashMap;
import java.util.Map;

public class CozinhaService {

    private Map<Integer, Pedido> pedidosEmAndamento;
    private int proximoNumeroPedido;

    public CozinhaService() {
        this.pedidosEmAndamento = new HashMap<>();
        this.proximoNumeroPedido = 1;
    }

    public Pedido criarNovoPedido() {
        int numero = proximoNumeroPedido++;
        Pedido novoPedido = new Pedido(numero);
        pedidosEmAndamento.put(numero, novoPedido);
        return novoPedido;
    }

    public Pedido buscarPedido(int numero) {
        return pedidosEmAndamento.get(numero);
    }

    public boolean adicionarItemAoPedido(int numeroPedido, Item item) {
        Pedido pedido = buscarPedido(numeroPedido);
        if (pedido != null) {
            pedido.adicionarItem(item);
            return true;
        }
        return false;
    }
}