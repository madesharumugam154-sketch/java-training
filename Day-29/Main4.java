public class Main4 {

    public static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (dfs(board, word, i, j, 0)) {
                    return true;
                }

            }
        }

        return false;
    }


    public static boolean dfs(char[][] board, String word, int i, int j, int index) {

        // Word found
        if (index == word.length()) {
            return true;
        }

        // Boundary and character check
        if (i < 0 || j < 0 || 
            i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(index)) {
            return false;
        }


        // Mark visited
        char temp = board[i][j];
        board[i][j] = '#';


        // Search in 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);


        // Restore character
        board[i][j] = temp;


        return found;
    }


    public static void main(String[] args) {

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED";

        boolean result = exist(board, word);

        System.out.println(result);
    }
}