package com.trybe.java.regraprogressao;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> atividadesPesos = new ArrayList<>();
    String inputQtdAtividades = scanner.nextLine();

    short qtdAtividades = Short.parseShort(inputQtdAtividades);

    for (short i = 1; i <= qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String inputNome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      String inputPeso = scanner.nextLine();
      atividadesPesos.add(inputPeso);
      System.out.println("Digite a nota obtida para " + inputNome + ":");
      String inputNota = scanner.nextLine();
      atividadesPesos.add(inputNota);
    }
    short somatoriaPesos = 0;
    short somatoriaPesosNotas = 0;

    for (int i = 0; i < atividadesPesos.size(); i += 2) {
      short peso = Short.parseShort(atividadesPesos.get(i));
      short nota = Short.parseShort(atividadesPesos.get(i + 1));

      somatoriaPesos += peso;
      somatoriaPesosNotas += (short) (peso * nota);
    }

    double resultado = (short) (somatoriaPesosNotas / somatoriaPesos);

    if (resultado < 85) {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + resultado
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    } else {
      System.out.println("Parabéns! Você alcançou " + resultado
          + "%! E temos o prazer de informar que você obteve aprovação!");
    }
  }


}