package pruebaaa;

public class Pruebaaa {

    //algoritmo de busqueda lineal en java
    public static void main(String[] args) {

        int[] arr;
        arr = new int[20];
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

        for (j = 0; j < numElems; j++) {
            System.out.println(arr[j]);

        }

        System.out.println("");
        buscarItem = 70;//este es el elemento que buscaremos en el array
        for (j = 0; j < numElems; j++) {

            if (arr[j] == buscarItem) {
                break;
            

        }
        if (j == numElems) {
            System.out.println("no se encontro el elemento buscado");
        } else {
            System.out.println("Se encontro el elemento buscado: " + buscarItem);
        }
        
    }

    }

}
