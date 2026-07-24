public class Main {

    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }

            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int i, int j) {

        // Boundary check or water check
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length 
                || grid[i][j] == '0') {
            return;
        }

        // Mark visited land
        grid[i][j] = '0';

        // Visit four directions
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        int result = numIslands(grid);

        System.out.println("Number of Islands: " + result);
    }
}