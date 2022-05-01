import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> firstMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> secondMap = new HashMap<Integer, Integer>();
        Stack<Integer> intersectStack = new Stack<Integer>();
        
        for (int i = 0; i < nums1.length; i++){
            if (firstMap.get(nums1[i])==null){
                firstMap.put(nums1[i], 1);
            } else {
                int increasedNum = firstMap.get(nums1[i]) + 1;
                firstMap.put(nums1[i], increasedNum);
            }
        }
        
        for (int i = 0; i < nums2.length; i++){
            if (secondMap.get(nums2[i])==null){
                secondMap.put(nums2[i], 1);
            } else {
                int increasedNum = secondMap.get(nums2[i]) + 1;
                secondMap.put(nums2[i], increasedNum);
            }
        }
        
        for (Integer num : firstMap.keySet()){
            if (secondMap.get(num)!=null){
                if (firstMap.get(num) > secondMap.get(num)){
                    for (int i = 0; i < secondMap.get(num); i++){
                        intersectStack.push(num);
                    }
                } else {
                    for (int i = 0; i < firstMap.get(num); i++){
                        intersectStack.push(num);
                    }
                }
            }
        }
        
        int[] intersect = new int[intersectStack.size()];
        intersect = intersectStack.stream().mapToInt(i->i).toArray();
        
        return intersect;
    }
}
