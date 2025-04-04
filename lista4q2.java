import java.util.Scanner;
public class lista4q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.print("\nCadastre seu nome de usuário: ");
        int nome = scanner.nextInt();

        System.out.print("\nCadastre sua senha de usuário: ");
        int senha = scanner.nextInt();

        if (nome==senha) {
        System.out.print("\nCadastro Inválido. Não utilize o nome e senha iguais.");
        continue;
        } else {
            System.out.println("\nBem-vindo(a), "+ nome);
        }
        
        }
    }
}