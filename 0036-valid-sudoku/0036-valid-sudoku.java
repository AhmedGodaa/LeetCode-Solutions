class Solution {
    public boolean isValidSudoku(char[][] board) {
   Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                if (value != '.') {
                    if (set.contains(value + " in row " + i)) {
                        return false;
                    } else {
                        set.add(value + " in row " + i);
                    }
                    if (set.contains(value + " in column " + j)) {
                        return false;
                    } else {
                        set.add(value + " in column " + j);
                    }
                    if (set.contains(value + " in block" + i / 3 + "-" + j / 3)) {
                        return false;
                    } else {
                        set.add(value + " in block" + i / 3 + "-" + j / 3);
                    }

                }
            }


        }
        return true;

    }
}