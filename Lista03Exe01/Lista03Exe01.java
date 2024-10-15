import java.util.Scanner;

public class Lista03Exe01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        while (true) {
            try {
                System.out.print("Digite o primeiro numero positivo: ");
                num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Digite o segundo numero positivo: ");
                num2 = Double.parseDouble(scanner.nextLine());

                if (num1 <= 0 || num2 <= 0) {
                    throw new IllegalArgumentException("Os numeros devem ser maiores que zero.");
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("Erro: Voce deve digitar um número valido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        double resultado = num1 / num2;
        System.out.println("Resultado da divisao: " + resultado);

        scanner.close();
    }
}
