class Solution {
    public int answer(int op1, int op2, String sign){
        if(sign.equals("+")){
            return op1+op2;
        }
        else if(sign.equals("-")){
            return op1-op2;
        }
        else if(sign.equals("*")){
            return op1*op2;
        }
        else if(sign.equals("/")){
            return op1/op2;
        }
        return -1 ;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result = -1 ;
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") ||
            tokens[i].equals("-") || 
            tokens[i].equals("*") || 
            tokens[i].equals("/")){
                int op2 = st.pop();
                int op1 = st.pop();
                result = answer(op1, op2, tokens[i]);
                st.push(result);
            }
            else {
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            }
        }
        return st.peek();
    }
}