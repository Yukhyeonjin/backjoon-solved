package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15734 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int L = Integer.parseInt(input[0]),
                R = Integer.parseInt(input[1]),
                A = Integer.parseInt(input[2]),
                sum;
        if (L > R) {
            if (R + A > L) {
                A = A - (L - R);
                R = L;
            } else {
                R += A;
                A = 0;
                L = R;
            }
        } else if (R > L) {
            if (L + A > R) {
                A = A - (R - L);
                L = R;
            } else {
                L += A;
                A = 0;
                R = L;
            }
        }
        if (A % 2 == 1) {
            A -= 1;
        }
        //bw.write("L : " + L + " R : " + R + " A : " + A + "\n");
        sum = L+R+A;
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

