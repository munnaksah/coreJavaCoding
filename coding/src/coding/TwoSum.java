package coding;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[]arr = {2,7,10,11};
		int target  = 9;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++) {
			int require = target-arr[i];
			
			if(map.containsKey(require)) {
				System.out.println("Element " + require + "+" + arr[i] );
				System.out.println("index  " + map.get(require)+i);
				return ;
			}
			map.put(arr[i],i);
			
		
		}
		System.out.println("no pair ");
		
	}

}
