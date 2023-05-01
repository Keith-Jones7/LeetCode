package Exercises.First_Easy;
import java.util.*;
//1773 统计匹配检索规则的物品数量
public class count_items_matching_a_rule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 2;
        if (ruleKey.equals("type")) {
            index = 0;
        }else if (ruleKey.equals("color")) {
            index = 1;
        }

        int count = 0;
        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
