import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.ZoneId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFlavio = new Dev();
        devFlavio.setNome("Flavio");
        devFlavio.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos" + devFlavio.getConteudosInscritos());
        devFlavio.progredir();
        devFlavio.progredir();
        System.out.println("Conteudos Concluidos" + devFlavio.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devFlavio.getConteudosInscritos());
        System.out.println("XP: " + devFlavio.calcularTotalXp());

        Dev devRenan = new Dev();
        devRenan.setNome("Renan");
        devRenan.inscreverBootcamp(bootcamp);
        devRenan.calcularTotalXp();

        System.out.println("Conteudos Inscritos" + devRenan.getConteudosInscritos());
        devRenan.progredir();
        System.out.println("Conteudos Concluidos" + devRenan.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devRenan.getConteudosInscritos());
        System.out.println("XP: " + devRenan.calcularTotalXp());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
    }
}