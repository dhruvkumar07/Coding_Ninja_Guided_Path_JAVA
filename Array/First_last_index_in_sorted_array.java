class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int first = binary_search(nums,target,1);
        int last = binary_search(nums,target,0);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
    int binary_search(int[] nums,int target,int check) {
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target) {
                result=mid;
                if(check==1) //checking for first occurence
                    end=mid-1;
                else         //last occurence
                    start=mid+1; 
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return result;
    }
}
