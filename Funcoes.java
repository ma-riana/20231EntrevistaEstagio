import java.util.ArrayList;

/**
 * Classe destinada às funções utilizadas na classe Main
 * @author Mariana Steffen
 */

public class Funcoes {

    /**
     * Checagem de input para as funções de Fibonacci
     * @param num valor a ser avaliado
     * @return boolean de confirmação de input
     */

    public static boolean checagemFibonacci(int num) {

        if(num <= 0) {
            System.out.println("Valor inválido. Digite novamente.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checagem de input para as funções de primos
     * @param num valor a ser avaliado
     * @return boolean de confirmação de input
     */

    public static boolean checagemPrimos(int num) {

        if(num < 1) {
            System.out.println("Valor inválido. Digite novamente.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Função recursiva para a obtenção de um número na sequência Fibonacci
     * @param num número da sequência Fibonacci a ser retornado
     * @return int correspondente ao parametro num recebido na sequencia Fibonacci
     */

    public static int fibonacciRecursivo(int num) {
        if(num <= 0) {return 0;}
        else if (num == 1) {return 1;}
        else {return  fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);}
    }

    /**
     * Função linear para a obtenção de um número na sequência Fibonacci.
     * @param num número da sequência Fibonacci a ser retornado
     * @return int correspondente ao parametro num recebido na sequencia Fibonacci
     */

    public static int fibonacciLinear(int num) {
        int temp1 = 0;
        int temp2 = 1;
        int resultado = 0;

        if (num <= 0) {return 0;}
        else if (num == 1) {return 1;}
        else {
            for(int i = 2; i <= num; i++) {
                resultado = temp1 + temp2;
                temp1 = temp2;
                temp2 = resultado;
            }
            return resultado;
        }
    }

    /**
     * Função recursiva para a obtenção de uma lista de números primos até determinado valor
     * @param num valor mais alto que a sequência de primos pode ter
     * @param lista lista dos números primos encontrados
     * @return lista dos números primos encontrados
     */

    public static ArrayList<Integer> primosRecursivo(int num, ArrayList<Integer> lista) {
        int primo = 0;

        if(num <= 1) {
            return lista;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = 1;
                    break;
                }
            }
            if (primo == 0) {
                lista.add(num);
            }
            return primosRecursivo(num - 1, lista);
        }
    }

    /**
     * Função linear para a obtenção de uma lista de números primos até determinado valor
     * @param num valor mais alto que a sequência de primos pode ter
     * @param lista lista dos números primos encontrados
     * @return lista dos números primos encontrados
     */

    public static ArrayList<Integer> primosLinear(int num, ArrayList<Integer> lista) {
        int primo = 0;

        for(int i = 2; i <= num; i++) {
            for (int y = 2; y < i; y++) {
                if (i % y == 0) {
                    primo = 1;
                    break;
                }
            }
            if (primo == 0) {
                lista.add(i);
            }
            primo = 0;
        }
        return lista;
    }
}
