class Solution {
    public int[] getConcatenation(int[] nums) {
        int []res = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]= nums[i];
        }
        for(int i=nums.length;i<2*(nums.length);i++){
            res[i]=nums[i-nums.length];
        }
        return res;
    }
}