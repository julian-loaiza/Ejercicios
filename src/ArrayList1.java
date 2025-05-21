//Escribe un programa que pida 10 números por teclado y que luego muestre los
//números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//máximo y del mínimo respectivamente.
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosCopia = new ArrayList<>();
        Random random = new Random();

        // Generate 10 random numbers between 0 and 100
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(101)); // 101 is exclusive upper bound
        }
        // agregar un elemento con add
        numeros.add(10, 777);

        Collections.sort(numeros); // Sort the list
        // Requiero hacer una copia de la lista a la lista numerosCopia
        for (int i = 0; i < numeros.size(); i++) {
            numerosCopia.add(numeros.get(i));
        }
        Collections.reverse(numeros);// Reverse the list

        int maximo = Collections.max(numeros);
        int minimo = Collections.min(numeros);

        System.out.println("\nNúmeros introducidos a la lista copiada:");
        for (int numero : numeros) {
            if (numero == maximo) {
                System.out.println(numero + " (máximo)");
            } else if (numero == minimo) {
                System.out.println(numero + " (mínimo)");
            } else {
                System.out.println(numero);
            }
        }

        System.out.println("\nNúmeros introducidos:");
        for (int numero : numerosCopia) {
            if (numero == maximo) {
                System.out.println(numero + " (máximo)");
            } else if (numero == minimo) {
                System.out.println(numero + " (mínimo)");
            } else {
                System.out.println(numero);
            }
        }


    }
}
