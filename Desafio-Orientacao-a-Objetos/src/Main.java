import java.time.LocalDate;

import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

public class Main {
public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescrição("descrição curso java");
    curso1.setCargahoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Js");
    curso2.setDescrição("descrição curso Js");
    curso2.setCargahoraria(10);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescrição("descrição mentoria Java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
}
}
