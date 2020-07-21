package pruebaaa;

public class ArregloEncapsuladoApp {

    public static void main(String[] args) {
        //1. creamos arreglo con un tamaño de 30 elementos.
        int tamañoArreglo = 30;                          //tamaño Areglo
        Arreglo_1 arr;                                 //referencia Arreglo
        arr = new Arreglo_1(tamañoArreglo);            //crea instancia de la clse arreglo. El conr¡trutor
        //acepta como argumento el tamaño del arreglo

        //2. insertamos 10 elementos en un arreglo
        arr.insertar(10);
        arr.insertar(9);
        arr.insertar(8);
        arr.insertar(7);
        arr.insertar(6);
        arr.insertar(5);
        arr.insertar(4);
        arr.insertar(3);
        arr.insertar(2);
        arr.insertar(1);

        //3. imprimimos los valores del arreglo en pntalla
        arr.mostrarElementos();

        //4. Buscamos elemeno en arreglo
        int valorBuscar = 9;

        if (arr.buscar(valorBuscar)) {

            System.out.println("se encontro el valor: " + valorBuscar);
        } else {
            System.out.println("No se encontro el vaor a buscar: " + valorBuscar);
        }
        //5 Borramops 3 elementos del arreglo
        arr.eliminar(1);
        arr.eliminar(2);
        arr.eliminar(3);
        // 6. imprimimos valores del arreglo nuevamente
        arr.mostrarElementos();
        System.out.println("se eliminaron tres elementos del arreglo");
    }
}
