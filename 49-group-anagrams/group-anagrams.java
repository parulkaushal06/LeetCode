class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length; i++){
           char[] chars = strs[i].toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           if(map.containsKey(key)){
            
            map.get(key).add(strs[i]);
           }
           else{

            map.put(key, new ArrayList<>());
            map.get(key).add(strs[i]);
           }
        }
        List<List<String>> li = new ArrayList<>();
        for(String x : map.keySet()){
            li.add(map.get(x));
        }
        return li ;
    }
}