public class LivroNaoDisponivelException extends RuntimeException {
    public LivroNaoDisponivelException(String titulo) {
        super("Livro nao disponivel para emprestimo: " + titulo);
    }
}
