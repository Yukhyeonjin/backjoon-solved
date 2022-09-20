package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        Map<Integer, Integer> cowMap = new HashMap<>();
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            int cowNum      = Integer.parseInt(input[0]),
                cowPosition = Integer.parseInt(input[1]);
            if(cowMap.get(cowNum) != null){
                int preCowPosition = cowMap.get(cowNum);
                count = cowPosition != preCowPosition ? count+1 : count;
            }
            cowMap.put(cowNum, cowPosition);
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
