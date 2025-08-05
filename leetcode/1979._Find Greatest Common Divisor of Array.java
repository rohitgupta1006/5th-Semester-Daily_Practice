class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);

        int s = nums[0];
        int l = nums[nums.length-1];

        if(l%s == 0) return s;

        for(int i = (s/2)+1; i >= 1; i--) {
            if((s%i == 0) && (l%i == 0)) return i;
        }
        return 1;
    }
}
