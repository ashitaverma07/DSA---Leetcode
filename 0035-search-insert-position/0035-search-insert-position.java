class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
         // Traverse an array
        while( start <= end ) {
            
            int mid = (start + end) / 2;
            
            //if target value found.
            if(nums[mid] == target) {
                return mid;
            }
            
            // If target value is greater then mid elements's value
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            
            //otherwise target value is less, 
             else {
                end = mid - 1;
            }
        }
        // Return the insertion position
        return end + 1;
    }
    }
