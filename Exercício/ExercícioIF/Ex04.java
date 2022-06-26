package Exercício.ExercícioIF;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // tente adivinhar a senha. coloque a senha, se acertar, entrou no sistema, se
        // não, não entrou.

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Insira a senha");

        x = sc.nextInt();

        if (x == 4) {

            System.out.println("Entrada com sucesso!");
        }

        else {

            System.out.println("Incorreto, tente novamente.");

        }

    }

}
