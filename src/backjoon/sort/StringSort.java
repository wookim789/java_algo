package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StringSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, SortedSet<String>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String str = br.readLine();

            Integer idx = str.length();
            if(map.get(idx) != null){
                map.get(idx).add(str);
            }else{
                SortedSet<String> set = new TreeSet<>();
                set.add(str);
                map.put(idx, set);
            }
        }

        for(int i = 1; i <= 20000; i++){
            if(map.get(i) != null){
                SortedSet<String> list = map.get(i);
                list.forEach(s-> System.out.println(s));
            }
        }
    }
}
