// Day 20 - Day of the Programmer

public class Day20 {
    public static String dayOfProgrammer(int year) {
        if(year == 1918) {
            return "26.09.1918";
        }
        
        boolean isLeap;
        
        if(year < 1918) {
            isLeap = (year % 4 == 0);
        } else {
            isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        
        if(isLeap) {
            return "12.09." + year;
        } else{
            return "13.09." + year;
        }
    }

    public static void main(String[] args) { 
        int year = 2017; 
        
        String result = dayOfProgrammer(year); 
        
        System.out.println(result); 
    }
}
