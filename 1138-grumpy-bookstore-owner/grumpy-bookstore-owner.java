class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0;
        int satisfied = 0 ;
        int extra = 0 ;
        int maxExtra = 0 ;
        for(int right = 0 ; right<customers.length; right++){
             if(grumpy[right]==0){
                satisfied+=customers[right];
             }
             else{
                extra += customers[right];
             }
             if(right-left + 1 >minutes){
                if(grumpy[left]==1){
                    extra -= customers[left];
                }
                left++;
             }
             if(right - left + 1 ==minutes){
                maxExtra = Math.max(maxExtra, extra);
             }
        }
        return satisfied+maxExtra ;
    }
}