import java.util.Scanner;

public class PrzedostatnieSlowo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Przedostatnie słowo: "+ words[words.length-2]);
    }
}
