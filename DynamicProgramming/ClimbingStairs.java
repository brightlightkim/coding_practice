public class ClimbingStairs {
   public int climbStairs(int n) {
        int formerNum2 = 0;
        int formerNum1 = 0;
        if (n == 1 || n == 2){
            return n;
        }
        for (int i = 0; i < n; i++){ 
            if (formerNum2 == 0){ 
                formerNum2 = i; 
            } else if (formerNum1 == 0){
                formerNum1 = i; 
            } else {
                int tmp = formerNum1; 
                formerNum1 = (formerNum1 + formerNum2); 
                formerNum2 = tmp;    
            }        
        }
        return formerNum1 + formerNum2;
    } 
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
// Memory Usage: 38.8 MB, less than 93.22% of Java online submissions for Climbing Stairs.
