package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
//public class CordinateCompress {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        List<Integer> xList = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        SortedSet<Integer> xSet = new TreeSet<>();
        for(Integer x : xList){
            xSet.add(x);
        }

        String result = "";
        for(Integer x : xList){
            result = result + xSet.headSet(x).size() + " ";
        }

        System.out.println(result);
    }
}
