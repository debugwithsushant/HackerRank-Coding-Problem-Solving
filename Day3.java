// Day3 - Reverse an Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Day3{
    public List<Integer> reverseArray(List<Integer> arr) {
        List<Integer> rev = new ArrayList<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            rev.add(arr.get(i));
        }

        return rev;
    }

    public static void main(String[] args) {
        Day3 day3 = new Day3();
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(day3.reverseArray(arr)); // Output: [5, 4, 3, 2, 1]
    }
}