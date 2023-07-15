package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17945 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // x^2 + 2Ax + B = 0
        // x(x+2A) = -B
        String input[] = br.readLine().split(" ");
        int A = 2*Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]);
        double sqrt = Math.sqrt((A * A) - (4 * B));
        int x1 =  (int)(-A + sqrt) /2;
        int x2 =  (int)(-A - sqrt) /2;
        if(x1 > x2) bw.write(x2 + " " + x1);
        else if(x1 < x2) bw.write(x1 + " " + x2);
        else bw.write(x1+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
