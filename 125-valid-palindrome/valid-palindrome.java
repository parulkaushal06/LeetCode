class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans+= c;
            }
        }
        ans = ans.toLowerCase();
        int l = 0 ;
        int r = ans.length()-1;
        while(l<r){
            if(ans.charAt(l)!=ans.charAt(r)){
                return false ;
            }
            else{
                l++;
                r--;
            } 
        }
        return true ;
    }
}