package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// movenon Zero to left side

public class MoveZeroAtEnd {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,5,0,4,5,0,0,5,6,8,0,7,0,7,0);

        List<Integer> moveZeroAtEnd = Stream.concat(
                numbers.stream().filter(x -> x == 0 ),
                numbers.stream().filter(x -> x != 0)
        ).collect(Collectors.toList());

        System.out.println("Non-zero left, zero right: " + moveZeroAtEnd);
    }
}