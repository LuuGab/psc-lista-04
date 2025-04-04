import java.util.Scanner;
public class lista4q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=50; i++) {
            if (i%2==1) {
                System.out.print("\nO número "+ i +" é impar.");
            } else {
                System.out.print("\nO número "+ i +" é par.");
            }
        }
        scanner.close();
    }
}
