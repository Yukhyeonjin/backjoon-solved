package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]),
            D = Integer.parseInt(input[3]);
        input = br.readLine().split(" ");
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(input[0]);
        arr[1] = Integer.parseInt(input[1]);
        arr[2] = Integer.parseInt(input[2]);
        for (int value : arr) {
            int count = 0;
            count += countCase(A, B, value);
            count += countCase(C, D, value);
            bw.write(count + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static int countCase(int attack, int rest, int num) {
        while (true) {
            if (num <= attack) {
                return 1;
            } else {
                num -= attack;
            }
            if (num <= rest) {
                break;
            } else {
                num -= rest;
            }
        }
        return 0;
    }
}

