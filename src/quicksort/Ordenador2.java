
package quicksort;

/**
 *
 * @author Randald
 */
public class Ordenador2 {
    
// quicksort
public void quick(int[] arreglo,int primero, int ultimo){
    //variables para la izq, derecha un pivote y un aux
    int der,izq,pivote, auxiliar;
    System.out.println("=====================================================================================================" + "\n");
    System.out.println("****LISTA******");
    imprimeArreglo(arreglo);
    System.out.println("**************" + "\n");
    //punteros para guardar valores
    der = primero;
    izq = ultimo;
    System.out.println("Primero = indice :" + primero +"\n" );
    System.out.println("ultimo = indice :" + ultimo +"\n");
    System.out.println("derecha = indice :" + izq +"\n");
    System.out.println("Izquierda = indice :" + der +"\n");
    
    //Elemento para comparar
    pivote = arreglo[primero];
    System.out.println("Pivote =" + pivote +"\n");
    //Mientras que izquierda sea menor que derecha
    do{ 
        //mientras que el valor de la derecha sea menor que el valor del pivote
        while(arreglo[der]<pivote){
           der++;//avanza el indice derecho
           }
        
        //mientras que el valor de la izquierda sea menor que el valor del pivote
        while(arreglo[izq]>pivote){
            izq--;//retrocede el indice izquierdo
        }
        
        // ********Aqui se hace el intercambio de variables************
        // si el valor de la derecha es menor o igual que el de la izquierda
        if(der<=izq){
            System.out.println("Es el inidice "+ der +" menor o igual que el indice " + izq + "?\n");
            auxiliar = arreglo[der];//Guardamos el valor de la derecha en el aux
            arreglo[der] = arreglo[izq];//agregamos el valor a derecha
            arreglo[izq] = auxiliar;//agregamos el valor a izquierda
            der++; //avanzamos a la derecha 1 posicion
            izq--; // disminuimos a la izquierda 1 posicion
            imprimeArreglo(arreglo);
            System.out.println("Ordenamiento entre numeros "+"\n" );
         }
    
    //mientras que derecha sea menor que izquierda    
    }while(der<izq);
    
    
    //si el primero es menor que el puntero izquierda
    if(primero < izq){
        //Enviamos los valores de la lista desde el inicio hasta donde se toparon los punteros
        quick(arreglo, primero, izq);//quick(arreglo, primero, punteros izquierda);
        System.out.println("Se llama recursivo porq primero ="+ primero +" es menor que derecha =" + izq + "\n");
    }
       
    //si el puntero derecha es menor que ultimo
    if(der < ultimo){
        //Enviamos los valores de la lista desde donde se toparon los punteros hasta el inicio 
        quick(arreglo, der, ultimo);//quick(arreglo, punteros derecha, ultimo);
        System.out.println("Se llama recursivo porq izquierda =" + der + " es menor que ultimo ="+ultimo + "\n");
    }
    System.out.println("Ciclo Finalizado con Exito \n");
}

//metodo para imprimir
public void imprimeArreglo(int[] numeros) {
        String imp = "";
        for (int i = 0; i < numeros.length; i++) {
            if (i != numeros.length - 1) {
                imp = imp + numeros[i] + ",";
            } else {
                imp = imp + numeros[i] + "";
            }
        }
        System.out.println(imp);
    }
}