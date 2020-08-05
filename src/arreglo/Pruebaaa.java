package arreglo;

public class Pruebaaa {

    //algoritmo de busqueda lineal en java
    public static void main(String[] args) {

        int[] arr;               //se declara el tipo y nombre del arreglo
        arr = new int[20];       //se inicializa el arreglo a partir del nombre
        int numElems;
        int j;
        int buscarItem;
        //inicializamos en arrelgo
        arr[0] = 10;
        arr[1] = 40;
        arr[2] = 50;
        arr[3] = 20;
        arr[4] = 30;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 90;
        arr[8] = 80;
        arr[9] = 100;

        numElems = 10;

        for (j = 0; j < numElems; j++) {
            if (arr[j] == 60) {
                System.out.println("elemento: " + arr[j] + "-posicion: " + "[" + j + "]");
            }

        }//este esxperimentito lo hice yo, para saber la posicion siempre va adentro del bucle

        for (j = 0; j < numElems; j++) { //recorremos todo el arreglo
            System.out.print(arr[j] + " ");

        }

        System.out.println("");
        buscarItem = 120;               //este es el elemento que buscaremos en el array
        for (j = 0; j < numElems; j++) {

            if (arr[j] == buscarItem) {

                break;

            }
        }
        if (j == numElems) {
            System.out.println("no se encontro el elemento buscado");
        } else {
            System.out.println("Se encontro el elemento buscado: " + buscarItem);
        }
        System.out.println("");

        /*ahoraborraremos un elemento del arreglo sobreescribiendo los elementos superiores
    a la posicion donde estaba el elemento a borrar*/
        buscarItem = 10;
        for (j = 0; j < numElems; j++) { //recorremos el array pa encontrar el indice del elemto a borrar

            if (arr[j] == buscarItem) {
                break;                  //cuando lo encuentre que se rompa el ciclo
            }

        }
        for (int k = j; k < numElems; k++) {
            arr[k] = arr[k + 1];     //a "k", le asignare,os el indice del siguiente elemento(estaremos reescribiendo)
        }
        numElems--; //como sobro una casila en el array, se decrementa en uno para ajustar el tamaño

        for (j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " "); //mostraremos de nuevo el arreglo despues de haber echo los cambios convenientes

        }
        System.out.println("");
        System.out.println("se elimino el numero 10 y se recorrieon los demas");
        
        /*en conclusion nada mas agregamoos el metodo buscar y y eliminar en un arreglo lineal
        / aplicado en el metodo main*/

    }

}
