package ec.edu.espoch.humbertoromero2025;

import java.util.Stack;

public class HumbertoRomero2025 {

    public static void main(String[] args) {

       
        Stack<Integer> pila = new Stack<>();

        
        pila.push(7);
        pila.push(5);
        pila.push(4);

        
        System.out.println("Elemento en la parte superior: " + pila.peek());

        
        System.out.println("Elemento desapilado: " + pila.pop());

        
        System.out.println("La pila esta vacía " + pila.empty());

       
        System.out.println("Tamaño de la pila: " + pila.size());
    }
}
        
    

