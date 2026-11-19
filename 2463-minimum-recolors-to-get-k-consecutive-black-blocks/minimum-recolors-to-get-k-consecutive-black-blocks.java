class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0 ;
        int count = 0 ;
        int minCount = Integer.MAX_VALUE ;
        for(int right = 0; right<blocks.length(); right++){
            char ch = blocks.charAt(right);
            if(ch == 'W'){
                count++;
            }
            if(right-left+1 >k){
                if(blocks.charAt(left)=='W'){
                    count--;
                }
                left++;
            }
            if(right-left+1==k){
                minCount = Math.min(count, minCount);
            }
        }
        return minCount ;
    }
}