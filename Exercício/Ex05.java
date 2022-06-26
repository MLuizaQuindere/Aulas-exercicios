package Exercício;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        // Condicionais

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois números");

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {

            System.out.println("O número " + x + " é maior que " + y);
        }

        else if (x == y) {

            System.out.println("O número " + x + " é igual a " + y);
        }

        else if (x < y) {

            System.out.println("O número " + y + " é maior que " + x);
        }

        else {
            System.out.println("Error");
        }

    }

}
