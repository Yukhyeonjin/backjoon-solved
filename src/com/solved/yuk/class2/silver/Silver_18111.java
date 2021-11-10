package com.solved.yuk.class2.silver;

import java.io.*;

public class Silver_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
                M = Integer.parseInt(input[1]),
                B = Integer.parseInt(input[2]);
        int minLength = 257, maxLength = -1, block;
        int[][] map = new int[N][M];
        for(int n = 0; n < N; n ++){
            input = br.readLine().split(" ");
            for(int m = 0; m < M; m ++){
                block = Integer.parseInt(input[m]);
                map[n][m] = block;
                minLength = Math.min(block, minLength);
                maxLength = Math.max(block, maxLength);
            }
        }
        int minSeconds = Integer.MAX_VALUE;
        int height = -1;
        // 최대 ~ 최소 구간까지 각 블록마다 블록을 제거하거나 더하는 모든 경우를 생각하고 이 후에 가방이 0 이상이면 최소시간 계산, 가방이 0보다 낮으면 조건X 넘어간다.
        for(int floor = minLength; floor <= maxLength; floor++){
            int seconds = 0;
            int blockCase = B;
            for(int n = 0; n < N; n ++){
                for(int m = 0; m < M; m ++){
                    int diff = map[n][m] - floor;
                    if(diff > 0){ // 제거(2초, 블록 +1)
                        seconds += diff*2;
                        blockCase += diff;
                    }else if(diff < 0){ // 추가(1초, 블록 -1)
                        seconds += Math.abs(diff);
                        blockCase += diff;
                    }
                }
            }
            if(blockCase >= 0){
                minSeconds = Math.min(seconds, minSeconds);
                height = seconds <= minSeconds ? floor : height;
            }

        }
        bw.write(minSeconds + " " + height);

        bw.flush();
        bw.close();
    }
}
