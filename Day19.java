// Day 19 - Migratory Birds

public class Day19 {
    public static int migratoryBirds(List<Integer> arr) {
        int[] freq = new int[arr.size()];
        
        for(int num : arr) {
            freq[num]++;
        }
        
        int maxFreq = 0;
        int ans = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) { 
        List<Integer> arr = List.of(1, 4, 4, 4, 5, 3); 
        
        int result = migratoryBirds(arr); 
        
        System.out.println(result); 
    }
}
