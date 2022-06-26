package Exercício.ExercícioIF;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        // Informe a média do aluno (7) e mostre se ele está reprovado ou aprovado. São
        // 3 notas.

        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.println("Olá aluno(a), digite suas notas para verificar média!");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int nota = (z + y + x) / 3;

        if (nota >= 7) {

            System.out.println("Parabéns aluno(a), você está aprovado!");

        }

        else {

            System.out.println("Poxa, você foi reprovado, estude mais da próxima vez!");

        }
    }
}
