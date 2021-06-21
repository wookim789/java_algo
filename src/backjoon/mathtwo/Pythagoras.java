package backjoon.mathtwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pythagoras {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            List<Integer> nList = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            if(nList.stream().mapToInt(x->x).sum() == 0){
                break;
            }

            int max = nList.stream()
                    .mapToInt(x -> x)
                    .max()
                    .orElseThrow(RuntimeException::new);

            int pythagoras = max * max;
            for(Integer n : nList){
                if(n != max){
                    pythagoras -= n * n;
                }
            }
            if(pythagoras == 0){
                bw.write("right\n");
            }else{
                bw.write("wrong\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}