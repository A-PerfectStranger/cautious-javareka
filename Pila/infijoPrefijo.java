package Pila;
import java.util.Stack;

public class infijoPrefijo {

    public static void main(String[] args) {
        String expresion = "5 * 4 + ((7/2) - 3)";
        String prefija = infijoAPrefijo(expresion);
        System.out.println(prefija);
    }

    public static String infijoAPrefijo(String expresion) {
        StringBuilder prefijo = new StringBuilder();
        StringBuilder expresionInvertida = new StringBuilder(expresion).reverse();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expresionInvertida.length(); i++) {
            char letra = expresionInvertida.charAt(i);
            if (Character.isLetterOrDigit(letra)) {
                prefijo.append(letra);
            } else if (letra == ')') {
                operadores.push(letra);
            } else if (letra == '(') {
                while (!operadores.isEmpty() && operadores.peek() != ')') {
                    prefijo.append(operadores.pop());
                }
                operadores.pop();
            } else if (esOperador(letra)) {
                while (!operadores.isEmpty() && precedencia(letra) <= precedencia(operadores.peek())) {
                    prefijo.append(operadores.pop());
                }
                operadores.push(letra);
            }
        }

        while (!operadores.isEmpty()) {
            prefijo.append(operadores.pop());
        }

        return prefijo.reverse().toString();
    }

    public static boolean esOperador(char operador) {
        return (operador == '+' || operador == '-' || operador == '*' || operador == '/');
    }

    public static int precedencia(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        } else if (operador == '^') {
            return 3;
        }
        return 0;
    }
}
