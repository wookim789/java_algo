package backjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class WordSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> strList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            strList.add(br.readLine());
        }

        strList.stream().sorted();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String str : strList){
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
