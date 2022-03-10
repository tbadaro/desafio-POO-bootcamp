import br.com.dio.desafio.dominio.*;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso aonde se ensina java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("curso aonde se ensina javascript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcampa Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Joana Souza");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        System.out.println("-");

        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-----------------");

        Dev dev2 = new Dev();
        dev2.setNome("João Silva");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }


}
