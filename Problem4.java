

import java.util.*;

public class Problem4 {
    public static Map<Integer, Integer> count(List<Integer> nums) {
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) counts.put(i, 0);
        for (int num : nums) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) counts.put(i, counts.get(i) + 1);
            }
        }
        return counts;
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	  
	  int n=sc.nextInt();
	  
        List<Integer> nums = new ArrayList<>();
		
        for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			nums.add(a);
		}
        System.out.println(count(nums));
    }
}