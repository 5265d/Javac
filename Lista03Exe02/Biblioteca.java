import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestar();
                return;
            }
        }
        throw new LivroNaoEncontradoException(titulo);
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.podeDevolver()) {
                    livro.devolver();
                } else {
                    throw new LivroNaoDisponivelException("Voce nao possue o livro para devolucao.");
                }
                return;
            }
        }
        throw new LivroNaoEncontradoException(titulo);
    }

    public void listarLivros() {
        System.out.println("\nLivros disponiveis:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
