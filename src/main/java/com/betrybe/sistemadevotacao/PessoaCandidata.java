package com.betrybe.sistemadevotacao;

/**
 * Classe da pessoa candidata.
 */

public abstract class PessoaCandidata extends Pessoa {

  /**
   * Atributos e métodos.
   */
  private int numero;
  private int votos;

  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos++;
  }
}
