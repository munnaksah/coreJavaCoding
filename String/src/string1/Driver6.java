package string1;

import java.util.HashMap;
import java.util.Map;

public class Driver6 {
	public static void main(String[] args) {
//		try {
//		    int a = 10 / 0;
//		} finally {
//		    System.out.println("Finally");
//		}
		
		try {
		    System.out.println("Try");
		} catch (Exception e) {
		    System.out.println("Catch");
		} finally {
		    System.out.println("Finally");
		}
		
		
		Map map = new HashMap();
		map.put(null, 1);
		map.put(null, 2);
		System.out.println(map.get(null));
		System.out.println(map.size());
		
		
		
	}

}
