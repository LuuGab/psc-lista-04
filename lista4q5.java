import java.util.Scanner;

public class lista4q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int popA, popB;
        double taxaA, taxaB;

        do {
            System.out.print("Digite a população inicial do país A: ");
            popA = scanner.nextInt();
        } while (popA <= 0);

        do {
            System.out.print("Digite a população inicial do país B: ");
            popB = scanner.nextInt();
        } while (popB <= 0 || popB == popA);

        do {
            System.out.print("Digite a taxa de crescimento anual de A (em %): ");
            taxaA = scanner.nextDouble();
        } while (taxaA <= 0);

        do {
            System.out.print("Digite a taxa de crescimento anual de B (em %): ");
            taxaB = scanner.nextDouble();
        } while (taxaB <= 0);

        int anos = 0;
        int a = popA;
        int b = popB;

        while (a < b) {
            a += a * (taxaA / 100);
            b += b * (taxaB / 100);
            anos++;
        }

        System.out.println("\nResultado:");
        System.out.println("Após " + anos + " anos, a população do país A (" + a + ") ultrapassará ou igualará a população do país B (" + b + ").");

        scanner.close();
    }
}
