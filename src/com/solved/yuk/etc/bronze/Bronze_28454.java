package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28454 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("-");
        int nowYear = Integer.parseInt(input[0]);
        int nowMonth = Integer.parseInt(input[1]);
        int nowDay = Integer.parseInt(input[2]);
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i ++){
            input = br.readLine().split("-");
            int year = Integer.parseInt(input[0]);
            int month = Integer.parseInt(input[1]);
            int day = Integer.parseInt(input[2]);
            if(nowYear < year) cnt++;
            else if (nowYear == year && nowMonth < month) cnt++;
            else if (nowYear == year && nowMonth == month && nowDay <= day) cnt++;
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}