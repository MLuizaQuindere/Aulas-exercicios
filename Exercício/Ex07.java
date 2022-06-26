package Exercício;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.println("Você quer saber o nome de qual dia da semana?");

        dia = sc.nextInt();

        switch (dia) {
            case 1:

                System.out.println("Segunda");

                break;
            case 2:

                System.out.println("terça");

                break;
            case 3:

                System.out.println("Quarta");

                break;
            case 4:

                System.out.println("Quinta");

                break;
            case 5:

                System.out.println("Sexta");

                break;
            case 6:

                System.out.println("Sábado");

                break;
            case 7:

                System.out.println("Domingo");

                break;
            default:
                break;

        }

    }

}
