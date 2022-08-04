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

        //Conteudo conteudo1 = new curso(); //Polimorfismo
        //Conteudo conteudo2 = new mentoria()

        mentoria Mentoria1 = new mentoria();
        Mentoria1.setTitulo("Spring Framework Experience");
        Mentoria1.setDescricao("Mentoria  Java");
        Mentoria1.setData(LocalDate.now());


//        System.out.println(Curso1);
//        System.out.println(Curso2);
//        System.out.println(Mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(Curso1);
        bootcamp.getConteudos().add(Curso2);
        bootcamp.getConteudos().add(Mentoria1);

        Dev devAlysson = new Dev();
        devAlysson.setNome("Alysson Sanitago");

        devAlysson.inscreverBootcamp(bootcamp);
                System.out.println("Alysson - Conteúdo Inscrito:" + devAlysson.getConteudoInscritos());

        System.out.println("-");

        devAlysson.progredir();
        devAlysson.progredir();
        devAlysson.progredir();
                System.out.println("Alysson - Conteúdo Inscrito:" + devAlysson.getConteudoInscritos());
                System.out.println("Alysson - Conteúdo Concluido:" + devAlysson.getConteudoConcluidos());
                System.out.println("XP:" + devAlysson.calcularTotalXP());

        System.out.println("_________");

        Dev devPriscilla = new Dev();
        devPriscilla.setNome("Priscilla Bandeira");

        devPriscilla.inscreverBootcamp(bootcamp);
                System.out.println("Priscilla - Conteúdo Inscrito:" + devPriscilla.getConteudoInscritos());

        System.out.println("-");

        devPriscilla.progredir();
        devPriscilla.progredir();
                System.out.println("Priscilla - Conteúdo Inscrito:" + devPriscilla.getConteudoInscritos());
                System.out.println("Priscilla - Conteúdo Concluido:" + devPriscilla.getConteudoConcluidos());
                System.out.println("XP:" + devAlysson.calcularTotalXP());


    }
}
