package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  /**
   * Atributos.
   */

  private String cpf;

  /**
   * Constructor.
   */

  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }

  /**
   * Métodos.
   */

  public String getNome() {
    return super.getNome();
  }

  public void setNome(String nome) {
    super.setNome(nome);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
