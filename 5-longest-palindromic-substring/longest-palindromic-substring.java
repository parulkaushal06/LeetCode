class Solution {
    public boolean isPalindrome(String s){
        int l =0; int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false ;
            }
            l++;
            r--;
        }
        return true ;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int length = 0 ;
        if(s.length()==1){
            return s;
        }
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length()+1; j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub)){
                    if(length<sub.length()){
                        ans = sub ;
                        length = sub.length();
                    }
                    
                }
            }
        }
        return ans ;
    }
}