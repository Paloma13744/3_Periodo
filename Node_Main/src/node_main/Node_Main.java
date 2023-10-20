
package node_main;

/**
 *
 * @author 0056518
 */
public class Node_Main {

    public static void main(String[] args) {
        Node raiz = new Node();
        raiz.id = 10;
        raiz.filhoEsquerdo = new Node();
        raiz.filhoEsquerdo.id = 5;
        raiz.filhoDireito = new Node();
        raiz.filhoDireito.id = 15;
        raiz.filhoEsquerdo.filhoEsquerdo = new Node();
        raiz.filhoEsquerdo.filhoEsquerdo.id = 1;
        
        System.out.println("Raiz ->" + raiz.id);
        System.out.println("Filho Esquerdo ->" + raiz.filhoEsquerdo.id);
        System.out.println("Filho Esquerdo Esquerdo ->" + raiz.filhoEsquerdo.filhoEsquerdo.id);
        
    }
    
}

class Node {   // Node : nó

    public int id;
    Node filhoEsquerdo;
    Node filhoDireito;
}
