package pruebaaa;

public class arregloOrdenadoAPP {

    public static void main(String[] args) {

        // 1. Cremos arreglo con elemento con 30 elementos
        int tamMax = 30;                                 //tamalo arreglo
        arregloOrdenado arrOrd;                         //referencia a la clase ArregloOrdenado

        arrOrd = new arregloOrdenado(tamMax);           //crea la instancia de la clase ArreglOrdenado con un  tamaño maximo de
        //elementos para el arreglo igual a la variable tamMax

        //2. Insertamos 10  valores al arreglo
        arrOrd.insertar(20);
        arrOrd.insertar(50);
        arrOrd.insertar(10);
        arrOrd.insertar(40);
        arrOrd.insertar(30);
        arrOrd.insertar(80);
        arrOrd.insertar(70);
        arrOrd.insertar(60);
        arrOrd.insertar(90);
        arrOrd.insertar(100);

        //3. imprimimos valores de arreglo arrOrd
        arrOrd.mosrtarAreglo();
        //4. Buscamos elemento en arreglo
        long buscar = 90;
        int posicion;

        posicion = arrOrd.busquedaBinaria(buscar);

        if (posicion != -1) {
            System.out.println("se enncontro elemento:" + buscar + " en la posicion: " + posicion);

        } else {
            System.out.println("no se encontro el elemento" + buscar);
        }

        //5. Borrar item del arreglo
        arrOrd.eliminar(20);
        arrOrd.eliminar(30);
        arrOrd.eliminar(40);

        //6. Mostrar valores del arreglo
        arrOrd.mosrtarAreglo();
    }

}
