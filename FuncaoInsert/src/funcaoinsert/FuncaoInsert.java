
package funcaoinsert;

public class FuncaoInsert {

    public static void main(String[] args) {
        Node raiz = new Node(10, null);
        insert(raiz, 15);
        insert(raiz, 5);
        buscaPrint(10, raiz);
        buscaPrint(15, raiz);
        buscaPrint(5, raiz);
        insert(raiz, 2);
        buscaPrint(5, raiz);
    }
   
    public static void insert(Node node, int insertId){
       
        if(node == null){//raiz vazia
            Node novoNode = new Node(insertId, null);
            return;
        }
       
        if(insertId < node.id ){
            if(node.filhoEsquerda == null)
                node.filhoEsquerda = new Node(insertId, node);
            else
                insert(node.filhoEsquerda, insertId);
            return;
        }
        else if(insertId > node.id ){
            if(node.filhoDireita == null)
                node.filhoDireita = new Node(insertId, node);
            else
                insert(node.filhoDireita, insertId);
            return;
        }
    }
   
    public static void buscaPrint(int idBusca, Node node){
        if(node == null){
            System.out.println("Nó não se encontra na árvore!");
            return;
        }
       
        if(idBusca == node.id){
            System.out.println(node.id);
            if(node.filhoEsquerda != null)
                System.out.println("Filho esquerda: "+node.filhoEsquerda.id);
            else
                System.out.println("Filho esquerda: null");
            if(node.filhoDireita != null)
                System.out.println("Filho direita: "+node.filhoDireita.id);
            else
                System.out.println("Filho direita: null");
       
            return;
        }
       
        if(idBusca < node.id)
            buscaPrint(idBusca, node.filhoEsquerda);
        else
            buscaPrint(idBusca, node.filhoDireita);
    }
   
}
class Node{
    public int id;
    public Node pai;
    public Node filhoDireita;
    public Node filhoEsquerda;
    public Node(int id, Node pai){
        this.id = id;
        this.pai = pai;
    }
}
    
    

