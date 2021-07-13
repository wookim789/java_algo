package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Statistics {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 계수 배열은 2개로 각각 정렬
        // 음의 배열과 양의 배열
        int [] pArr = new int[4001];
        int [] mArr = new int[4001];

        for(int i = 0; i < n; i++){
            int ele = Integer.parseInt(br.readLine());
            // 0은 양의 배열에 저장한다
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

        // 중앙값 인덱스 = n / 2 + 1
        // 배열 순회하면서 0이 아닌 인덱스의 인자값 -> n - 인자값
        // 0인 지점 출력

        int midIdx = n / 2 + 1;
        Integer midValue = null;
        for(int i = 4000; i > 0; i--){
            if(midIdx - mArr[i] == 0){
                midValue = i;
                break;
            }
            midIdx -= mArr[i];
        }

        for(int i = 0; i < 4000; i++){
            if(midValue != null && midIdx == 0) {
                System.out.println(midValue);
                break;
            }else if (midIdx - pArr[i] == 0){
                System.out.println(i);
                break;
            }
            midIdx -= pArr[i];
        }

        boolean isMinusSecondMin = false;
        int minusMostValue = 0;
        for(int i = 0; i < 4000; i++){
            if(mArr[i] > minusMostValue){
                isMinusSecondMin = false;
                minusMostValue = i * (-1);
            }else if(!isMinusSecondMin && mArr[i] == minusMostValue){
                isMinusSecondMin = true;
                minusMostValue = i * (-1);
            }
        }

        int plustMostValue = 0;
        for(int i = 0; i < 4000; i++){
            if(pArr[i] > plustMostValue){
                isMinusSecondMin = false;
                plustMostValue = i;
            }else if(!isMinusSecondMin && pArr[i] == plustMostValue){
                isMinusSecondMin = true;
                plustMostValue = i;
            }
        }

        if(minusMostValue > plustMostValue){
            System.out.println(minusMostValue);
        }else if (minusMostValue < plustMostValue){
            System.out.println(plustMostValue);
        }else if (isMinusSecondMin){
            System.out.println(minusMostValue);
        }else{
            System.out.println(plustMostValue);
        }

        Integer min = null;
        Integer max = null;
        for(int i = 4000; i > 0; i--){
            if(min == null && mArr[i] != 0){
                min = i;
            }
            if(max == null && pArr[i] != 0){
                max = i;
            }
            if(min != null && max != null){
                System.out.println(max + min);
                break;
            }
        }
    }
}
