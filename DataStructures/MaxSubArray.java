public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int curNum = 0;
        int maxNum = 0;
        int curIndividualMaxNum = -99999;

        boolean allNeg = true;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && allNeg) {
                allNeg = false;
            }
            if (curIndividualMaxNum < nums[i]) {
                curIndividualMaxNum = nums[i];
            }
            if (curNum + nums[i] > 0) {
                curNum += nums[i];
            } else {
                curNum = 0;
            }

            if (maxNum < curNum) {
                maxNum = curNum;
            }

        }

        if (allNeg) {
            return curIndividualMaxNum;
        }
        return maxNum;
    }
}
