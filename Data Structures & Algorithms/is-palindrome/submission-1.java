class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = cleanStr.toLowerCase().toCharArray();
        int left=0;
        int right= charArray.length-1;
        while(left<=right){
            if(charArray[left] != charArray[right]){
                return false;
            }
            else{
                left++;
                right --;
            }
        }
    return true;
    }
}
