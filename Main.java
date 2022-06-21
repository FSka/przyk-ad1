// 1. Napisać program wczytujący od użytkownika liczbę x i rysujący na ekranie (przy pomocy znaku 'o')
// trójkąt prostokątny, w którym obydwie przyprostokątne są długości x. 

import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj liczbe x");
    Scanner scanner = new Scanner(System.in);
    int x=scanner.nextInt();
    for(int i=0;i<x+1;i++)
      {
        for(int j=0;j<i;j++)
          {
            System.out.print(" o ");
          }
        System.out.println("");
      }
  }
}