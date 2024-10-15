public class Lista03Exe03 {

    public static void main(String[] args) {
        metodoRecursivo(0);
    }

    public static void metodoRecursivo(int i) {
        // Este método chama a si mesmo repetidamente, imprimindo o número atual 'i'.
        System.out.println("Chamada recursiva: " + i);
        
        // Se um método não tiver uma condição que interrompa sua execução entrará em um loop infinito. Isso esgota a memória alocada para a pilha de chamadas, resultando em um estouro de pilha.

        // Para evitar o estouro de pilha adicionando uma condição de parada

            // if (i > 100) {
            //     return; 
            // }

            // Coloquei por exemplo Lista03Exe03Stop.java mostrando como da para ajustar isso usando a condição de parada.

        metodoRecursivo(i + 1);
    }
}
