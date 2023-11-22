package Exercises.Second_Medium;

import java.util.*;

//1410 HTML实体解析器
public class html_entity_parser {
    public String entityParser(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        int index = 0;
        while (index < text.length()) {
            char ch = text.charAt(index);
            if (ch == '&') {
                boolean flag = false;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (index + key.length() <= text.length() && text.startsWith(key, index)) {
                        index += key.length();
                        stringBuilder.append(value);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    stringBuilder.append("&");
                    index++;
                }
            }else {
                stringBuilder.append(text.charAt(index++));
            }
        }
        return stringBuilder.toString();
    }
}
