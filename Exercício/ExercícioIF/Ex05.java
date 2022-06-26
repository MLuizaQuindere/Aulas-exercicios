package ExercícioIF;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        // Jogo da adivinhação, o usuário vai ter 3 tentativas para acertar a palavra.

        Scanner sc = new Scanner(System.in);

        String tent1, tent2, tent3, tent4;

        System.out.println(
                "Bem vindo ao jogo da adivinhação, tente inserir a palavra correta. Você tem 4 tentativas, boa sorte!");

        tent1 = sc.nextLine();

        if (tent1.equals("amor")) {

            System.out.println("Parabéns, você acertou!");

        }

        else {

            System.out.println("Ups, você errou. 3 tentativas restantes!");

            tent2 = sc.nextLine();

            if (tent2.equals("amor")) {

                System.out.println("Parabéns, você acertou!");

            }

            else {

                System.out.println("Ups, você errou. 2 tentativa restante!");

                tent3 = sc.nextLine();

                if (tent3.equals("amor")) {

                    System.out.println("Parabéns, você acertou");

                } else {

                    System.out.println("Ups, você errou. 1 tentativa restante!");

                    tent4 = sc.nextLine();

                    if (tent4.equals("amor")) {

                        System.out.println("Parabéns, você acertou!");

                    } else {

                        System.out.println("Você perdeu...");

                    }
                }

            }

        }

    }

}
