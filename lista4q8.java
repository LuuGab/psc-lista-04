import java.util.Scanner;
public class lista4q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma =0;

            System.out.println("\nDigite 5 algarismos.");

            for (int i=1; i<=5; i++) {
              System.out.print("\nNúmero "+ i +": ");
              int number = scanner.nextInt();
              soma += number;
    }
    double media = soma / 5;
    System.out.println("\nA Soma dos Algarismos inseridos será de: "+ soma);
    System.out.println("\nA Média dos Algarismos inseridos será de: "+ media);

    scanner.close();
}

}
