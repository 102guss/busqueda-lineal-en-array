package pruebaaa;

public class arregloOrdenado {

    private long[] arr;                             //referencia con elementos del tipo long
    private int numElems;                          //numero actual de elementos del arreglo

    public arregloOrdenado(int tam) {

        arr = new long[tam];                         //crea arreglo del tamaño igual a tam  
    }

    //....................................................................................
    //busqueda binaria. retorna posicion del elemento dato en el arreglo, caso conreario retorna -1
    public int busquedaBinaria(long dato) {
        int minimo = 0;                        //indice minimo del arreglo
        int maximo = numElems - 1;              //indice maxomo del arreglo
        int central;                         //indice del punto central del arreglo
        while (minimo <= maximo) {
            central = (minimo + maximo) / 2;       //calcula en pinto central del arreglo 

            if (arr[central] == dato) {
                return central;                       //elemento encontrado
            } else {
                if (dato > arr[central]) {         //elemento se encuentra en e indice superior

                    minimo = central + 1;
                } else {
                    maximo = central - 1;
                }
            }
        }
        return -1;
    }
 //..................................................................................................
    //inserta dato en ele arreglo
    public void insertar(long dato){
    int j;
        for (j = 0; j < numElems; j++) {      //recorre arreglo elemento por elemento
            if(arr[j] > dato){              //elemento en la posicion j es mayor que ele elmento a insertar
            break;                           // se detienen bucle, elemento a  insertar estara en posocion j
            }
         
        }
        //desplaza celdas en el arreglo una posicion hacia arriba del indice j donde se inserta el elemento
    
        for (int k = numElems; k > j; k--) {   //recorre en reverza desde el ultimo indice hacia el inidice j
            arr[k] = arr[k-1];                 //copia valor de una celda hacia arriba
        }
        arr[j]=dato;                            //insera dato en arreglo
        numElems++;                             //incrementa numero actual de elementos arreglo
         
    }
    
   

}
