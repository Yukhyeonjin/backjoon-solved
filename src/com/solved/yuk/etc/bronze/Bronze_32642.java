package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32642 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long sum = 0;
        int isRain = Integer.parseInt(input[0]);
        long nowAngryPoint = isRain == 0 ? -1 : 1;
        sum += nowAngryPoint;
        for (int i = 1; i < input.length; i++){
            isRain = Integer.parseInt(input[i]);
            if (isRain == 1) {
                nowAngryPoint += 1;
            }
            else {
                nowAngryPoint -= 1;
            }
            sum += nowAngryPoint;
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}