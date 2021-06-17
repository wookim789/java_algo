package backjoon.mathtwo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GoldBach {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        List<Integer> nList = new ArrayList<>();

        int max = 0;

        while(t > 0){
            int cur = Integer.parseInt(br.readLine());
            if(cur > max){
                max = cur;
            }
            nList.add(cur);
            t--;
        }
        br.close();

        int[] ereArr = new int[max + 1];

        ereArr[0] = 1;
        ereArr[1] = 1;

        for(int idx = 2; idx < max; idx ++){
            for(int jdx = 2; jdx < max; jdx++){
                if(idx * jdx <= max){
                    ereArr[idx * jdx] = 1;
                }else{
                    break;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (Integer n : nList) {
            int rdx = n / 2;
            for (int ldx = n / 2; ldx > 0; ldx--) {
                if (ereArr[ldx] != 1 && ereArr[rdx] != 1) {
                    bw.write(ldx + " " + rdx + "\n");
                    break;
                }else{
                    rdx++;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
