package Exercício;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, z;

        System.out.println("Digite seu primeiro número");
        x = sc.nextInt();

        System.out.println("Digite seu segundo número");
        z = sc.nextInt();

        int y = x + z;

        System.out.println("Resultado = " + y);

    }

}
