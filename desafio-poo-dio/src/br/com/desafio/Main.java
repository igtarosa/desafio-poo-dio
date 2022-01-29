package br.com.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargahoraria(8);

        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargahoraria(4);

        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgta = new Dev();
        devIgta.setNome("Igta");
        devIgta.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Igta" + devIgta.getConteudosInscritos());
        devIgta.progredir();
        devIgta.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Igta" + devIgta.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Igta" + devIgta.getConteudosConcluidos());
        System.out.println("XP: " + devIgta.calcularXp());

        System.out.println("----------");

        Dev devRosa = new Dev();
        devRosa.setNome("Rosa");
        devRosa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rosa" + devRosa.getConteudosInscritos());
        devRosa.progredir();
        devRosa.progredir();
        devRosa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rosa" + devRosa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rosa" + devRosa.getConteudosConcluidos());
        System.out.println("XP: " + devRosa.calcularXp());
    }
}
