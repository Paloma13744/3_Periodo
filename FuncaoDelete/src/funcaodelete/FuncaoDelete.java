
package funcaodelete;

public class FuncaoDelete {
public static void main(String[] args) {
	    Tree tree = new Tree();
	    tree.raiz = new Node(10, null); 
	    insert(tree.raiz, 20);
	    insert(tree.raiz, 15);
	    delete(tree, 20);
	    buscaPrint(10, tree.raiz);
	    buscaPrint(15, tree.raiz);
	}
	
	//inserir elemento na árvore
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
	
	//deletar elemento da árvore
	public static void delete(Tree tree, int idDelete){
	    
	    Node z = buscaNode(idDelete, tree.raiz);
	    
	    if(z.filhoDireita == null && z.filhoEsquerda == null){
	        if(z.pai == null){//raiz deve ser eliminada
	            tree.raiz = null;
	            return;
	        }
	        if(z.id < z.pai.id)
	            z.pai.filhoEsquerda = null;
	        else
	            z.pai.filhoDireita = null;
	    }
	    //se um dos filhos for nulo basta substituir
	    if(z.filhoDireita == null){
	        if(z.pai == null){//raiz
	            tree.raiz = z.filhoEsquerda;
	            return;
	        }
	        if(z.id < z.pai.id)
	            z.pai.filhoEsquerda = z.filhoEsquerda;
	        else
	            z.pai.filhoDireita = z.filhoEsquerda;
	        /*
	        Outra forma:
	        z.id = z.filhoEsquerda.id;
	        z.filhoEsquerda = z.filhoEsquerda.filhoEsquerda;
	        z.filhoDireita = z.filhoEsquerda.filhoDireita;
	        */
	        return;
	    }
	    else if(z.filhoEsquerda == null){
	        if(z.pai == null){//raiz
	            tree.raiz = z.filhoDireita;
	            return;
	        }
	        if(z.id < z.pai.id)
	            z.pai.filhoEsquerda = z.filhoDireita;
	        else
	            z.pai.filhoDireita = z.filhoDireita;
	        //não basta fazer z = z.filhoEsquerda
	        /*z.id = z.filhoDireita.id;
	        z.filhoEsquerda = z.filhoDireita.filhoEsquerda;
	        z.filhoDireita = z.filhoDireita.filhoDireita;*/
	        return;
	    }
	    
	    Node y = busca_menor(z.filhoDireita);
	    if(y == null)
	        return;
	    System.out.println("y--->"+y.id);
	    //atualiza possível filho direito de y
	    if(y.filhoDireita != null){
	        y.pai.filhoEsquerda = y.filhoDireita;
	        y.filhoDireita.pai = y.pai;
	    }else{
	        y.pai.filhoEsquerda = null; 
	    }
	    //--------
	    z.id = y.id;
	}
	
	//obter raiz de um elemento da árvore
	public static Node getRaiz(Node node){
	    if(node.pai == null)
	        return node;
	    else
	        return getRaiz(node.pai);
	}
	
	//busca menor elemento a partir de um nó (sub-árvore)
	public static Node busca_menor(Node n){
	    if(n == null)
	        return null;
	        
	    if(n.filhoEsquerda == null)
	        return n;
	    else
	        return busca_menor(n.filhoEsquerda);
	}
	
	//busca um nó pelo id
	public static Node buscaNode(int idBusca, Node node){
	    if(node == null){
	        return null;
	    }
	    
	    if(idBusca == node.id){
	        return node;
	    }
	    
	    if(idBusca < node.id)
	        return buscaNode(idBusca, node.filhoEsquerda);
	    else
	        return buscaNode(idBusca, node.filhoDireita);
	}
	
	//busca um elemento pelo id para fazer sua impressão
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

class Tree{
    public Node raiz;
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


