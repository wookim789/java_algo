package backjoon.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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

        // 산술 평균
        int result = 0;
        for(int i = 1; i < mArr.length; i++){
            result += mArr[i] * i * (-1);
            result += pArr[i] * i;
        }
        System.out.println(Math.round((float)result / (float) n));

        // 중앙값
        boolean isResult = false;
        int midIdx = n / 2 + 1;
        for(int i = 4000; i > 0; i--){
            for(int tmp = mArr[i]; tmp > 0; tmp--){
                if(midIdx > 1){
                    midIdx--;
                }else if (midIdx == 1){
                    result = i * (-1);
                    isResult = true;
                    i = 0;
                    break;
                }
            }
        }
        if(!isResult){
            for(int i = 0; i < 4001; i++){
                for(int tmp = pArr[i]; tmp > 0; tmp--){
                    if(midIdx > 1){
                        midIdx--;
                    }else if (midIdx == 1){
                        result = i;
                        i = 4000;
                        break;
                    }
                }
            }
        }
        System.out.println(result);

        // 최빈값 같은 값이 여러개 -> 2번째로 작은 값 출력
        int maxNum = 0;
        boolean isSecond = false;
        result = 0;

        for(int i = 4000; i > 0; i--){
            if(mArr[i] > maxNum){
                result = i * (-1);
                maxNum = mArr[i];
                isSecond = true;
            }else if (mArr[i] == maxNum && isSecond){
                result = i * (-1);
                isSecond = false;
            }
        }
        for(int i = 0; i < 4001; i++){
            if(pArr[i] > maxNum){
                result = i;
                maxNum = pArr[i];
                isSecond = true;
            }else if(pArr[i] == maxNum && isSecond){
                result = i;
                isSecond = false;
            }
        }
        System.out.println(result);

        int min = 4001;
        int max = -4001;

        for(int i = 4000; i > 0; i--){
            if(mArr[i] > 0 && i * (-1) < min){
                min = i * (-1);
            }
            if(mArr[i] > 0 && i * (-1) > max){
                max = i * (-1);
            }
        }
        for(int i = 0; i < 4001; i++){
            if(pArr[i] > 0 && i < min){
                min = i;
            }
            if(pArr[i] > 0 && i > max){
                max = i;
            }
        }
        System.out.println(max - min);
    }
}
