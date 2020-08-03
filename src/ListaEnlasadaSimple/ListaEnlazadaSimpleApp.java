
package ListaEnlasadaSimple;


public class ListaEnlazadaSimpleApp {
    public static void main(String[] args) {
		// creamos instancia de la clase ListaEnlazadaSimple
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		
		// insertamos 5 elementos del tipo double a la cabeza de la lista enlazada
		lista.insertarCabezaLista(2.98);
		lista.insertarCabezaLista(3.11);
		lista.insertarCabezaLista(1.2);
		lista.insertarCabezaLista(12.212);
		lista.insertarCabezaLista(8.732);
		
		// mostramos los nodos de la lista enlazada simple
		lista.mostrarLista();
	
		// insertamos nuevo nodo entre dos nodos de la lista enlazada simple
		Nodo nodo = lista.insertar(1.2,45);
		if(nodo == null) {
			System.out.println("No se pudo insertar nuevo nodo");
		} else {
			System.out.println("Nodo se inserto correctamente");
		}
		
		// volvemos a mostrar nodos de la lista enlazada (verificamos si la insercion del nodo es correcta)
		lista.mostrarLista();
		
		// buscamos nodo en la lista enlazada simple
		nodo = lista.buscarLista(3.11);
		if(nodo != null) {
			System.out.println("Se encontro nodo con dato buscado");
		} else {
			System.out.println("No se encontro nodo con dato buscado");
		}
		
		// borramos nodos de la lista enlazada simple
		while(!lista.vacia()) {
			nodo = lista.eliminarCabezaLista();
			System.out.println("Nodo eliminado");
			nodo.mostrarNodo();
			System.out.println("");
		}
		
		// comprobamos nuevamente si la lista enlazada simple esta vacia
		System.out.println("Lista enlazada simple esta vacia? " + lista.vacia());
		lista.mostrarLista();
		
		// insertamos nuevos nodos a la lista enlazada simple
		lista.insertarCabezaLista("Perro");
		lista.insertarCabezaLista("Gato");
		lista.insertarCabezaLista("Caballo");
		lista.insertarCabezaLista("Conejo");
		
		// mostramos nodos de la lista enlazada
		lista.mostrarLista();
		
		// eliminamos un nodo
		lista.eliminar("Gato");
		
		// mostramos nodos de la lista enlazada simple
		lista.mostrarLista();		
	}

    
}
