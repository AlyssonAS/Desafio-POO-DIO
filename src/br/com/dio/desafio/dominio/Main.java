package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        curso Curso1 = new curso();
        Curso1.setTitulo("Spring Framework Experience");
        Curso1.setDescricao("Curso Spring Framework Experience! Um programa repleto de cursos, desafio de código e desafios de projeto nas tecnologias Java - Spring Framework.");
        Curso1.setCargaHoraria(50);

        curso Curso2 = new curso();
        Curso2.setTitulo("Curso Web Moderno Completo com JavaScript 2022 + Projetos");
        Curso2.setDescricao("Seja muito bem vindo ao Curso Desenvolvimento Web Moderno com JavaScript! COMPLETO 2020 + Projetos! Esse que talvez seja o maior e mais completo curso de tecnologia do mercado. São quase 600 aulas divididas em 33 capítulos com mais de 85 horas.");
        Curso2.setCargaHoraria(96);


        mentoria Mentoria1 = new mentoria();
        Mentoria1.setTitulo("Spring Framework Experience");
        Mentoria1.setDescricao("Mentoria  Java");
        Mentoria1.setData(LocalDate.now());


        System.out.println(Curso1);
        System.out.println(Curso2);
        System.out.println(Mentoria1);
    }
}
