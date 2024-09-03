class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            //left sorted
            if(nums[low]<=nums[mid]){
                if(nums[mid]>=target && nums[low] <=target ){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && nums[high]>=target ){
                    low=mid+1;             
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}