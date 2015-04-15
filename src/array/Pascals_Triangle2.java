package array;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle2 {
    public static List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0) return null;
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < rowIndex+2; i++) {
    		list.add(0);
    	}
    	list.set(1, 1);
        for (int i = 0; i < rowIndex; i++) {
        	for (int j = rowIndex + 1; j > 0; j--) {
        		list.set(j, list.get(j-1) + list.get(j));
        	}
        }
        list.remove(0);
        return list;
    }
}
