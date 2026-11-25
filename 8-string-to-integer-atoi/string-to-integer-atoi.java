class Solution {
    public int myAtoi(String s) {
        int i=0; int result = 0 ; int sign = 1;
        int n = s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(result> Integer.MAX_VALUE / 10 || (result== Integer.MAX_VALUE / 10 && digit>7)){
                if(sign == -1){
                    return Integer.MIN_VALUE;
                }
                else if(sign == 1){
                    return Integer.MAX_VALUE;
                }
            }
            result = result * 10 + digit;
            i++;
        }
        return result*sign ;
    }
}