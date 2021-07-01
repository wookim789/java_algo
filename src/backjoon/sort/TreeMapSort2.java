package backjoon.sort;

import java.io.*;
import java.util.*;

//public class Main {
public class TreeMapSort2 {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(Integer.parseInt(br.readLine()));
//test
        while (n - 1 > 0){
            int ele = Integer.parseInt(br.readLine());

            for(int i = 0; i < linkedList.size(); i++){
                if(linkedList.get(i) >= ele){
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
