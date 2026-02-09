// Day 11 - Time Conversion

public class Day11 {
    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String minutesSeconds = s.substring(2, 8);
        String period = s.substring(8, 10);
        
        if(period.equals("AM")) {
            if(hour == 12) hour = 00;
        } else{
            if(hour != 12) hour += 12;
        }
        
        return String.format("%02d%s", hour, minutesSeconds);
    }

    public static void main(String[] args) {
        String time = "07:05:45PM";
        String result = timeConversion(time);
        System.out.println(result);
    }
}
