package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32089 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {

            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            String input[] = br.readLine().split(" ");
            int max = Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + Integer.parseInt(input[2]);
            int sum = max;
            for (int i = 3; i < n; i ++){
                sum = sum + Integer.parseInt(input[i]) - Integer.parseInt(input[i - 3]);
                max = Math.max(max, sum);
            }
            bw.write(max+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

