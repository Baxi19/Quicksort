/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Randald
 */
public class Ordenador2 {
    
// quicksort
public void quick(int[] arreglo,int primero, int ultimo){
    //variables para la izq, derecha un pivote y un aux
    int izquierda,derecha,pivote, auxiliar;
    
    //punteros para guardar valores
    izquierda = primero;
    derecha = ultimo;
    System.out.println("Primero =" + primero +"\n" );
    System.out.println("ultimo =" + ultimo +"\n");
    System.out.println("derecha =" + derecha +"\n");
    System.out.println("Izquierda =" + izquierda +"\n");
    
    //Elemento para comparar
    pivote = arreglo[primero];
    System.out.println("Pivote =" + pivote +"\n");
    //Mientras que izquierda sea menor que derecha
    do{ 
        //mientras que el valor de la izquierda sea menor que el valor del pivote
        while(arreglo[izquierda]<pivote){
            imprimeArreglo(arreglo);
            izquierda++;//avanza el indice izquierdo
            System.out.println("Avanza el indice izquierdo = " + izquierda + "\n");
        }
        
        //mientras que el valor de la derecha sea menor que el valor del pivote
        while(arreglo[derecha]>pivote){
            imprimeArreglo(arreglo);
            derecha--;//retrocede el indice derecho
            System.out.println("retrocede el indice derecho =" + derecha + "\n");
        }
        
        // ********Aqui se hace el intercambio de variables************
        // si el valor de la izquierda es menor que el de la derecha
        if(izquierda<=derecha){
            auxiliar = arreglo[izquierda];//Guardamos el valor de la izquierda en el aux
            arreglo[izquierda] = arreglo[derecha];//agregamos el valor a izquierda
            arreglo[derecha] = auxiliar;//agregamos el valor a derecha
            izquierda++; //avanzamos a la izquierda 1 posicion
            derecha--; // disminuimos a la derecha 1 posicion
            imprimeArreglo(arreglo);
            System.out.println("Movimiento de elementos de izquierda =" + izquierda +  " a derecha" + derecha +" y avanzamos en ambos punteros:" + "\n" );
         }
    
    //mientras que izquierda sea menor que derecha    
    }while(izquierda<derecha);
    imprimeArreglo(arreglo);
    
    //si el primero es menor que el puntero derecha
    if(primero < derecha){
        //Enviamos los valores de la lista desde el inicio hasta donde se toparon los punteros
        quick(arreglo, primero, derecha);//quick(arreglo, primero, punteros derecha);
        System.out.println("Se llama recursivo porq primero ="+ primero +" es menor que derecha =" + derecha + "\n");
    }
       
    //si el puntero izquierda es menor que ultimo
    if(izquierda < ultimo){
        //Enviamos los valores de la lista desde donde se toparon los punteros hasta el inicio 
        quick(arreglo, izquierda, ultimo);//quick(arreglo, punteros izquierda, ultimo);
        System.out.println("Se llama recursivo porq izquierda =" + izquierda + " es menor que ultimo ="+ultimo + "\n");
    }
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