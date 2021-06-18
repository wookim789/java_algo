package backjoon.mathtwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EscapeSquare {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nList = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        br.close();

        int vp = Math.abs(nList.get(0) - nList.get(2));
        int hp = Math.abs(nList.get(1) - nList.get(3));
        int v = nList.get(0) < vp ? nList.get(0) : vp;
        int h = nList.get(1) < hp ? nList.get(1) : hp;

        if(v < h){
            System.out.println(v);
        }else{
            System.out.println(h);
        }
    }
}
