package backjoon.mathtwo;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Eretenethos3 {
    public static void main(String [] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        br.close();

        if(list.get(1) == 1){
            return;
        }

        int[] primeArr = new int[list.get(1) + 1];
        primeArr[1] = 1;
        for(int i = 2; i < list.get(1); i++){
            for(int j = 2; j < list.get(1); j++){
                if(i * j >= primeArr.length){
                    break;
                }
                primeArr[i*j] = 1;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int k = 1; k < primeArr.length; k++){
            if(primeArr[k] != 1 && k >= list.get(0) && k <= list.get(1)){
                bw.write(k + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
