package Exercises.Second_Medium;
import java.util.*;
//811 子域名访问计数
public class subdomain_visit_count {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain: cpdomains) {
            String[] strs = cpdomain.split(" ");
            int count = Integer.parseInt(strs[0]);
            String str = strs[1];
            map.put(str, map.getOrDefault(str, 0) + count);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.') {
                    String sub_str = str.substring(i + 1);
                    map.put(sub_str, map.getOrDefault(sub_str, 0) + count);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ans.add(new StringBuilder().append(entry.getValue()).append(' ').append(entry.getKey()).toString());
        }
        return ans;
    }
}
