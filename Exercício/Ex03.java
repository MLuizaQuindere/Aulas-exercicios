package Exercício;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome e sua idade");

        nome = sc.nextLine();
        idade = sc.nextInt();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");

    }
}
