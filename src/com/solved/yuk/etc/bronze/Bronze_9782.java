package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9782 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int count = 0;
        while (!"0".equals(input = br.readLine())) {
            String arr[] = input.split(" ");
            int n = Integer.parseInt(arr[0]);
            int a[] = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(arr[i+1]);
            }
            count++;
            if(n % 2 == 0) {
                bw.write("Case " + count + ": " + (double)(a[n / 2 - 1] + a[n / 2]) / 2);
            }else {
                bw.write("Case " + count + ": " + (double)a[(n - 1) / 2]);
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

