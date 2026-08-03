class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int current=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            if(current==k){
                count++;
            }
            if(map.containsKey(current-k)){
                count+=map.get(current-k);
            }
            map.put(current,map.getOrDefault(current,0)+1);
        }
        return count;
    }
}