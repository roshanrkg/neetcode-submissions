class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int [n];
        int [] prefstart = new int[n];
        int [] prefend= new int[n];
        prefstart [0]= nums[0];
        for (int i=1 ;i <n; i++){
           
            prefstart [i]=  prefstart[i-1]*nums[i];
        }
        prefend[n-1]=nums[n-1];
        for(int i= n-2;i>=0;i--){
            if(i==0){
                prefend[0]=prefstart[n-1];
            }else{
            prefend[i]= prefend[i+1]*nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=prefend[i+1];
            }
            else if(i==n-1){
                res[i]=prefstart[i-1];
            }else{
                res[i]= prefstart[i-1]*prefend[i+1];
            }
            
        }
        return res;
    }
}  
