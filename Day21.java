// Day 21 - Bill Division

import java.util.List;

public class Day21 {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalCost = 0;
        
        for(int i = 0; i < bill.size(); i++) {
            if(i != k) totalCost += bill.get(i);
        }
        
        int fairShare = totalCost / 2;
        int overCharge = b - fairShare;
        
        if(overCharge != 0){
            System.out.println(overCharge);
        } else {
            System.out.println("Bon Appetit");
        }
    }

    public static void main(String[] args) { 
        List<Integer> bill = List.of(3, 10, 2, 9); 
        int k = 1; 
        int b = 12; 
        
        bonAppetit(bill, k, b); 
    }
}
