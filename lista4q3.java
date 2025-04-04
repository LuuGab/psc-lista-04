import java.util.Scanner;
public class lista4q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.print("\n1) Digite o seu nome (3 Caracteres ou superior): ");
        String nome = scanner.nextLine();

        if (nome.length()<3) {
            System.out.println("\nInválido. Insira seu nome novamente.");
            continue;
        } else {
            System.out.println("Credencial Válida. Olá, "+ nome);
        }
        
        System.out.print("\n2) Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (idade>150) {
            System.out.println("\nInválido. Insira sua idade novamente.");
            continue;
        } else {
            System.out.println("\nCredencial Válida.");
        }

        System.out.print("\n3) Digite sua renda salarial: ");
        int salario = scanner.nextInt();
        scanner.nextLine();

        if (salario>=0) {
            System.out.println("Credencial Válida.");
        } else {
            System.out.println("\nInválido. Digite seu salário novamente (>=0)");
            continue;
        }

        System.out.print("\n4) Digite o seu sexo (f/m): ");
        String sexo = scanner.nextLine();

        if (sexo.equals("f") || sexo.equals("m")) {
            System.out.println("\nCredencial válida.");
        } else {
            System.out.println("\nInválido. Digite seu sexo novamente (f/m).");
            continue;
        }

        System.out.print("\n5) Digite seu estado civil (s/c/v/d): ");
        String estCivil = scanner.nextLine();

        if (estCivil.equals("s") || estCivil.equals("c") || estCivil.equals("v") || estCivil.equals("d")) {
            System.out.println("\nCredencial Válida.");
        } else {
            System.out.println("\nInválido. Digite seu estado civil novamente (s/c/v/d).");
            continue;
        }

        System.out.println("\nDados Válidos:");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: "+ salario);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Estado Civil: "+ estCivil);
        
        break;
        }
        scanner.close();
    }
}
