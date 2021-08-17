package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
//public class CordinateCompress {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String[] xArr = br.readLine().split(" ");

        List<Integer> xList = new ArrayList<>();
        for(String x : xArr){
            xList.add(Integer.parseInt(x));
        }

        xList.stream().sorted();
        List<Integer> setList = new ArrayList<>();

        for(Integer i : xList){
            if(!setList.isEmpty() && !setList.get(setList.size()-1).equals(i)){
                setList.add(i);
            }else if(setList.isEmpty()){
                setList.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(String i : xArr){
            sb.append(setList.indexOf(Integer.parseInt(i))).append(" ");
        }
        System.out.println(sb);
    }
}
