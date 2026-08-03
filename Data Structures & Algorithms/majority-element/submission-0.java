class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int num:map.keySet()){
            int val=map.get(num);
            if(val>nums.length/2){
                count=num;
            }
        }
        return count;
    }
}