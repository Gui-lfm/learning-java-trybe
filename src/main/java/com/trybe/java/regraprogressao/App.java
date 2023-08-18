package com.trybe.java.regraprogressao;

import java.util.HashMap;
import java.util.Map;
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
    Map<String, String> atividadesPesos = new HashMap<>();
    String inputQtdAtividades = scanner.nextLine();

    short qtdAtividades = Short.parseShort(inputQtdAtividades);

    for (short i = 1; i <= qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String inputNome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      String inputPeso = scanner.nextLine();
      System.out.println("Digite a nota obtida para " + inputNome + ":");
      String inputNota = scanner.nextLine();
      atividadesPesos.put(inputNota, inputPeso);
    }
  }


}