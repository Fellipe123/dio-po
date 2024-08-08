package br.com.dio.desafio.controller;

import br.com.dio.desafio.model.Bootcamp;
import br.com.dio.desafio.view.BootcampView;

public class BootcampController {
    private Bootcamp bootcamp;
    private BootcampView view;

    public BootcampController(Bootcamp bootcamp, BootcampView view) {
        this.bootcamp = bootcamp;
        this.view = view;
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
