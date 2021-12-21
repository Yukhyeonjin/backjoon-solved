package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), // 목표 운동 시간
            m = Integer.parseInt(input[1]), // 최소 맥박, 초기 맥박
            M = Integer.parseInt(input[2]), // 최대 맥박
            T = Integer.parseInt(input[3]), // 운동 1분당 증가 하는 맥박
            R = Integer.parseInt(input[4]); // 휴식 1분당 감소 하는 맥박
        int pulse = m, restMinute = N, countMinute = 0; // 맥박, 남은 운동 시간
        if(pulse + T > M){
            bw.write("-1");
        }else {
            while (restMinute != 0){
                if(pulse + T <= M){
                    pulse += T;
                    restMinute --;
                    countMinute ++;
                    continue;
                }else{
                    pulse -= R;
                    if(pulse <= m) pulse = m;
                    countMinute++;
                }
            }
            bw.write(countMinute+"");
        }

        bw.flush();
        bw.close();
    }
}
