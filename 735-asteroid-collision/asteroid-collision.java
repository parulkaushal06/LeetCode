class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0; i<n; i++){
            while(!st.empty() && asteroids[i]<0 && st.peek()>0){
                if(st.peek()< Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                    asteroids[i] = 0;
                    break ;
                }
                else{
                    asteroids[i] = 0;
                    break ;
                }
            }
            if(asteroids[i]!=0){
                st.push(asteroids[i]);
            }    
        }
        int s = st.size();
        int [] ans = new int[s];
        for(int i=s-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans ;
    }
}