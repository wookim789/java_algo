package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SnailMountTree {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int a = list.get(0);
        int b = list.get(1);
        int v = list.get(2);

        int result = (v-b)/(a-b);
        if((v-b)%(a-b) > 0){
            System.out.println(result + 1);
        }else{
            System.out.println(result);
        }
    }
}