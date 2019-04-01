import java.util.Scanner;

public class Cwiczenia {
    public static void main(String[] args) {
        System.out.println("Podaj wysokość choinki");
        Scanner in = new Scanner(System.in);
        int wys = in.nextInt();

        for (int i = 0; i <wys ; i++) {
            for (int iloscSpacji = 0; iloscSpacji <wys-i ; iloscSpacji++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i*2 ; j++) {
                    System.out.print("*");

                }
            System.out.println();

            }

        }


    }

