import java.util.LinkedList;

public class Grafo {
	int V;
	LinkedList<Integer> adjListArray[];

	Grafo(int V) {
		this.V = V;

		adjListArray = new LinkedList[V];

		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}

	static void añadirVertice(Grafo graph, int src, int dest) {
		System.out.println("Se añadio un vertice");
		graph.adjListArray[src].add(dest);

		graph.adjListArray[dest].add(src);
	}

	static void printGraph(Grafo graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Lista de adyacencia del vertice " + v);
			System.out.print("Cabeza");
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

	public static void main(String args[]) {

		int V = 5;
		Grafo grafo = new Grafo(V);
		añadirVertice(grafo, 0, 1);
		añadirVertice(grafo, 0, 4);
		añadirVertice(grafo, 1, 2);
		añadirVertice(grafo, 1, 3);
		añadirVertice(grafo, 1, 4);
		añadirVertice(grafo, 2, 3);
		añadirVertice(grafo, 3, 4);
		System.out.println("Grafo: ");
		printGraph(grafo);
	}
}