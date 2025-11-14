package org.restaurante;

import org.restaurante.controller.GerenteController;
import org.restaurante.service.CozinhaService;
import org.restaurante.view.RestauranteView;

public class Main {
    public static void main(String[] args) {
        // 1. Cria os componentes
        CozinhaService cozinha = new CozinhaService();
        RestauranteView view = new RestauranteView();

        // 2. Cria o Controller e injeta suas dependências
        GerenteController gerente = new GerenteController(view, cozinha);

        // 3. Inicia o sistema
        gerente.iniciar();
    }
}