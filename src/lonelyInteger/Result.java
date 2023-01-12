package lonelyInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Result {
	/*
	 * Complete the 'lonelyinteger' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int lonelyinteger(List<Integer> a) {

		List<Integer> counter = new ArrayList<Integer>();
		
		for (Iterator<Integer> iterator = a.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (a.stream().filter(s -> s == integer).count() == 2) {
				counter.add(2);
			}else {
				counter.add(1);
			}
		}	
		return a.get(counter.indexOf(1));
	}
	
	// a solução elegante
	public static int lonelyinteger2(List<Integer> a) {
	    List<Integer> unique = new ArrayList<>();
	        for (Integer number: a) {
	            if (!unique.remove(number)){
	                unique.add(number);
	            }
	       }
	return unique.get(0);
	}
}
