class Solution {
    public void answer(String digits, List<String> list, String current,
    int index, String[] mapping){
        if(index==digits.length()){
            list.add(current);
            return ;
        }
        int digit = digits.charAt(index)-'0';
        String letters = mapping[digit];
        for(int i=0; i<letters.length(); i++){
            current += letters.charAt(i);
            answer(digits, list, current, index+1, mapping);
            current = current.substring(0,current.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0){
            return list ;
        }
        String [] mapping = {
            "",
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
        answer(digits, list, "", 0, mapping);
        return list ;
    }
}