package backjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < n; i++){
            treeMap.put(Integer.parseInt(br.readLine()), null);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Map.Entry entry : treeMap.entrySet()){
            bw.write(entry.getKey() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
