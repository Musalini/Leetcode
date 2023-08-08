class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num)
                    count++;
            }
            answer[i] = count;
            count = 0;
        }
        return answer;
    }
}