
package material;

public class Material {

    public static void main(String[] args) {
        Node raiz = new Node();
        raiz.id = 10;
        
        raiz.filhoEsquerdo = new Node();
        raiz.filhoEsquerdo.id = 5;
        
        raiz.filhoDireito = new Node();
        raiz.filhoDireito.id = 15;
        
        raiz.filhoEsquerdo.filhoEsquerdo = new Node();
        raiz.filhoEsquerdo.filhoEsquerdo.id = 1;
        
        System.out.println("Lado esquerdo->");
        imprimirLadoEsq(raiz);
        System.out.println("Lado direito->");
        imprimirLadoDir(raiz);
        
        
    }
    public static void imprimirLadoEsq(Node n){
        if(n == null) {
            return;
        } 
        System.out.println(n.id);
        imprimirLadoEsq(n.filhoEsquerdo);
        
    }
    public static void imprimirLadoDir(Node n){
        if(n == null)
            return;
        System.out.println(n.id);
        imprimirLadoDir(n.filhoDireito);
    }
}


class Node{
    int id;
    Node filhoEsquerdo;
    Node filhoDireito;
    
}