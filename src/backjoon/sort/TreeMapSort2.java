package backjoon.sort;

import java.io.*;

public class TreeMapSort2 {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10000 + 1];

        for(int i = 1; i < n + 1; i++){
            arr[Integer.parseInt(br.readLine())] += 1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i < 10000 + 1; i++){
            while(arr[i] > 0){
                bw.write(i + "\n");
                arr[i]--;
            }
        }

        bw.flush();
        bw.close();
    }
}
