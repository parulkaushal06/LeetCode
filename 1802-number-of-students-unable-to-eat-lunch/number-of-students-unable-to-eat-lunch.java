class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        for(int i=sandwiches.length-1; i>=0; i--){
            st.push(sandwiches[i]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<students.length; i++){
            q.offer(students[i]);
        }
        int count = 0 ;
        while(!q.isEmpty() && count < q.size()){
            if(q.peek() == st.peek()){
                q.poll();
                st.pop();
                count = 0 ;
            }
            else {
                q.offer(q.poll());
                count ++ ;
            }
        }
        return st.size();
    }
}