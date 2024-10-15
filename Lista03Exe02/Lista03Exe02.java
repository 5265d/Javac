import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lista03Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 2));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1));
        biblioteca.adicionarLivro(new Livro("Clean Code", "Robert C. Martin", 3));
        biblioteca.adicionarLivro(
                new Livro("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 2));
        biblioteca.adicionarLivro(new Livro("Effective Java", "Joshua Bloch", 2));
        biblioteca.adicionarLivro(new Livro("Introduction to Algorithms", "Thomas H. Cormen", 1));
        biblioteca.adicionarLivro(new Livro("The Pragmatic Programmer", "Andrew Hunt, David Thomas", 2));

        biblioteca.listarLivros();
        System.out.println();

        System.out.println("\nSolicitar Livro");
        System.out.println("============================");
        System.out.println("1. 'emprestar + livro'");
        System.out.println("   Exemplo: emprestar 1984");
        System.out.println("2. 'devolver + livro'");
        System.out.println("   Exemplo: devolver 1984");
        System.out.println("3. 'sair' - Encerrar o programa");
        System.out.println("============================\n");

        while (true) {
            System.out.print("Comando: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = input.split(" ", 2);
            if (partes.length < 2) {
                System.out.println("Erro: Comando inválido. Por favor, forneça um título.");
                continue;
            }

            String comando = partes[0];
            String titulo = partes[1];

            try {
                if (comando.equalsIgnoreCase("emprestar")) {
                    biblioteca.emprestarLivro(titulo);
                    System.out.println("Livro emprestado com o titulo: " + titulo);
                } else if (comando.equalsIgnoreCase("devolver")) {
                    biblioteca.devolverLivro(titulo);
                    System.out.println("Voce devolveu: " + titulo);
                } else {
                    System.out.println("Erro: Comando invalido. Tente novamente.");
                }
            } catch (LivroNaoEncontradoException | LivroNaoDisponivelException e) {
                System.out.println("Ops! " + e.getMessage());
            }
            System.out.println();
            biblioteca.listarLivros();
            System.out.println();

        }

        scanner.close();
    }
}
