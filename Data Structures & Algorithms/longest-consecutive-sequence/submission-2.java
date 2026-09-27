class Solution {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int largest=0;
    
        for (int num : set) {
            if(!set.contains(num-1)){
                int currnum=num;
                int currcount=1;
                while(set.contains(currnum+1)){
                    currnum++;
                    currcount++;
                }
                if(currcount>largest){
                    largest=currcount;
                }

            }
        }



    return largest;

    }
}
