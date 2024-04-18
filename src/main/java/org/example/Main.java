import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int[][] matrizAdjacencias(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    matriz[i][j] = 1;
                }
            }
        }
        return matriz;
    }

    public static ArrayList<ArrayList<Integer>> listaAdjacencias(int n) {
        ArrayList<ArrayList<Integer>> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> adjacencias = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    adjacencias.add(j);
                }
            }
            lista.add(adjacencias);
        }
        return lista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de vértices (n): ");
        int n = scanner.nextInt();

        System.out.println("\nMatriz de adjacências para o grafo completo Kn:");
        int[][] matriz = matrizAdjacencias(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nLista de adjacências para o grafo completo Kn:");
        ArrayList<ArrayList<Integer>> lista = listaAdjacencias(n);
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (Integer adjacente : lista.get(i)) {
                System.out.print(adjacente + " ");
            }
            System.out.println();
        }
    }
}
