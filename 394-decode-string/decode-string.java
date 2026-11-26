class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int number = 0;

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Number
            if(Character.isDigit(c)) {

                number = number * 10 + (c - '0');
            }

            // Opening bracket
            else if(c == '[') {

                countStack.push(number);
                stringStack.push(current);

                number = 0;
                current = "";
            }

            // Closing bracket
            else if(c == ']') {

                int count = countStack.pop();
                String previous = stringStack.pop();

                String temp = "";

                for(int j = 0; j < count; j++) {
                    temp += current;
                }

                current = previous + temp;
            }

            // Normal character
            else {

                current += c;
            }
        }

        return current;
    }
}