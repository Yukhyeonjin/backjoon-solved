package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        // input = 1 -> 1칸
        // 1 < input <= 7(+6) -> 2칸
        // 7 < input <= 19(+12) -> 2칸
        // 19 < input <= 37(+18) -> 3칸
        int output = 1;
        int n = 1;
        int i  = 1;
        while (true) {
            if(input == 1) break;
            if(i < input && input <= i+(6*n)) {
                output = n+1;
                break;
            }
            i = i+(6*n);
            n++;
        }
        bw.write(Integer.toString(output));

        bw.flush();
        bw.close();
    }
}
