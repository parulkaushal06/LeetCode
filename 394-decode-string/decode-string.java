class Solution {
    public String decodeString(String s) {

        Stack<String> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Normal character
            if(c != ']') {
                st.push(String.valueOf(c));
            }

            else {
                // Step 1: ] se pehle wali string nikalo
                String str = "";

                while(!st.peek().equals("[")) {
                    str = st.pop() + str;
                }

                // [ remove
                st.pop();

                // Step 2: number nikalo
                String num = "";

                while(!st.empty() && Character.isDigit(st.peek().charAt(0))) {
                    num = st.pop() + num;
                }

                int count = Integer.parseInt(num);

                // Step 3: string repeat karo
                String temp = "";

                for(int j = 0; j < count; j++) {
                    temp += str;
                }

                // Step 4: decoded string wapas stack mein
                st.push(temp);
            }
        }

        // Stack ke saare elements join karo
        String ans = "";

        while(!st.empty()) {
            ans = st.pop() + ans;
        }

        return ans;
    }
}