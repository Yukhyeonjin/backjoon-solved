package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_16917 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]),
            X = Integer.parseInt(input[3]),
            Y = Integer.parseInt(input[4]),
            count = 0;

        if ((A + B) <= C * 2) {//case 1
            count += (A * X) + (B * Y);
        } else {//case 2
            if (X > Y) {//case 2-1
                count += Y * (C * 2);
                count += Math.min((X - Y) * A, (X - Y) * (C * 2));
            } else {//case 2-2
                count += X * (C * 2);
                count += Math.min((Y - X) * B, (Y - X) * (C * 2));
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
