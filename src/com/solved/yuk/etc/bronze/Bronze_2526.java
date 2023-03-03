package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2526 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
                P = Integer.parseInt(input[1]),
                result = N,
                count = 0;
        int[] arr = new int[P+1];
        while (true) {
            result = result*N%P;
            arr[result]++;
            if(arr[result] == 3) break;
            else if(arr[result] == 2) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
