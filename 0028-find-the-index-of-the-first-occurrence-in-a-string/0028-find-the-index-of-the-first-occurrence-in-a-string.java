class Solution {
    public int strStr(String haystack, String needle) {

        for(int i=0;i<=haystack.length()-needle.length();i++){

            int j=0;
            while(j<needle.length() && needle.charAt(j)==haystack.charAt(i+j)){
                j++;

            }
            if(needle.length()==j){
                return i;
            }
        }
        return -1;
    }
}