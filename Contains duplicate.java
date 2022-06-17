//contains dubplicate

class Solution {
public boolean containsDuplicate(int[] nums) {
Arrays.sort(nums);
int l = nums.length;
for(int j=0 ;j<l-1 ;j++){

            int val = nums[j];
            int val2 = nums[j+1];
            if((val2==val) ){
                return true;
           }
        }
    
    return false;
}
}