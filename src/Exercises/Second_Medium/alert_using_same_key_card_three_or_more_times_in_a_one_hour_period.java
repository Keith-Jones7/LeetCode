package Exercises.Second_Medium;
import java.util.*;
//1604 警告一小时内使用相同员工卡大于等于三次的人
public class alert_using_same_key_card_three_or_more_times_in_a_one_hour_period {
    public List<String> alertNames(String[] keyNames, String[] keyTimes) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < keyNames.length; i++) {
            List<Integer> list = map.getOrDefault(keyNames[i], new ArrayList<>());
            list.add(convertTime(keyTimes[i]));
            map.put(keyNames[i], list);
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            Collections.sort(list);
            if (!isValid(list)) {
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public int convertTime(String time) {
        return (time.charAt(0) * 10 + time.charAt(1)) * 60 + (time.charAt(3) * 10 + time.charAt(4));
    }

    public boolean isValid(List<Integer> sortedList) {
        int size = sortedList.size();
        if (size < 3) {
            return true;
        }
        for (int i = 0; i < size - 2; i++) {
            if (sortedList.get(i + 2) - sortedList.get(i) <= 60) {
                return false;
            }
        }
        return true;
    }
}
