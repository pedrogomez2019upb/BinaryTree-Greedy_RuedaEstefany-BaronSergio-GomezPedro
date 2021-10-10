//#########################
//Arbol Binario Sencillo
//#########################
package edu.upb.algorithm.binarytree;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n########################");
        System.out.println("\nPrograma Insercion Elemento");
        System.out.println("\n########################");
        BinTree arbol = new BinTree();

        Node raiz= new Node(0);
        arbol.ubicarElementoBinario(1,raiz);
        arbol.ubicarElementoBinario(2,raiz);
        arbol.ubicarElementoBinario(3,raiz);
        arbol.ubicarElementoBinario(4,raiz);


        System.out.println("\n########################");
        System.out.println("\nSalida inOrden del arbol");
        arbol.inOrden(raiz);
        System.out.println("\n########################");
        System.out.println("\nSalida PosOrden del arbol");
        arbol.posOrden(raiz);
        System.out.println("\n########################");
        System.out.println("\nSalida PreOrden del arbol");
        arbol.preOrden(raiz);
    }
}
//Desarrollado por Estefany Rueda ID:000402237,Sergio Baron ID:000400032, Pedro Gomez ID:000396221