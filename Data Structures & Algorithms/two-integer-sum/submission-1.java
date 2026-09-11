class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr [][]= new int [nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int []result= new int[2];
        int left =0;
        int right =nums.length-1;
        while(left<right){
            int sum = arr[left][0]+arr[right][0];
            if (sum ==target){
              
               int idx1=arr[left][1];
               int  idx2= arr[right][1];
                return new int[]{Math.min(idx1, idx2), Math.max(idx1, idx2)};
            }
            else if(sum>target){
                right --;
            }
            else{
                left++;
            }
        }
        return result; 
    }
}
