class Solution {
    public void reverse(int l, int r,char[] s){
        if(l==r || l > r){
            return ;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp ;
        reverse(l+1, r-1,s);
    }
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        reverse(l,r,s);
    }
}