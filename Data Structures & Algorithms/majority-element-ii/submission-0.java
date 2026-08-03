class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
         List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int num:map.keySet()){
            int val=map.get(num);
            if(val>nums.length/3){
                count=num;
                list.add(num);
            }
        }
        return list;
    }
}