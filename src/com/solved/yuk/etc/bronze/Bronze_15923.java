package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15923 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), x, y, firstX, firstY, sum = 0;
        String input[];

        input = br.readLine().split(" ");
        x = firstX = Integer.parseInt(input[0]);
        y = firstY = Integer.parseInt(input[1]);
        for (int i = 1; i < N; i ++){
            input = br.readLine().split(" ");
            sum += Math.abs(x - Integer.parseInt(input[0]));
            sum += Math.abs(y - Integer.parseInt(input[1]));

            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
        }
        sum += Math.abs(firstX - x);
        sum += Math.abs(firstY - y);
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

