import org.xml.sax.helpers.XMLReaderAdapter;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz liczbe: ");
        String liczbaStr = in.nextLine();
        int liczba = Integer.parseInt(liczbaStr);
        System.out.printf("Wartość całkowita: %d",liczba );

        }

    }

