package org.restaurante.controller;

import org.restaurante.model.Item;
import org.restaurante.model.Pedido;
import org.restaurante.service.CozinhaService;
import org.restaurante.view.RestauranteView;

public class GerenteController {

    private RestauranteView view;
    private CozinhaService service;

    public GerenteController(RestauranteView view, CozinhaService service) {
        this.view = view;
        this.service = service;
    }

    public void iniciar() {
        boolean executando = true;
        while (executando) {
            int opcao = view.mostrarMenu();
            executando = processarOpcao(opcao);
        }
        view.mostrarMensagem("Encerrando o sistema...");
    }

    private boolean processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cenarioNovoPedido();
                break;
            case 2:
                cenarioAdicionarItem();
                break;
            case 3:
                cenarioConsultarPedido();
                break;
            case 0:
                return false;
            default:
                view.mostrarMensagem("Opção inválida!");
                break;
        }
        return true;
    }

    private void cenarioNovoPedido() {
        Pedido novoPedido = service.criarNovoPedido();
        view.mostrarMensagem("Pedido " + novoPedido.getNumero() + " criado com sucesso!");
    }

    private void cenarioAdicionarItem() {
        int numero = view.pedirNumeroPedido();
        Item item = view.pedirNovoItem();

        boolean sucesso = service.adicionarItemAoPedido(numero, item);

        if (sucesso) {
            view.mostrarMensagem("Item adicionado ao pedido " + numero);
        } else {
            view.mostrarMensagem("Erro: Pedido " + numero + " não encontrado.");
        }
    }

    private void cenarioConsultarPedido() {
        int numero = view.pedirNumeroPedido();
        Pedido pedido = service.buscarPedido(numero);
        view.mostrarDetalhesPedido(pedido);
    }
}