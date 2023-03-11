package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        bw.write(n*n + "\n2");
        //bw.write(MenOfPassion(n)+"\n2");


        bw.flush();
        br.close();
        bw.close();
    }

    public static int MenOfPassion(int n) {
        int count = 0;
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= n; j ++){
//                sum = sum + A[i] * A[j];
                count++;
            }
        }
//        int[] result = {sum, count};
        return count;
    }
}


