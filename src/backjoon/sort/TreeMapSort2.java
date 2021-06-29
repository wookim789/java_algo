package backjoon.sort;

import java.io.*;
import java.util.*;

//public class Main {
public class TreeMapSort2 {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        while(n > 0){
            list.add(Integer.parseInt(br.readLine()));
            n--;
        }
        br.close();

        list.sort(null);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Integer x : list){
            bw.write(x + "\n");
        }
        bw.flush();
        bw.close();
    }
}
