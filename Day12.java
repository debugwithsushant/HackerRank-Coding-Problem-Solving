// Day 12 - Greading Students

import java.util.ArrayList;
import java.util.List;

public class Day12 {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        
        for(int grade : grades) {
            if(grade < 38) {
                result.add(grade);
            } else {
                int round = ((grade / 5) + 1) * 5;
                if(round -  grade < 3) {
                    result.add(round);
                } else {
                    result.add(grade);
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> grades = List.of(73, 67, 38, 33);
        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }
}
