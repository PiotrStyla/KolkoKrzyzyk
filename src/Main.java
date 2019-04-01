import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("\n");
                System.out.println("Hej, zagramy w kółko - krzyżyk?");
                System.out.println("Tak? To podaj swoje imię:");
                String imie1 = in.next();
                System.out.println("Super " + imie1 + "!");
                System.out.println();
                System.out.println("A teraz Ty może podasz swoje imie: ");
                String imie2 = in.next();
                System.out.println("O extra " + imie2 + "!");
                System.out.println("No to zaczynamy!");
                System.out.println("\n");

                System.out.println("Na początek wylosujmy kto będzie zaczynał i stawiał krzyżyki...");
                System.out.println("Zaczynamy? Jeśli tak - napisz TAK");
                String tak = in.next();


                Random losowanie = new Random();
                int a = losowanie.nextInt(2);
                if (a == 1) {
                    System.out.println("Krzyżyki stawia " + imie1 + " a kółka " + imie2);
                } else {
                    System.out.println("Krzyżyki stawia " + imie2 + " a kółka " + imie1);
                }
                System.out.println("\n");

                System.out.println("Oto nasza plansza - jeżeli chcesz postawić swój znak na " +
                        "danym polu to wpisz poniżej numer tego pola:");
                System.out.println("1  2  3");
                System.out.println("4  5  6");
                System.out.println("7  8  9");
                if (a == 1) {
                    System.out.println("Zaczyna " + imie1 + ". Gdzie stawiasz swój znak?");
                } else {
                    System.out.println("Zaczyna " + imie2 + ". Gdzie stawiasz swój znak?");
                }


        char[][] tab = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        System.out.println(imie1 + " Zacznij - podaj numer pola na którym stawiasz swój znak");
        char b = in.next().charAt(0);

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                //   if (tab[i][j] == 'b') {
                //     tab[i][j] = 'X';}

                if (b == tab[i][j]) {
                    tab[i][j] = 'X';
                }
            }
        }
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2]);
        System.out.println("\n");

        System.out.println(imie2 + " teraz Ty - i tak na przemian");

        char c = in.next().charAt(0);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {

                if (c == tab[i][j]) {
                    tab[i][j] = 'O';
                }
            }
        }
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2]);
        System.out.println("\n");
        System.out.println("Następny ruch");
        char d = in.next().charAt(0);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {


                if (d == tab[i][j]) {
                    tab[i][j] = 'X';
                }
            }
        }
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2]);
        System.out.println("\n");
        System.out.println("Kolejny");
        char e = in.next().charAt(0);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {


                if (e == tab[i][j]) {
                    tab[i][j] = 'O';
                }
            }
        }
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2]);
        System.out.println("\n");
        System.out.println("Twój trzeci ruch");
        char f = in.next().charAt(0);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {


                if (f == tab[i][j]) {
                    tab[i][j] = 'X';
                }
            }
        }
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2]);

        System.out.println("\n");
        System.out.println("Twój trzeci ruch "+ imie2);
        char g = in.next().charAt(0);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {


                if (g == tab[i][j]) {
                    tab[i][j] = 'O';
                }
            }
        }
        System.out.print(tab[0][0] + "  ");
        System.out.print(tab[0][1] + "  ");
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0] + "  ");
        System.out.print(tab[1][1] + "  ");
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0] + "  ");
        System.out.print(tab[2][1] + "  ");
        System.out.print(tab[2][2]);


        int[] A = {b - 48, d - 48, f - 48};
        Arrays.sort(A);
        int[] B = {c-48,e-48,g-48};
        Arrays.sort(B);
        int[] alfa1 = {1, 2, 3};
        int[] alfa2 = {4, 5, 6};
        int[] alfa3 = {7, 8, 9};
        int[] alfa4 = {1, 4, 7};
        int[] alfa5 = {2, 5, 8};
        int[] alfa6 = {3, 6, 9};
        int[] alfa7 = {1, 5, 9};
        int[] alfa8 = {3, 5, 7};

        System.out.println("\n");




        if (Arrays.toString(A).equals(Arrays.toString(alfa1))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa2))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa3))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa4))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa5))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa6))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa7))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(A).equals(Arrays.toString(alfa8))) {
            System.out.println(imie1 + " GRATULACJE WYGRAŁEŚ!");
        }
        System.out.println("\n");

        if (Arrays.toString(B).equals(Arrays.toString(alfa1))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa2))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa3))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa4))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa5))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa6))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa7))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        } else if (Arrays.toString(B).equals(Arrays.toString(alfa8))) {
            System.out.println(imie2 + " GRATULACJE WYGRAŁEŚ!");
        }
        else{
            System.out.println("remis!");
        }
    }
}

