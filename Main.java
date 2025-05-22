import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o nome da pessoa:");
            String nome = sc.nextLine();
            System.out.println();

            System.out.println("Digite a idade da pessoa:");
            int idade = sc.nextInt();
            System.out.println();

            // Usando o construtor com parâmetros
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoa.exibirDados();
        }
    }
}
