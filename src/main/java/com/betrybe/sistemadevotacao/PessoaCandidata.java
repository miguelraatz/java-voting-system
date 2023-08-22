package com.betrybe.sistemadevotacao;

/**
 * Classe da pessoa candidata.
 */

public class PessoaCandidata extends Pessoa {

  /**
   * Atributos.
   */
  private int numero;
  private int votos;

  /**
   * Constructor.
   */

  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;
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
    this.votos += 1;
  }
}
