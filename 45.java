class Solution {
    public int jump(int[] nums) 
    {
        int close = 0;
        int far = 0;
        int jumps = 0;
        int farthest;

        while (far < nums.length - 1) 
        {
            farthest = 0;
            for (int i = close; i <= far; i++) 
            {
                farthest = Math.max(farthest, i + nums[i]);
            }
            close = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;        
        
    }
}