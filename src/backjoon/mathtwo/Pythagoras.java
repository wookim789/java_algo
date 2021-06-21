package backjoon.mathtwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
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

            nList.sort(Comparator.naturalOrder());
            int max = nList.get(nList.size() - 1);

            if(max * max - nList.get(0) * nList.get(0) - nList.get(1) * nList.get(1) == 0){
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