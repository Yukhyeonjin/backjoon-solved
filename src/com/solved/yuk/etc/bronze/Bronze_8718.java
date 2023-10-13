package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8718 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]),
            k = Integer.parseInt(input[1]);
        int a=0, b=0, c=0;
        if(7000 * k <= 1000 * x) a = 7000 * k;
        if(3500 * k <= 1000 * x) b = 3500 * k;
        if(1750 * k <= 1000 * x) c = 1750 * k;
        bw.write(Math.max(a, Math.max(b, c))+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

