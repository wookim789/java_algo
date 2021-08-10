package backjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OldSort {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String row = br.readLine();
            String [] rowArr = row.split(" ");

            if(map.get(Integer.parseInt(rowArr[0])) == null){
                List<String> list = new ArrayList<>();
                list.add(rowArr[1]);
                map.put(Integer.parseInt(rowArr[0]), list);
            }else{
                map.get(Integer.parseInt(rowArr[0])).add(rowArr[1]);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i <= 200; i++){
            List<String> list = map.get(i);
            if(list != null){
                for(String row : list){
                    bw.write(i + " " + row + "\n");
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
