package Exercises.Second_Medium;

import java.util.*;

//535 TinyURL的加密与解密
public class encode_and_decode_tinyurl {
    private Map<Integer, String> map = new HashMap<>();
    int id = 0;
    public String encode(String longUrl) {
        map.put(id, longUrl);
        id++;
        return id + "";
    }

    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl));
    }
}
