class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        
       int left =0;
       int right = n-1;
       int max =0;
       while(left <right){
        int temp=0;
                if(heights[left]<heights[right]){
                    temp= heights[left]*(right-left);
                }
                else if(heights[left]>heights[right]){
                     temp=heights[right]*(right-left);
                }
                else{
                     temp=heights[left]*(right-left);
                }
                if (temp>max){
                    max = temp;
                    
                }
                if(heights[left]>heights[right]){
                        right --;
                    }
                    else{
                        left++;
                    }
            }
        // System.out.println(arr);
                
        return max;
    }
}
