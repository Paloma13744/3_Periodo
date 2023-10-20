
package node_main;

/**
 *Implemente um código para remover o nó filho do meio, sem se perder o nó folha.
 * @author 0056518
 */
public class Node_02 {
    public static void main(String[] args) {
        Node no = new Node();
        no.id = 5 ;
        Node n2 = new Node();
        n2.id = 3;
        no.filEsq = n2;   // Recebe 3    // Atribuição de refer~encia
        no.filDir = new Node();
        Node n3 = new Node();
        n3.id = 0;
        no.filDir = n3;
        
        
        
        Node n2_2 = new Node();
        no.filEsq = n2_2;
        
        
        
        
        
        
        
        
        
        System.out.println("");
        
        
        
        
    }
}
class Node{
    public int id;
    Node filEsq ;
    Node filDir;
}