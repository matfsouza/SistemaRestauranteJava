package org.restaurante.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private List<Item> itens;
    private double total;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
        this.total += item.getPreco();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("--- Pedido Nº: %d ---\n", numero));
        for (Item item : itens) {
            sb.append("  - ").append(item.toString()).append("\n");
        }
        sb.append(String.format("  Total: R$%.2f\n", total));
        sb.append("---------------------\n");
        return sb.toString();
    }
}