package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(br.readLine()), sum = 0;
            if(num == 0) break;
            for(int i=1;i<=num;i++){
                sum += i*i;
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
