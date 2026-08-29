class Solution {
    public void answer(String digits, String current, List<String> list, String[] mapping, int index ){
        if(index == digits.length()){
            list.add(current);
            return ;
        }
        int digit = digits.charAt(index)-'0';
        String letters = mapping[digit];
        for(int i=0; i<letters.length(); i++){
            current += letters.charAt(i);
            answer(digits, current, list, mapping, index+1);
            current = current.substring(0, current.length()-1);
        }
        return ;
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
         if (digits.length() == 0) {
            return list;
        }
        String [] mapping = 
        {"",
         "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
        };
        
        answer(digits, "",list, mapping, 0);
        return list ;
    }
}