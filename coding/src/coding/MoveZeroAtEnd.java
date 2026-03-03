package coding;

import java.util.List;
import java.util.stream.Stream;

public class MoveZeroAtEnd {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,5,0,4,5,0,0,5,6,8,0,7,0,7,0);
		
		List<Integer> moveZeroAtEnd  = Stream.concat(numbers.stream().filter(x-> x!=0), numbers.stream().filter(x-> x == 0)).toList();
		System.out.println("given nonZero to left side and zero to right side" + moveZeroAtEnd);
	}

}
