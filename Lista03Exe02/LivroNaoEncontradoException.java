public class LivroNaoEncontradoException extends RuntimeException {
    public LivroNaoEncontradoException(String titulo) {
        super("Livro nao encontrado: " + titulo);
    }
}
