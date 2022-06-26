package Exercício.ExercícioIF;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
        // mensagem que diga
        // se ela poderá ou não votar este ano (não é necessário considerar o mês em que
        // ela nasceu).

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite seu ano de nascimento para verificar se está apto para votar. ");

        x = sc.nextInt();

        if (x <= 2004) {

            System.out.println("Você está apto para votar!");

        }

        else {

            System.out.println("Você não está apto para votar, espere mais um pouco para sua vez!");

        }

    }
}
