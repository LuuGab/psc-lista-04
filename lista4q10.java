import java.util.Scanner;
public class lista4q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o primeiro algarismo: ");
        int num1 = scanner.nextInt();

        System.out.print("\nDigite o segundo algarismo: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1,num2);

        System.out.println("\nNúmeros entre " + menor + " e " + maior + ":");

        for (int i=menor+1; i<=maior-1; i=i+1) {
            System.out.println(i);
        }
        scanner.close();
    }
}
