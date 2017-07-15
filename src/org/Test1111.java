package org;

import java.util.HashMap;

/**
 * Created by legendhu on 17-6-2.
 */

public class Test1111 {
    public static void main(String[] args) {
        HashMap<String,String> map1=new HashMap();
        map1.put("a","xm");
        map1.put("b","xj");
        map1.put("c","xx");
        map1.put("d","xm");
        map1.put("e","xm");
        map1.put("f","xm");
        map1.put("aa","xm");
        map1.put("bb","xj");
        map1.put("cc","xx");
        map1.put("dd","xm");
        map1.put("ee","xm");
        map1.put("ff","xm");
        map1.put("aaa","xm");
        map1.put("bbb","xj");
        map1.put("ccc","xx");
        map1.put("ddd","xm");
        map1.put("eee","xm");
        map1.put("fff","xm");
        for(String i:map1.keySet()){
            System.out.println(i+map1.get(i));
        }
    }
}
