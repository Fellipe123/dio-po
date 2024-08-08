package br.com.dio.desafio;

import br.com.dio.desafio.model.Bootcamp;
import br.com.dio.desafio.model.Curso;
import br.com.dio.desafio.model.Mentoria;
import br.com.dio.desafio.view.BootcampView;
import br.com.dio.desafio.controller.BootcampController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp desenvolvimento java");
        bootcamp.setDescricao("Descrição Bootcamp desenvolvimento java");

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        BootcampView view = new BootcampView(bootcamp);
        BootcampController controller = new BootcampController(bootcamp, view);
        controller.iniciar();
    }
}