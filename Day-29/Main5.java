import java.util.*;

public class Main5 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create graph
        ArrayList<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[numCourses];


        // Build graph and indegree
        for (int[] pre : prerequisites) {

            int course = pre[0];
            int prerequisite = pre[1];

            graph[prerequisite].add(course);
            indegree[course]++;
        }


        // Add courses with no prerequisites
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {

            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }


        int count = 0;


        // BFS (Kahn's Algorithm)
        while (!queue.isEmpty()) {

            int current = queue.poll();
            count++;

            for (int next : graph[current]) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }


        return count == numCourses;
    }


    public static void main(String[] args) {

        int numCourses = 2;

        int[][] prerequisites = {
            {1, 0}
        };

        boolean result = canFinish(numCourses, prerequisites);

        System.out.println(result);
    }
}