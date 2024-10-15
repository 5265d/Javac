public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeTotal;
    private int quantidadeEmprestada;

    public Livro(String titulo, String autor, int quantidadeTotal) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeTotal = quantidadeTotal;
        this.quantidadeEmprestada = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeTotal - quantidadeEmprestada;
    }

    public void emprestar() {
        if (quantidadeEmprestada < quantidadeTotal) {
            quantidadeEmprestada++;
        } else {
            throw new LivroNaoDisponivelException("Nenhum exemplar na Biblioteca.");
        }
    }

    public void devolver() {
        if (quantidadeEmprestada > 0) {
            quantidadeEmprestada--;
        } else {
            throw new LivroNaoDisponivelException("Você não tem o livro para devolver.");
        }
    }

    public boolean podeDevolver() {
        return quantidadeEmprestada > 0;
    }

    @Override
    public String toString() {
        return titulo + " por " + autor + " - Exemplares disponoveis: " + getQuantidadeDisponivel();
    }
}
