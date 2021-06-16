package backjoon.mathtwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Eretenethos4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nList = new ArrayList<>();

        int i = Integer.parseInt(br.readLine());
        int max = 0;

        while(i > max){
            max = i;
            nList.add(i);
            i = Integer.parseInt(br.readLine());
        }
        br.close();

        max = max * 2;
        int[] ereArr = new int[max + 1];

        ereArr[0] = 1;
        ereArr[1] = 1;

        for(int idx = 2; idx < max; idx++){
            for(int jdx = 2; jdx < max; jdx++){
                if(idx * jdx <= max){
                    ereArr[idx * jdx] = 1;
                }else{
                    break;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(Integer n : nList){
            int result = 0;
            for(int jdx = n + 1; jdx <= n * 2; jdx++){
                if(ereArr[jdx] != 1){
                    result++;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}