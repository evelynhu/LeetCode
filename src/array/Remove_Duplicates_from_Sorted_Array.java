package array;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] A) {
    	if (A.length < 1) return 0;
    	int cur = 1;
    	for (int i = 1; i < A.length; i++) {
    		if (A[i] != A[i-1]) {
    			A[cur] = A[i];
    			cur++;
    		} else {
    			continue;
    		}
    	}
    	return cur;
    }
}
