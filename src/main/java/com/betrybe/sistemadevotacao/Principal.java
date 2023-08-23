package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /**
   * Método main.
   */


  public static void main(String[] args) {
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    int opcaoCandidato = 0;
    int opcaoEleitor = 0;
    int opcaoVotar = 0;

    while (opcaoCandidato == 0) {
      System.out.println("Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:\n");
      opcaoCandidato = scanner.nextInt();

      if (opcaoCandidato == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.next());
        votacao.cadastrarPessoaCandidata(nome, numero);
        opcaoCandidato = 0;
      } else if (opcaoCandidato == 2) {
        break;
      } else {
        System.out.println("Entre com uma opção válida!");
        opcaoCandidato = 0;
      }
    }

    while (opcaoEleitor == 0) {
      System.out.println("Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:\n");
      opcaoEleitor = scanner.nextShort();

      if (opcaoEleitor == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();

        votacao.cadastrarPessoaEleitora(nome, cpf);
        opcaoEleitor = 0;
      } else if (opcaoEleitor == 2) {
        break;
      } else {
        System.out.println("Entre com uma opção válida!");
        opcaoEleitor = 0;
      }
    }

    while (opcaoVotar == 0) {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Votar\n"
          + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação\n");
      opcaoVotar = scanner.nextShort();

      if (opcaoVotar == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.next());

        votacao.votar(cpf, numero);
        opcaoVotar = 0;
      } else if (opcaoVotar == 2) {
        votacao.mostrarResultado();
        opcaoVotar = 0;
      } else if (opcaoVotar == 3) {
        break;
      } else {
        System.out.println("Entre com uma opção válida!");
        opcaoVotar = 0;
      }
    }

    votacao.mostrarResultado();
    scanner.close();
  }
}
