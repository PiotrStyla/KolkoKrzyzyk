import java.util.Scanner;

public class OdwrocenieTextu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz text: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.println("Odwrocony tekst:");
        for (int i = letters.length-1; i >=0;i--) {
            System.out.print(letters[i]);
        }
        System.out.println("\n");
    }
}
