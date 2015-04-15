package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
* */
public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        if (numRows < 1) return new ArrayList<>();
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> firstRow = Arrays.asList(1);
        pascalsTriangle.add(firstRow);
        for (int i = 2; i <= numRows ; i++) {
        	List<Integer> last_row = pascalsTriangle.size() > 1 ? pascalsTriangle.get(i - 2) : Arrays.asList(1, 1);
        	List<Integer> numbers = new ArrayList<>();;
            for (int j = 0; j < i; j++) {
            	if (j == 0 || j == i - 1) {
            		numbers.add(j, 1);
            	} else {
                	numbers.add(j, last_row.get(j - 1) + last_row.get(j));
            	}
            }
            pascalsTriangle.add(numbers);
        }
        return pascalsTriangle;
    }
}
