package programas;

import java.util.Scanner;

/*
  Faça um programa que receba a largura e o comprimento de
  um lote de terra e mostre a área total existente em metros
  quadrados.
*/

public class Programa03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Largura do terreno: ");
    double largura = sc.nextDouble();

    System.out.print("Comprimento do terreno: ");
    double comprimento = sc.nextDouble();

    System.out.printf("A área total do terreno é de %.2g m2.", largura * comprimento);

    sc.close();
  }
}
