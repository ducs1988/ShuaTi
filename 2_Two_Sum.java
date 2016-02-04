public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0}; //initialized ther result
        Map<Integer, Integer> map = new HashMap<>();
        /*
         * for every entry in the array, store the (target-num) into the map with the index of the num
         * When the (target- num)appears in the array, we can return the values at that moment itself
         */  
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i])+1;
                result[1] = i+1;
                return result;
            }else{
                map.put(target-nums[i], i);
            }
        }
        return result;
    }
}