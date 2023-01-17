import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal para testes
 * @author Mariana Steffen
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valInput;

        // Teste fibonacci linear
        System.out.println("Digite um número (fibonacci): ");

        valInput = false;
        while(!valInput) {
            num = scanner.nextInt();
            valInput = Funcoes.checagemFibonacci(num);
        }

        System.out.println(Funcoes.fibonacciLinear(num));

        // Teste fibonacci recursivo
        System.out.println("Digite um número (fibonacci): ");

        valInput = false;
        while(!valInput) {
            num = scanner.nextInt();
            valInput = Funcoes.checagemFibonacci(num);
        }

        System.out.println(Funcoes.fibonacciRecursivo(num));

        ArrayList<Integer> primos = new ArrayList<>();

        // Teste primos linear
        System.out.println("Digite um número (primos): ");

        valInput = false;
        while(!valInput) {
            num = scanner.nextInt();
            valInput = Funcoes.checagemPrimos(num);
        }

        System.out.println(Funcoes.primosLinear(num, primos));
        primos.clear();

        // Teste primos recursivo
        System.out.println("Digite um número (primos): ");

        valInput = false;
        while(!valInput) {
            num = scanner.nextInt();
            valInput = Funcoes.checagemPrimos(num);
        }

        System.out.println(Funcoes.primosRecursivo(num, primos));
        primos.clear();

    }
}