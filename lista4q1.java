import java.util.Scanner;
import java.util.Random;
public class lista4q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i=0; i<10; i++) {
        int numAleatorio = random.nextInt(11);

        if (numAleatorio<7) {
            System.out.println("\n"+ numAleatorio +" é um valor inválido.");
        } else {
            System.out.println("\n"+ numAleatorio +" é um valor válido.");
        }

        }
        scanner.close();
    }
}
