    class Solution {
        public int search(int[] nums, int target) {

            int lower = 0;
            int upper = nums.length-1;
            int mid = -1;
            boolean rst = false;

            if(nums.length == 1)
            return nums[0] == target ? 0 : -1;

            for(int i =0; i< nums.length; i++){
                mid = (lower+upper)/2; 
                if(nums[mid] == target){
                    rst = true;
                    break;
                }
                else if(target> nums[mid])
                lower = mid +1;
                else if(target< nums[mid])
                upper = mid -1;
            }
          

            if(rst)
            return mid;
            else
            return -1;


        }

    }
