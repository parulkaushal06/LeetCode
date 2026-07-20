class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 0;
        String newStr = "";
        while(newStr.length()<b.length()){
            
                newStr += a;
                count++;
                if(newStr.contains(b)){
                    return count ;
                }
        }
        newStr += a;
        count++;
        if(newStr.contains(b)){
            return count ;
        }
        return -1;
    }
}