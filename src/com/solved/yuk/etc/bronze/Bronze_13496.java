package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13496 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i ++){
            String input[] = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int s = Integer.parseInt(input[1]);
            int d = Integer.parseInt(input[2]);
            int ans = 0;
            for (int j = 0; j < n; j ++){
                input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                if(s * d >= a) ans += b;
            }
            bw.write("Data Set " + i + ":\n" + ans + "\n\n");
        }



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

