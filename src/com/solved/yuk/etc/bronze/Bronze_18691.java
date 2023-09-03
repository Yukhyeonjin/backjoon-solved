package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18691 {

    static int result = 0;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int g = Integer.parseInt(input[0]),
                c = Integer.parseInt(input[1]),
                e = Integer.parseInt(input[2]), r;
            if (g == 1) r = e-c;
            else if (g == 2) r = 3 * (e-c);
            else r = 5 * (e-c);

            if(r <= 0 ) bw.write("0\n");
            else bw.write(r+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

