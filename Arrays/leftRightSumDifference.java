package Arrays;

public class leftRightSumDifference{
    public static int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int rightsum=0;
        int totalsum=0;
        int[] ans =new int[n];

        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        rightsum=totalsum;
        for(int j=0;j<n;j++){
            rightsum-=nums[j];
            ans[j] =Math.abs(leftsum - rightsum);
            leftsum+=nums[j];
        }
        return ans;
        }
        public static void main(String[] args) {
            int[] nums = {10,4,8,3};
            System.out.println(leftRightDifference(nums));
        }   

}