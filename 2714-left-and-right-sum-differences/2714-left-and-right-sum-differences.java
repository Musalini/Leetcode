class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int[] targetArray = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            sumLeft += nums[i];
            leftArray[i + 1] = sumLeft;
        }
        for (int i = nums.length; i > 1; i--) {
            sumRight += nums[i - 1];
            rightArray[i - 2] = sumRight;
        }
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = Math.abs(leftArray[i] - rightArray[i]);
        }
        return targetArray;
    }
}