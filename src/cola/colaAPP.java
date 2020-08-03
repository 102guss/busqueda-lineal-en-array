
package cola;


public class colaAPP {
    
    public static void main(String[] args) {
		Cola cola = new Cola(5);
		
		// insertamos 4 elementos a la cola
		cola.insertar(10);
		cola.insertar(15);
		cola.insertar(20);
		cola.insertar(25);
		
		while(!cola.colaVacia()) {
			Object n = cola.quitar();
			System.out.print(n);
			System.out.print(" ");
		}
		
		// insertamos 5 elementos
		cola.insertar("Perro");
		cola.insertar("Gato");
		cola.insertar("Caballo");
		cola.insertar("Leon");
		cola.insertar("Tigre");
		
		System.out.println("");
		System.out.print("ELEMENTO EN LA CABEZA DE LA COLA: ");
		System.out.print(cola.frenteCola());
		System.out.println("");
		
		System.out.print("ESTA COLA VACIA? ");
		System.out.println(cola.colaVacia());
		
		System.out.print("ESTA LA COLA LLENA? ");
		System.out.println(cola.colaLLena());
		
		System.out.print("TAMAÑO DE LA COLA: ");
		System.out.println(cola.tamanoCola());
		
		while(!cola.colaVacia()) {
			Object m = cola.quitar();
			System.out.print(m);
			System.out.print(" ");
		}
		System.out.println("");
	}

  
}
