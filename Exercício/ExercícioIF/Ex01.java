package Exercício.ExercícioIF;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Escreva um programa para ler 2 valores (considere que não serão informados
        // valores iguais) e escrever o maior deles.

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois valores diferentes");

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {

            System.out.println("O número maior é " + x);
        } else {

            System.out.println("O número maior é " + y);

        }
    }
}
