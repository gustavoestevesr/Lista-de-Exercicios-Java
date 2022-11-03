package programas;

import java.util.Scanner;

/*
  Faça um programa que receba a quantidade e o valor de
  10 produtos. O programa deve calcular e exibir o valor
  total ao final da leitura.
*/

public class Programa02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valorTotal = 0;

    for (int i = 0; i < 2; i++) {
      System.out.printf("Quantidade do produto %d: ", i + 1);
      int quantidade = sc.nextInt();
      
      System.out.printf("Valor do produto %d: ", i + 1);
      double valor = sc.nextDouble();

      valorTotal = valorTotal + (quantidade * valor);
    }

    System.out.println("O valor total é " + valorTotal);
    sc.close();
  }
}
