package aedi_02;

/**
 * Primeira aula de AEDI 2
 *
 * @author 0056518
 */
public class Aedi_02 {
    public static void main(String[] args) {
        // n1 : Raíz da árvore
        Node n1 = new Node();
        n1.id = 5;
        Node n2 = new Node();
        n2.id = 3;
        n1.filhoEsquerdo = n2;   // Atribuição de referência
        //alteraId(n2);

        Node n2_2 = new Node();   
        n2_2.id = 1;
        n1.filhoEsquerdo = n2_2;   
        
        n2 = null; // Objeto perdeu a referência , pois foi substituído pelo n2_2
        /** Coletor de lixo do java vai eliminar o objeto de id = 3
         * 
         */
        
        System.out.println("n1 filho Esquerdo->" + n1.filhoEsquerdo.id);
       // System.out.println("n2 ->" + n2.id);
        
        n1.filhoEsquerdo.filhoDireito = new Node();
        n1.filhoEsquerdo.filhoDireito.id = 100;
        System.out.println("n1.fihoEsquerda.filhoDireita ->" + n1.filhoEsquerdo.filhoDireito.id);
        //System.out.println("-> " + n1.id);
        //System.out.println("-> " + n2.id);
        //System.out.println("-> " + n1.filhoEsquerdo.id);

    }

    public static void alteraId(Node node) {
        node.id++;
    }
}

class Node {   // Node : nó

    public int id;
    Node filhoEsquerdo;
    Node filhoDireito;
}
