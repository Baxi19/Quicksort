
package quicksort;

/**
 *
 * @author Randald
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {4,3,1,2};
        Ordenador2 ventana = new Ordenador2();
        ventana.quick(numeros,0, numeros.length -1 );
    }
    
}
