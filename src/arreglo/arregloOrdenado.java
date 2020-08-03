package arreglo;

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

    public void insertar(long dato) {
        int j;
        for (j = 0; j < numElems; j++) {      //recorre arreglo elemento por elemento
            if (arr[j] > dato) {              //elemento en la posicion j es mayor que ele elmento a insertar
                break;                           // se detienen bucle, elemento a  insertar estara en posocion j
            }

        }
        //desplaza celdas en el arreglo una posicion hacia arriba del indice j donde se inserta el elemento

        for (int k = numElems; k > j; k--) {   //recorre en reverza desde el ultimo indice hacia el inidice j
            arr[k] = arr[k - 1];                 //copia valor de una celda hacia arriba
        }
        arr[j] = dato;                            //insera dato en arreglo
        numElems++;                             //incrementa numero actual de elementos arreglo

    }

    //...........................................................................................................
    // elimina dato de arreglo; retorna false si no se puede eliminar dato porque no existe en arreglo
    public boolean eliminar(long dato) {
        int j = busquedaBinaria(dato);                    //realiza busqueda de argumento dato en arreglo. Retorna indice con la 
                                                          //ubucacion de dato arreglo
        if (j == -1) {                                    //no se encontro elemento dato en areglo
            return false;
        } else {
            for (int k = j; k < numElems; k++) {          //desplazar elementos arreglo hacia abajo a partir de indice j
                arr[k] = arr[k + 1];                      //desplaza elemento hacia abajo

            }
            numElems--;                                   //decrementa en uno la cantidad de elementos en el arreglo

        }
        return true;                                      //todo bie, se borro elemento dato
    }
    //......................................................................................................................
    
    //muestra el contenido del arreglo
    public void mosrtarAreglo(){
    
    
        for (int j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " ");
        }
        
        System.out.println("");
    }
    
    //......................................................................................................................
    //miestra el valor del elemento en la posicion i del arreglo
    public long valorElemento(int i){
    return arr[i];
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
