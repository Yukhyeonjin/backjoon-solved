package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        while (true){
            int inputNum = Integer.parseInt(br.readLine());
            if(inputNum == -1) break;
            sum += inputNum;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
