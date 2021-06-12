package backjoon.mathtwo;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//public class Main {
public class Eretenethos3 {
    public static void main(String [] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 링크드리스트 에레테너스 채 이옹



//
//        if(list.get(1) == 1){
//            return;
//        }else if(list.get(0) <= 2){
//            bw.write(2 + "\n");
//        }
//
//        List<Integer> primeList = new ArrayList<>(Arrays.asList(2));
//
//        for(int i = 2; i < list.get(1); i++){
//            for(int pdx = 0; pdx < primeList.size(); pdx++){
//                if(i % primeList.get(pdx) == 0){
//                    break;
//                }else if(i % primeList.get(pdx) != 0 && primeList.get(pdx) > i / 2) {
//                    primeList.add(i);
//                    if(list.get(0) <= i && i <= list.get(1)){
//                        bw.write(i + "\n");
//                    }
//                    break;
//                }
//            }
//        }
//        bw.flush();
//        bw.close();
//    }
}

// 1 2 4 5 10 10 20 25 50 100