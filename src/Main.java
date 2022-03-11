import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcampa Java");

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso aonde se ensina java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("curso aonde se ensina javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Joana Souza");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev("João Silva");
        dev2.inscreverBootcamp(bootcamp);

        dev1.progredir();
        dev1.progredir();

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        bootcamp.imprimirListaDevs();
        bootcamp.imprimirListaConteudo();
        bootcamp.imprimirInfoDev("DEV1");
        bootcamp.imprimirInfoDev("DEV3");
        bootcamp.imprimirInfoDev("DEV2");


    }
}
