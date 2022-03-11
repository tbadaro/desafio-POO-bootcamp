package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    protected Set<String> idDevs = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<String> getIdDevs() {
        return idDevs;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setIdDevs(Set<String> idDevs) {
        this.idDevs = idDevs;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    public void imprimirListaDevs(){
        System.out.println("*** Devs inscritos ***");
        for (Dev dev : this.devsInscritos){
            System.out.printf("Nome: %s", dev.getNome());
            System.out.printf("  Id: %s%n", dev.getIdentificador());
        }
        System.out.println("-----------------");
        System.out.println(" ");
    }

    public void imprimirListaConteudo(){
        System.out.println("*** Conteúdo do Bootcamp ***");
        for (Conteudo conteudo : this.conteudos){
            System.out.println(conteudo.getTitulo());
        }
        System.out.println("-----------------");
        System.out.println(" ");
    }

    public void imprimirInfoDev(String idDev){
        System.out.println("*** Informações do Dev ***");
        if (idDevs.contains(idDev)){
            for(Dev dev : this.devsInscritos) {
                if (Objects.equals(idDev, dev.getIdentificador())){
                    System.out.printf("Nome: %s%n", dev.getNome());
                    System.out.printf("Código indentificador: %s%n", dev.getIdentificador());
                    System.out.println("---Conteúdo inscrito---");
                    for (Conteudo conteudo : dev.getConteudosInscritos()){
                        System.out.println(conteudo.getTitulo());
                    }
                    System.out.println("---Conteúdo concluído---");
                    for (Conteudo conteudo : dev.getConteudosConcluidos()){
                        System.out.println(conteudo.getTitulo());
                    }
                    System.out.println("-----------------");
                    System.out.println("XP total:"+dev.calcularTotalXp());
                }
            }
        } else {
            System.out.println("Dev não cadastrado no bootcamp");
        }
        System.out.println("-----------------");
        System.out.println(" ");
    }
}
