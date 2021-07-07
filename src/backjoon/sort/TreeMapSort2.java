package backjoon.sort;

import java.io.*;
import java.util.*;

public class Main {
//public class TreeMapSort2 {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();
        while (n - 1 > 0){
            int ele = Integer.parseInt(br.readLine());
            int lp = 0;
            int rp = linkedList.size();
            int i = (lp + rp) / 2;
            while(true){
                if(lp >= rp){
                    linkedList.add(lp, ele);
                    break;
                }

                if(linkedList.get(i) > ele){
                    rp = i;
                    i = (lp + rp) / 2;
                }else if(linkedList.get(i) < ele){
                    lp = i + 1;
                    i = (lp + rp) / 2;
                }else{
                    linkedList.add(i, ele);
                    break;
                }
            }
            n--;
        }

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Integer x : linkedList){
            bw.write(x + "\n");
        }
        bw.flush();
        bw.close();
    }
}
