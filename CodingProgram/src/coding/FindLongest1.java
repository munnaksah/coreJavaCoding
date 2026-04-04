package coding;

import java.util.HashSet;
import java.util.Set;

public class FindLongest1 {

    public static void main(String[] args) {

        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest length of string: " + maxLength);
        System.out.println();
    }
}
