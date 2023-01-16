
import java.util.ArrayList;

public class Funcoes {

    public static boolean checagem(int num, String tipo) {
        if(tipo.contentEquals("primos")) {
            if(num < 1) {
                System.out.println("Valor inválido. Digite novamente.");
                return false;
            } else {
                return true;
            }
        } else if(tipo.contentEquals("fibonacci")) {
            if(num <= 0) {
                System.out.println("Valor inválido.");
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int fibonacciRecursivo(int num) {
        if(num <= 0) {return 0;}
        else if (num == 1) {return 1;}
        else {return  fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);}
    }

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
