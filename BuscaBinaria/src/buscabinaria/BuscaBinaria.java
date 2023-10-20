package buscabinaria;

public class BuscaBinaria {

    public class Main {

        public static void main(String[] args) {
            int[] vetor = {2, 4, 8, 10, 12, 14, 16, 18, 20, 22, 24};
            int fim = vetor.length - 1;
            buscaBinaria(vetor, 0, fim, 22);
        }

        public static void buscaBinaria(int[] vetor, int inicio, int fim, int busca) {
            int iMeio = (inicio + fim) / 2;
            if (vetor[iMeio] == busca) {
                System.out.println("Achei na pos.:" + iMeio);
                return;
            }
            if (inicio == fim) {
                System.out.println("O elemento não se encontra");
                return;
            }
            if (busca > vetor[iMeio]) { //vai para direita
                buscaBinaria(vetor, iMeio + 1, fim, busca);
            }
            if (busca < vetor[iMeio]) {
                buscaBinaria(vetor, inicio, iMeio - 1, busca);
            }
        }
        

    }
}
