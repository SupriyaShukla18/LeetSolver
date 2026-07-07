class Solution {
    public boolean isPalindrome(int x) {
        
       int original=x;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(original>0){
            int r=original%10;
            original=original/10;
            reverse=reverse*10+r;

        }
        if(x==reverse){
      return true;

        }else{
            return false;
        }
        
    }
}