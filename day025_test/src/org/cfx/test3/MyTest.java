package org.cfx.test3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author RTX 9090
 * 3. 用户输入一个字符串"goodgoodstudy"，记录字符串中每个字符的个数【提示：利用Map】（5分）
 */
public class MyTest {
    public static void main(String[] args) {
        String str = "goodgoodstudy";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
