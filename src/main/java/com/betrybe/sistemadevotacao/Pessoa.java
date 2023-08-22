package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata Pessoa.
 */

public abstract class Pessoa {

  /**
   * Atributos e métodos.
   */
  protected String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
