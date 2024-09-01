package view;

import br.edu.fateczl.sort.Ordenacao;

public class Main {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
        int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};

        vetor1 = ordenacao.quickSort(vetor1, 0, vetor1.length - 1);
        vetor2 = ordenacao.quickSort(vetor2, 0, vetor2.length - 1);
        vetor3 = ordenacao.quickSort(vetor3, 0, vetor3.length - 1);

        System.out.println("Ordenação do Vetor 1 com Quick Sort: ");
        for (int valor : vetor1){
            System.out.print(" | " + valor);
        }

        System.out.println("\n\nOrdenação do Vetor 2 com Quick Sort: ");
        for (int valor : vetor2){
            System.out.print(" | " + valor);
        }

        System.out.println("\n\nOrdenação do Vetor 3 com Quick Sort: ");
        for (int valor : vetor3){
            System.out.print(" | " + valor);
        }
    }
}