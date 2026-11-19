import java.util.*;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];
            while (true) {
                if (map.containsKey(domain)) {
                    map.put(domain, map.get(domain) + count);
                } else {
                    map.put(domain, count);
                }
                int dot = domain.indexOf('.');

                if (dot == -1) {
                    break;
                }

                domain = domain.substring(dot + 1);
            }
        }

        List<String> ans = new ArrayList<>();

        for (String domain : map.keySet()) {
            ans.add(map.get(domain) + " " + domain);
        }

        return ans;
    }
}