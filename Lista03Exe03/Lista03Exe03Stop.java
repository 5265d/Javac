public class Lista03Exe03Stop {

    public static void main(String[] args) {
        metodoRecursivo(0); 
    }

    public static void metodoRecursivo(int i) {
        System.out.println("Chamada recursiva: " + i);

        if (i > 100) { // Condição de parada
            return; 
        }
        metodoRecursivo(i + 1);
    }
}
