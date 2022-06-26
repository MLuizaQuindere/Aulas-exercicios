package Exercício;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, resposta = 0;

        System.out.println("Calculadora");

        x = sc.nextInt();
        y = sc.nextInt();

        while (resposta != 5) {

            System.out.println("1. soma; 2. sub; 3. mult; 4. div 5. sair");

            resposta = sc.nextInt();

            switch (resposta) {
                case 1:
                    int soma = x + y;

                    System.out.println("resultado = " + x + " + " + y + " = " + soma);

                    break;

                case 2:
                    int sub = x - y;

                    System.out.println("resultado = " + x + " - " + y + " = " + sub);

                    break;

                case 3:

                    int mult = x * y;

                    System.out.println("resultado = " + x + " x " + y + " = " + mult);

                    break;

                case 4:
                    int div = x / y;

                    System.out.println("resultado = " + x + " : " + y + " = " + div);

                    break;

                case 5:

                    int sair = 5;

                default:

                    break;
            }
        

        }

    }

}
