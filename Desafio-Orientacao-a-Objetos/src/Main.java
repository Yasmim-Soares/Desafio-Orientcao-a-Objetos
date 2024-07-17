import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;
import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Conteudo;

public class Main {
public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Js");
    curso2.setDescricao("descrição curso Js");
    curso2.setCargaHoraria(10);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("descrição mentoria Java");
    mentoria.setData(LocalDate.now());

    //System.out.println(curso1);
    //System.out.println(curso2);
    //System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devYasmim = new Dev();
    devYasmim.setNome("Yasmim");
    devYasmim.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos" + devYasmim.getConteudosInscritos());

    devYasmim.progredir();
    System.out.println("------");
    System.out.println("Conteudos Inscritos" + devYasmim.getConteudosInscritos());
    System.out.println("Conteudos Concluidos" + devYasmim.getConteudosConcluidos());
    System.out.println("XP: "+ devYasmim.calcularTotalXp());

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
    
    devJoao.progredir();
    System.out.println("------");
    System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
    System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
    System.out.println("XP: "+ devJoao.calcularTotalXp());

}
}
