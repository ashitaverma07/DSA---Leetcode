class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum = 0;
        int[] runningSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            runningSum = runningSum + nums[i];
            runningSums[i] = runningSum;
        }
        return runningSums;
    }
}