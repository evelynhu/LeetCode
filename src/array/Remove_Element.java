package array;


public class Remove_Element {
    public static int removeElement(int[] A, int elem) {
        int length = 0;
        for (int i : A) {
        	if (i != elem) {
        		A[length] = i;
        		length++;
        	} else {
        		continue;
        	}
        }
        return length;
    }
}
