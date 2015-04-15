package test;

import java.util.List;

public class tools {
	public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1 != null && array2 != null){
          if (array1.length != array2.length)
              return false;
          else
              for (int i = 0; i < array2.length; i++) {
                  if (array2[i] != array1[i]) {
                      return false;    
                  }                
            }
        }else{
          return false;
        }
        return true;
    }
	public static boolean compareLists(List<Integer> array1, List<Integer> array2) {
        if (array1 != null && array2 != null){
          if (array1.size() != array2.size())
              return false;
          else
              for (int i = 0; i < array2.size(); i++) {
                  if (array2.get(i) != array1.get(i)) {
                      return false;    
                  }                
            }
        }else{
          return false;
        }
        return true;
    }
}
