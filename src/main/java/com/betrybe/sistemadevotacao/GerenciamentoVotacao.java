package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  /**
   * Atributos.
   */

  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   * Constructor.
   */

  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  /**
   * Métodos.
   */

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoa : this.pessoasCandidatas) {
      if (pessoa.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(pessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoa : this.pessoasEleitoras) {
      if (pessoa.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(pessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (PessoaEleitora pessoa : this.pessoasEleitoras) {
      if (cpfsComputados.contains(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        return;
      }
    }
    for (PessoaCandidata pessoa : this.pessoasCandidatas) {
      if (pessoa.getNumero() == numeroPessoaCandidata) {
        pessoa.receberVoto();
        this.cpfsComputados.add(cpfPessoaEleitora);
        return;
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (this.cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    for (PessoaCandidata pessoa : this.pessoasCandidatas) {
      System.out.println("Nome: " + pessoa.getNome() + " - " + pessoa.getVotos() + " votos ( "
          + (pessoa.getVotos() * 100) / this.cpfsComputados.size() + "% )");
    }
    System.out.println("Total de votos: " + this.cpfsComputados.size());
  }
}
