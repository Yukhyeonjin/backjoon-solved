package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int S1 = Integer.parseInt(input[0]), // 2 ~ 20
            S2 = Integer.parseInt(input[1]), // 2 ~ 20
            S3 = Integer.parseInt(input[2]); // 2 ~ 40
        int min = 81, maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= S1; i ++){
            for(int j = 1; j <= S2; j ++) {
                for(int k = 1; k <= S3; k ++){
                    int sum = i+j+k,
                        count = map.get(sum) == null ? 1 : map.get(sum)+1;
                    if(count > maxCount){
                        maxCount = count;
                        min = sum;
                    }
                    if(count == maxCount){
                        min = Math.min(min, sum);
                    }
                    map.put(sum, count);
                }
            }
        }
        bw.write(min+"");

        bw.flush();
        bw.close();
    }
}
