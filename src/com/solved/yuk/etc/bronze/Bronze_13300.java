package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            K = Integer.parseInt(input[1]), arr[][] = new int[6][2];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int S = Integer.parseInt(input[0]),
                Y = Integer.parseInt(input[1]);
            arr[Y-1][S]++;
        }
        int sum = 0;
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 2; j ++){
                //bw.write((j+1) + "학년 " + (j == 0 ? "여자 " : "남자 ") + arr[i][j] + "명\n");
                if(arr[i][j] != 0 && arr[i][j] <= K){
                    sum+=1;
                }
                else {
                    sum += arr[i][j] / K;
                    if(arr[i][j] % K > 0) sum+=1;
                }
                //bw.write(sum+"\n");
            }
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
