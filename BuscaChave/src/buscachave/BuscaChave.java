
package buscachave;

public class BuscaChave {

    public static void main(String[] args) {
       
    }
    public static void buscaChave(Node node, int busca){
        if(node == null){
            System.out.println
                ("Elemento não se encontra na árvore");
            return;
        }
        if(node.id == busca){
            System.out.println("Elemento encontrado!");
            return;
        }
        if(busca < node.id){
            System.out.println("Indo para esquerda");
            buscaChave(node.filhoEsquerda, busca);
        }else{
            System.out.println("Indo para direita");
            buscaChave(node.filhoDireita, busca);
        }
       
    }
}
class Node{
    int id;
    Node filhoEsquerda;
    Node filhoDireita;
}