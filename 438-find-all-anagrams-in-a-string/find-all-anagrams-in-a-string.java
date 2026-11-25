class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<p.length(); i++){
            
            if(map.containsKey(p.charAt(i))){
                map.put(p.charAt(i), map.get(p.charAt(i))+1);
            }
            else{
                map.put(p.charAt(i),1);
            }
        }
        int left = 0 ;
        for(int right =0; right<s.length(); right++){
            if(window.containsKey(s.charAt(right))){
                        window.put(s.charAt(right), window.get(s.charAt(right))+1);
                    }
                    else{
                        window.put(s.charAt(right),1);
                    }
            if(right-left+1>p.length()){
                char remove = s.charAt(left);
                window.put(remove, window.get(remove)-1);
                if(window.get(remove) == 0) {
                    window.remove(remove);
                }
                left++;
            }
            
            if(right-left+1 == p.length()){
                
                if(window.equals(map)){
                    li.add(left);
                }
                
            }
        }
        return li ;
    }
}