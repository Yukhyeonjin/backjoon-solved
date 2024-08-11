package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26350 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int[] arr = new int[m];
            int good = 1;
            for(int j = 0; j < m; j++){
                arr[j] = Integer.parseInt(input[j+1]);
            }
            bw.write("Denominations: ");
            for(int j = 0; j < m; j++){
                bw.write(arr[j] + " ");
            }
            for(int j = 0; j < m - 1; j++) {
                if(2 * arr[j] > arr[j + 1]) {
                    good = 0;
                }
            }
            bw.newLine();
            if(good == 1) {
                bw.write("Good coin denominations!\n");
            }else {
                bw.write("Bad coin denominations!\n");
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