class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int number = 0;
        String current = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number * 10 + (c-'0');
            }
            else if(c=='['){
                stringStack.push(current);
                countStack.push(number);
                number = 0 ;
                current = "";
            }
            else if(c==']'){
                int count = countStack.pop();
                String previous = stringStack.pop();
                String temp = "";
                for(int j=0; j<count; j++){
                    temp += current;
                }
                current = previous+temp;
            }
            else{
                current += c;
            }
        }
        return current ;
    }
}