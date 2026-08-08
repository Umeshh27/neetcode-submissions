class Solution{
    public int[] topKFrequent(int[] nums,int k){
        List<Integer>[] freq=new List[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.keySet()){
            int frequency=map.get(val);
            if(freq[frequency]==null){
                freq[frequency]=new ArrayList<>();
            }
            freq[frequency].add(val);
        }
        int[] res=new int[k];
        int count=0;
        for(int i=freq.length-1;i>=0&&count<k;i--){
            if(freq[i]!=null){
                for(Integer integer:freq[i]){
                    res[count++]=integer;
                    if(count==k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}