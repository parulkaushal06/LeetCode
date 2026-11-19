class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch == 'o' || ch=='u'){
            return true ;
        }
        return false ;
    }
    public int maxVowels(String s, int k) {
        int left = 0 ;
        int count = 0 ;
        int maxCount = Integer.MIN_VALUE;
        
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            
            if(isVowel(ch)){
                count++;
            }
            if(right-left+1>k){
                if(isVowel(s.charAt(left))){
                    count--;
                }
                left++;
            }
            if(right-left+1==k){
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount ;
    }
}