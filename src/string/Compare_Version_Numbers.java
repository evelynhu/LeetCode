package string;

import java.util.ArrayList;
import java.util.List;

public class Compare_Version_Numbers {
    public static int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\."); 
    	String[] v2 = version2.split("\\.");
    	List<Integer> list1 = new ArrayList<>();
    	List<Integer> list2 = new ArrayList<>();
    	for (String i : v1) {
    		list1.add(Integer.valueOf(i));
    	}
    	for (String i : v2) {
    		list2.add(Integer.valueOf(i));
    	}
    	while (list1.size() < list2.size()) {
    		list1.add(0);
    	}
    	while (list2.size() < list1.size()) {
    		list2.add(0);
    	}
		for (int i = 0 ; i < list1.size() ; i++) {
			if (list1.get(i) > list2.get(i)) {
				return 1;
			} else if (list1.get(i) < list2.get(i)) {
				return -1;
			}
		}
		return 0;
    }
}
