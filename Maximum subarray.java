//Maximum subarray

public int maxSubArray(int[] nums) {
        int head = 0;
        int max = Integer.MIN_VALUE;
        while (head < nums.length) {
			int currentSum = nums[head];
            max = Math.max(max, currentSum);
            int i = head + 1;
            while (i < nums.length && currentSum > 0) {
                currentSum += nums[i];
                max = Math.max(max, currentSum);
                i++;
            }
            head = i; //move to the end of the group
        }
        return max;
    }