class Solution {
    public int reverse(int x) {
        int original= x;
        int reverse=0;
        

        while(original!=0){
              int r=original%10;
            original= original/10;

             if (reverse > Integer.MAX_VALUE / 10 ||
               (reverse == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0;
               }
                 if (reverse < Integer.MIN_VALUE / 10 ||
               (reverse == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0;
            }
          
            reverse= (reverse*10)+r;

        }
        return reverse;
    }
}
    
