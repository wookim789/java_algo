package backjoon.mathtwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Square {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        int i = 0;
        while(i < 3){
            String[] nArr = br.readLine().split(" ");
            Integer x = xMap.get(nArr[0]);
            Integer y = yMap.get(nArr[1]);

            if(x == null){
                xMap.put(nArr[0], 1);
            }else{
                xMap.put(nArr[0], x + 1);
            }

            if (y == null){
                yMap.put(nArr[1], 1);
            }else{
                yMap.put(nArr[1], y + 1);
            }
            i++;
        }
        br.close();

        for(Map.Entry<String, Integer> entry: xMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
                break;
            }
        }
        for(Map.Entry<String, Integer> entry: yMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
                break;
            }
        }
    }
}
