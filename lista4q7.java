import java.util.Scanner;
public class lista4q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

            System.out.println("\nDigite 5 algarismos.");

            for (int i=1; i<=5; i++) {
              System.out.println("\nNúmero "+ i +":");
              int number = scanner.nextInt();

              if (number>maior) {
                maior = number;
              }
            }
        System.out.println("\nO maior algarismo foi: "+ maior);
    }
}
