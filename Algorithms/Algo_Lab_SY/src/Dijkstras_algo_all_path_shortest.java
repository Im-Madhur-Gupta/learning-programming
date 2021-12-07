class Dijkstras_Algo_All_Pair_Shortest_Path {

    private static final int PARENTNO = -1;

    private static void dijkstra(int[][] adjacencyMatrix,
                                 int startVertex) {
        int nVertices = adjacencyMatrix[0].length;

        int[] shortestDistances = new int[nVertices];

        boolean[] added = new boolean[nVertices];

        for (int vertexIndex = 0; vertexIndex < nVertices;
             vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        shortestDistances[startVertex] = 0;

        int[] parents = new int[nVertices];

        parents[startVertex] = PARENTNO;

        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0;
                 vertexIndex < nVertices;
                 vertexIndex++) {
                if (!added[vertexIndex] &&
                        shortestDistances[vertexIndex] <
                                shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            added[nearestVertex] = true;

            for (int vertexIndex = 0;
                 vertexIndex < nVertices;
                 vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0
                        && ((shortestDistance + edgeDistance) <
                        shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance +
                            edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    private static void printSolution(int startVertex,
                                      int[] distances,
                                      int[] parents) {
        int nVertices = distances.length;

        for (int vertexIndex = startVertex+1;
             vertexIndex < nVertices;
             vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " to ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    private static void printPath(int currentVertex,
                                  int[] parents) {
        if (currentVertex == PARENTNO) {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }

    public static void main(String[] args) {
        int input[][] = {{0, 4, 0, 0, 0, 0},
                {4, 0, 8, 0, 0, 0},
                {0, 8, 0, 7, 0, 4},
                {0, 0, 7, 0, 9, 14},
                {0, 0, 0, 9, 0, 10},
                {0, 0, 4, 0, 10, 0}};

        System.out.print("Vertex\t\t Cost\tPath");
        for(int i=0;i< input.length;i++) {
            dijkstra(input, i);
        }
    }
}
