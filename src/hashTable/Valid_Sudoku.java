package hashTable;

import java.util.HashSet;

public class Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {
    	HashSet<Character> set = new HashSet<Character> ();

    	// check each row
    	for (int i = 0; i < 9; i++) {
    		for (int j = 0; j < 9; j++) {
    			if (board[i][j] == '.') {
    				continue;
    			}
    			if (set.contains(board[i][j])) {
    				return false;
    			}
    			set.add(board[i][j]);
        	}
    		set.clear();
    	}

    	//check each column
    	for (int j = 0; j < 9; j++) {
    		for (int i = 0; i < 9; i++) {
    			if (board[i][j] == '.') {
    				continue;
    			}
    			if (set.contains(board[i][j])) {
    				return false;
    			}
    			set.add(board[i][j]);
        	}
    		set.clear();
    	}

    	//check each grid
    	for (int k = 0; k < 9; k++) {
    		for (int i = (k/3)*3; i < (k/3)*3+3; i++) {
        		for (int j = (k%3)*3; j < (k%3)*3+3; j++) {
        			if (board[i][j] == '.') {
        				continue;
        			}
        			if (set.contains(board[i][j])) {
        				return false;
        			}
        			set.add(board[i][j]);
            	}
        	}
    		set.clear();
    	}
        return true;
    }
}
