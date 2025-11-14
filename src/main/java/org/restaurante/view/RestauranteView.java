package org.restaurante.view;

import org.restaurante.model.Item;
import org.restaurante.model.Pedido;
import java.util.Scanner;
import java.util.Locale;

public class RestauranteView {
    private Scanner scanner;

    public RestauranteView() {
        this.scanner = new Scanner(System.in);
        this.scanner.useLocale(new Locale("pt", "BR"));
    }

    public int mostrarMenu() {
        System.out.println("\n=== Sistema do Restaurante ===");
        System.out.println("1. Criar novo pedido");
        System.out.println("2. Adicionar item a um pedido");
        System.out.println("3. Consultar pedido");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Item pedirNovoItem() {
        scanner.nextLine(); // Limpar buffer
        System.out.print("  Digite o nome do item (ex: Pizza): ");
        String nome = scanner.nextLine();
        System.out.print("  Digite o preço do item (ex: 35,50): ");
        double preco = scanner.nextDouble();
        return new Item(nome, preco);
    }

    public int pedirNumeroPedido() {
        System.out.print("Digite o número do pedido: ");
        return scanner.nextInt();
    }

    public void mostrarDetalhesPedido(Pedido pedido) {
        if (pedido != null) {
            System.out.println(pedido.toString());
        } else {
            System.out.println("Erro: Pedido não encontrado.");
        }
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }
}