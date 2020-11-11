import java.util.Random;
import java.util.Scanner;

public class CoinThrowApp {
    public static void main(String[] args) {
        System.out.println("Wybierz jedną z dwóch opcji: \n" +
                "1 - orzeł \n" +
                "0 - reszka");
        Random random = new Random();
        int result = random.nextInt(2);
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();


        if ((x == result) && (x == 1)) {
            System.out.println("Brawo, wypadł orzeł i wygrywasz");
        } else if ((x == result) && (x == 0)) {
            System.out.println("Brawo, wypadła reszka i wygrywasz");
        } else if ((x != result) && (x == 1)) {
            System.out.println("Niestety wypadła reszka i przegrywasz");
        } else if ((x != result) && (x == 0)) {
            System.out.println("Niestety wypadł orzeł i przegrywasz");
        }
    }
}

