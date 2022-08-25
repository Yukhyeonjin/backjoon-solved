package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), num = 1;
        while(true){
            if( N == num ) {
                bw.write("1");
                break;
            }
            else if (num > N) {
                bw.write("0");
                break;
            }
            num *= 2;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
