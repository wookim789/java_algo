package backjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class TwoDimension {
    public static void main(String [] agrs) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        SortedSet<Integer> xSet = new TreeSet<>();
        Map<String, SortedSet<Integer>> yMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String[] strArr = br.readLine().split(" ");
            int x = Integer.parseInt(strArr[0]);
            xSet.add(x);
            String xKey = Integer.toString(x);

            int y = Integer.parseInt(strArr[1]);
            if(yMap.get(xKey) == null){
                SortedSet<Integer> ySet = new TreeSet<>();
                yMap.put(xKey, ySet);
            }
            yMap.get(xKey).add(y);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(Integer x : xSet){
            SortedSet<Integer> ySet = yMap.get(Integer.toString(x));
            if(ySet != null && !ySet.isEmpty()){
                for(Integer y : ySet){
                    bw.write(x + " " + y + "\n");
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
