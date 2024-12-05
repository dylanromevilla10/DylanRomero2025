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
            System.out.print("Ingrese un número para sumar (o 'deshacer' para deshacer la última operación, 'salir' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            } else if (input.equalsIgnoreCase("deshacer")) {
                if (!resultados.isEmpty()) {
                    deshacer.push(resultadoActual); // Guardar el resultado actual antes de deshacer
                    resultadoActual = resultados.pop(); // Deshacer la última operación
                    System.out.println("Última operación deshecha. Resultado actual: " + resultadoActual);
                } else {
                    System.out.println("No hay operaciones para deshacer.");
                }
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    deshacer.push(resultadoActual); // Guardar el resultado actual antes de realizar la suma
                    resultadoActual += numero; // Realizar la suma
                    resultados.push(resultadoActual); // Almacenar el nuevo resultado
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                }
            }
        }

        System.out.println("Programa terminado. Resultado final: " + resultadoActual);
        scanner.close();
    }
}


        
    

