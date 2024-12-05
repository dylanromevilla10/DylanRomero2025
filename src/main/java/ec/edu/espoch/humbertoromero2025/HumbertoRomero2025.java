package ec.edu.espoch.humbertoromero2025;

import java.util.Scanner;
import java.util.Stack;

public class HumbertoRomero2025 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> resultados = new Stack<>();
        Stack<Integer> deshacer = new Stack<>();
        int resultadoActual = 0;

        while (true) {
            System.out.println("Resultado actual: " + resultadoActual);
            System.out.print("Ingrese un numero para sumar o elija si quiere deshacer  o salir : ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            } else if (input.equalsIgnoreCase("deshacer")) {
                if (!resultados.isEmpty()) {
                    deshacer.push(resultadoActual);
                    resultadoActual = resultados.pop();
                    System.out.println("ultima operacion deshecha. Resultado actual: " + resultadoActual);
                } else {
                    System.out.println("No hay operaciones para deshacer.");
                }
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    deshacer.push(resultadoActual);
                    resultadoActual += numero;
                    resultados.push(resultadoActual);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un numero valido.");
                }
            }
        }

        System.out.println("Programa terminado. Resultado final: " + resultadoActual);
        scanner.close();
    }
}

        
    

