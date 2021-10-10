//#########################
//Arbol Binario Sencillo
//#########################
package edu.upb.algorithm.binarytree;

public class BinTree {

    public Node root;

    public BinTree() {
        this.root = null;
    }


    public Node subBinTree(Node left, Object object, Node right) {
        return new Node(left, object, right);
    }

    public void inOrden(Node root) {
        if(root == null) {
            return;
        }
        inOrden(root.left);
        System.out.print(root.object + " ");
        inOrden(root.right);
    }

    public void posOrden(Node root) {
        if(root == null) {
            return;
        }
        posOrden(root.left);
        posOrden(root.right);
        System.out.print(root.object + " ");
    }

    public void preOrden(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.object + " ");
        preOrden(root.left);
        preOrden(root.right);
    }

    public Node ubicarElementoBinario(int valor ,Node raiz){
        if (raiz == null) {
            return new Node(valor);
        }

        if (valor < (int) raiz.object) {
            raiz.left = ubicarElementoBinario(valor,raiz.left);
        } else if (valor > (int) raiz.object) {
            raiz.right = ubicarElementoBinario(valor,raiz.right);
        } else {

            return raiz;
        }

        return raiz;
    }



    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
//Desarrollado por Estefany Rueda ID:000402237,Sergio Baron ID:000400032, Pedro Gomez ID:000396221