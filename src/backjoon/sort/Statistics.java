package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Main{
public class Statistics {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] pArr = new int[4001];
        int [] mArr = new int[4001];

        for(int i = 0; i < n; i++){
            int ele = Integer.parseInt(br.readLine());
            if(ele >= 0){
                pArr[ele] += 1;
            }else{
                mArr[ele * (-1)] += 1;
            }
        }

        int avg = 0;
        for(int i = 0; i < 4001; i++){
            avg += (mArr[i] * i * (-1) + pArr[i] * i);
        }
        System.out.println(Math.round((float) avg / (float) n));

        int midIdx = n / 2 + 1;
        Integer midValue = null;
        for(int i = 4000; i > 0; i--){
            if(midIdx - mArr[i] == 0){
                midValue = i;
                break;
            }
            midIdx -= mArr[i];
        }

        for(int i = 0; i < 4001; i++){
            if(midValue != null && midIdx == 0) {
                System.out.println(midValue);
                break;
            }else if (midIdx - pArr[i] == 0){
                System.out.println(i);
                break;
            }
            midIdx -= pArr[i];
        }

        int cntIdx = 0;
        int maxVal = 0;
        int result = 0;
        for(int i = mArr.length - 1; i > 0 ; i--){
            if(mArr[i] > maxVal){
                maxVal = mArr[i];
                cntIdx = 1;
                result = i * (-1);
            }else if(mArr[i] == maxVal && cntIdx < 2){
                cntIdx ++;
                result = i * (-1);
            }
        }

        for(int i = 0; i < pArr.length; i++){
            if(pArr[i] > maxVal){
                maxVal = pArr[i];
                cntIdx = 1;
                result = i;
            }else if(pArr[i] == maxVal && cntIdx < 2){
                cntIdx ++;
                result = i;
            }
        }
        System.out.println(result);

        Integer mMin = 0;
//        Integer mMax = 0;
//        Integer pMin = 0;
        Integer pMax = 0;
        for(int i = 4000; i > 0; i--){
            if(mArr[i] > 0 && i * (-1) < mMin){
                mMin = i * (-1);
            }
            if(pArr[i] > 0 && i > pMax){
                pMax = i;
            }
        }

        if(mMin != 0 && pMax != 0){
            System.out.println(pMax - mMin);
            return;
        }

//        for(int i = 0; i < 4001; i++){
//            if(mArr[i] > 0 && i * (-1) )
//        }
    }
}
