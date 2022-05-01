class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++){
            int fillNum = target - nums[i];
            if (numberMap.get(fillNum) == null){
                numberMap.put(nums[i], i);
            } else {
                answer = new int[]{numberMap.get(fillNum), i};
                break;
            }
        }
        return answer;
    }
}